package com.p2;

import com.p1.Protection;

public class Derived extends Protection{

	public Derived() {
		System.out.println("Derived's Constructor");
		//System.out.println("n : "+n);
		System.out.println("n_pub : "+n_pub);
		System.out.println("n_pro : "+n_pro);
		//System.out.println("n_pri : "+n_pri);
	}
}