package org.hcl;

public class Git1 extends Git {
	@Override
	public void add() {
		System.out.println("Discount 5%");
		
		super.add();
	}
	public static void main(String[] args) {
		Git1 g = new Git1();
		g.add();
	}
	

}
