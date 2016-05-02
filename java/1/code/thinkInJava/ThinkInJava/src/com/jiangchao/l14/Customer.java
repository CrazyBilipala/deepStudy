package com.jiangchao.l14;

public class Customer {
	private String customerName;
	private int sex;
	private String phone;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Customer() {
		super();
		//当加载这个类的时候，实际上并没有初始化，
		//实际上还需要链接，然后才初始化，链接的过程是jvm内部实现了，也就是真正再用的时候，才会发生链接和初始化
		System.out.println("Customer的初始化方法");
	}
	

}
