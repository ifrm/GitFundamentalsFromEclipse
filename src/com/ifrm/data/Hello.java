package com.ifrm.data;

public class Hello {
	
	private String hello;
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public static void main (String[] args){
		Hello hh=new Hello();
		hh.setHello("Buna ziua !");
		
		
		
		
		System.out.println(hh.getHello());
	}

}
