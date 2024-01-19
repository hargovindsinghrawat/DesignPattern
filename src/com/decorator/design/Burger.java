package com.decorator.design;

public abstract class Burger {
	private String description;
	private double cost;
	
	public abstract String getDescription();
	
	public abstract double getCost();
}