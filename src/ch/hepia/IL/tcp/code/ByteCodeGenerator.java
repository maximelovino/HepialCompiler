package ch.hepia.IL.tcp.code;

import java.util.HashMap;

import ch.hepia.IL.tcp.SymbolTable;
import ch.hepia.IL.tcp.tree.AbstractTree;
import ch.hepia.IL.tcp.tree.Addition;
import ch.hepia.IL.tcp.tree.And;
import ch.hepia.IL.tcp.tree.Assignment;
import ch.hepia.IL.tcp.tree.Binary;
import ch.hepia.IL.tcp.tree.BitNot;
import ch.hepia.IL.tcp.tree.Block;
import ch.hepia.IL.tcp.tree.BoolValue;
import ch.hepia.IL.tcp.tree.Call;
import ch.hepia.IL.tcp.tree.Condition;
import ch.hepia.IL.tcp.tree.Different;
import ch.hepia.IL.tcp.tree.Division;
import ch.hepia.IL.tcp.tree.Equal;
import ch.hepia.IL.tcp.tree.For;
import ch.hepia.IL.tcp.tree.Idf;
import ch.hepia.IL.tcp.tree.InfEqual;
import ch.hepia.IL.tcp.tree.Inferior;
import ch.hepia.IL.tcp.tree.Instruction;
import ch.hepia.IL.tcp.tree.Not;
import ch.hepia.IL.tcp.tree.NumberValue;
import ch.hepia.IL.tcp.tree.Or;
import ch.hepia.IL.tcp.tree.Product;
import ch.hepia.IL.tcp.tree.QualifiedCall;
import ch.hepia.IL.tcp.tree.Read;
import ch.hepia.IL.tcp.tree.Substraction;
import ch.hepia.IL.tcp.tree.SupEqual;
import ch.hepia.IL.tcp.tree.Superior;
import ch.hepia.IL.tcp.tree.While;
import ch.hepia.IL.tcp.tree.Write;

public class ByteCodeGenerator implements Visitor {

	private static ByteCodeGenerator instance;
    private StringBuilder target;
    private int nextLocal = 0;
    private HashMap<String, Integer> locals;
    
    private ByteCodeGenerator() {
    	locals = new HashMap<>();
    	target = new StringBuilder();
    	target.append(".class public simple\n"
    			+ ".super java/lang/Object\n"
    			+ ".method public <init>()V\n"
    			+ "aload_0 \n"
    			+ "invokespecial java/lang/Object/<init>()V \n"
    			+ "return\n"
    			+ ".end method\n"
    			+ ".method public static main([Ljava/lang/String;)V\n"
    			+ ".limit stack "+SymbolTable.getInstance().getSize()+"\n"
    			+ ".limit locals "+SymbolTable.getInstance().getSize()*2+"\n");
	}
    
    public void Generate(AbstractTree t) {
    	t.accept(this);
    	appendln("return");
    	appendln(".end method"); //TODO Consider other functions
    	System.out.println(target.toString());
    }
    
	public static ByteCodeGenerator getInstance() {
		if(instance == null) instance = new ByteCodeGenerator();
		return instance;
	}
	
	public void appendln(String ln) {
		target.append(ln).append("\n");
	}
	
	public void visitBinary(Binary b) {
		Object l = b.getLeft().accept(this);
		Object r = b.getRight().accept(this);
		if(l != null) {
			appendln("iload "+(Integer)l);
		} 
		if(r != null) {
			appendln("iload "+(Integer)r);
		}
	}
	
	@Override
	public Object visit(Addition a) {
		visitBinary(a);
		appendln("iadd");
		return null;
	}

	@Override
	public Object visit(And a) {
		visitBinary(a);
		appendln("iand");
		return null;
	}

	@Override
	public Object visit(Assignment a) {
		Object local = a.getDest().accept(this);
		a.getSource().accept(this);
		appendln("istore "+((Integer)local).intValue());
		return null;
	}

	@Override
	public Object visit(BitNot b) {
		Object r = b.getRight().accept(this);
		if(r != null) {
			appendln("iload "+(Integer)r);
		}
		appendln("ineg");
		appendln("ldc 1");
		appendln("isub");
		return null;
	}

	@Override
	public Object visit(Block b) {
		for (Instruction i : b.getInstructions()) {
			i.accept(this);
		}
		return null;
	}

