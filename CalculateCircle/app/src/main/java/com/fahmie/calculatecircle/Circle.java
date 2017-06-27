package com.fahmie.calculatecircle;

public class Circle
{
	private double radius;

	public Circle() {
		radius = 1.0;
	}

	public Circle(double radius){
		this.radius = radius;
	}


	public double getRadius(){
		return radius;
	}

	public double getArea(){
		return 2 * Math.PI * radius;
	}


}
