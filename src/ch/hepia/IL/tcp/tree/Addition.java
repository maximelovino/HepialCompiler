package ch.hepia.IL.tcp.tree;

public class Addition extends Arithmetic {

	public Addition(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractTree accept(AbstractTree o) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return left+" + "+right;
	}

}
