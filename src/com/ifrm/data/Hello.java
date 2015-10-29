package com.ifrm.data;

public class Hello {
	
	private String hello;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
		
	}
	public static void main (String[] args){
		Hello hh=new Hello();
		hh.setHello("Buna ziua !");
		hh.setName("Zoro");
		System.out.println(hh.getHello()+" "+hh.getName());
	}

}
