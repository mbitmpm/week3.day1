package org.college;

public class Automation implements Language,TestTool
{

	private int no;
	private String name;
	public void java() {
		System.out.println("JAVA");
	}
	public void selenium() {
		System.out.println("SELENIUM AUTOMATION");
	}
	public String getName(String name){
		return name;
	}
	public Automation(String name, int num) {
		this.name=name;
		this.no=num;
		System.out.println("Name is "+ name + " and the ID is "+ num);

	}
	public static void main(String[] args) {
		Automation obj= new Automation("Inspire Testing",345);
		obj.java();
		obj.selenium();
		System.out.println("Id is "+id);
	}

}