	@Override
	public Object visit(BoolValue b) {
		if(b.isValue()) {
			appendln("ldc 1");
		} else {
			appendln("ldc 0");
		}
		return null;
	}

	@Override
	public Object visit(Call c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Condition c) {
		Object cnd = c.getCondition().accept(this);
		
		appendln(((String)cnd)+" if"+c.hashCode()+"_then");
		appendln("goto if"+c.hashCode()+"_else");
		
		appendln("if"+c.hashCode()+"_then:");
		for (Instruction i : c.getThen()) {
			i.accept(this);
		}
		appendln("goto endif"+c.hashCode());
		appendln("if"+c.hashCode()+"_else:");
		for (Instruction i : c.get_else()) {
			i.accept(this);
		}
		appendln("endif"+c.hashCode()+":");
		return null;
	}

	@Override
	public Object visit(Different d) {
		visitBinary(d);
		appendln("isub");
		return "ifne";
	}

	@Override
	public Object visit(Division d) {
		visitBinary(d);
		appendln("idiv");
		return null;
	}

	@Override
	public Object visit(Equal e) {
		visitBinary(e);
		appendln("isub");
		return "ifeq";
	}

	@Override
	public Object visit(For f) {
		Integer local = (Integer)f.getIdf().accept(this);
		f.getInfLimit().accept(this);
		appendln("istore "+local.intValue());
		appendln("for"+f.hashCode()+":");
		appendln("iload "+local.intValue());
		f.getSupLimit().accept(this);
		
		appendln("isub");
		appendln("ifgt endfor"+f.hashCode());
		
		for (Instruction i : f.getInstructions()) {
			i.accept(this);
		}
		appendln("ldc 1");
		appendln("iload "+local.intValue());
		appendln("iadd");
		appendln("istore "+local.intValue());
		appendln("goto for"+f.hashCode());
		
		appendln("endfor"+f.hashCode()+":");
 		return null;
	}

	@Override
	public Object visit(Idf i) {
		if(!locals.containsKey(i.getName())) {
			i.setLocal(nextLocal);
			locals.put(i.getName(), nextLocal);
			nextLocal++;
		} else if(i.getLocal() == -1) {
			i.setLocal(locals.get(i.getName()));
		}
		return new Integer(i.getLocal());
	}

	@Override
	public Object visit(InfEqual i) {
		i.getLeft().accept(this);
		i.getRight().accept(this);
		appendln("isub");
		return "ifle";
	}

	@Override
	public Object visit(Inferior i) {
		visitBinary(i);
		appendln("isub");
		return "iflt";
	}

	@Override
	public Object visit(Not n) {
		Object r = n.getRight().accept(this);
		if(r != null) {
			appendln("iload "+(Integer)r);
		}
		appendln("ldc 1");
		appendln("ixor");
		return null;
	}

	@Override
	public Object visit(NumberValue n) {
		appendln("ldc "+n.getValue());
		return null;
	}

	@Override
	public Object visit(Or o) {
		visitBinary(o);
		appendln("ior");
		return null;
	}

	@Override
	public Object visit(Product p) {
		visitBinary(p);
		appendln("imul");
		return null;
	}

	@Override
	public Object visit(QualifiedCall q) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Read r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Substraction s) {
		visitBinary(s);
		appendln("isub");
		return null;
	}

	@Override
	public Object visit(SupEqual s) {
		visitBinary(s);
		appendln("isub");
		return "ifge";
	}

	@Override
	public Object visit(Superior s) {
		visitBinary(s);
		appendln("isub");
		return "ifgt";
	}

	@Override
	public Object visit(While w) {
		appendln("while "+w.hashCode()+":");
		String cnd = (String)w.getCondition().accept(this);
		appendln(cnd+" endwhile"+w.hashCode());
		for (Instruction i : w.getInstructions()) {
			i.accept(this);
		}
		appendln("goto while"+w.hashCode()); 
		appendln("endwhile"+w.hashCode()+":");
		return null;
	}

	@Override
	public Object visit(Write w) {
		appendln("getstatic java/lang/System/out Ljava/io/PrintStream;");
		if(w.getContent() != null) {
			w.getContent().accept(this);
		} else {
			appendln("ldc "+w.getConstant());
		}
		appendln("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
		return null;
	}

}
