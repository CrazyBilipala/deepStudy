package com.jiangchao.l14;


public class Main {

	public static void main(String[] args) {
//		try {
			//利用类路径找到对应的Class，反射的开始
//			Class c = Class.forName("com.jiangchao.l14.Customer");
			Class c = Customer.class;
			System.out.println(c.getName());
			System.out.println(c.getCanonicalName());
			System.out.println(c.getModifiers());
			System.out.println(c.getSimpleName());
			System.out.println(c.getTypeName());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
