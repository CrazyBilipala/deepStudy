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
		//������������ʱ��ʵ���ϲ�û�г�ʼ����
		//ʵ���ϻ���Ҫ���ӣ�Ȼ��ų�ʼ�������ӵĹ�����jvm�ڲ�ʵ���ˣ�Ҳ�����������õ�ʱ�򣬲Żᷢ�����Ӻͳ�ʼ��
		System.out.println("Customer�ĳ�ʼ������");
	}
	

}
