package ch.hepia.IL.tcp.tree;

import ch.hepia.IL.tcp.code.Visitor;

public class Assignment extends Instruction {

	private Expression source, dest;

	public Assignment(int line, Expression source, Expression dest) {
		super(line);
		this.source = source;
		this.dest = dest;
	}

	@Override
	public Object accept(Visitor v) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return dest +" = "+source;
	}
	
}
