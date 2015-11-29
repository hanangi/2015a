package com.gitliz;

public class Main {

	public static void main(String[] args) {
		DemoStatic ds = new DemoStatic();
		
		ds.setHour(5);
		ds.setZone("ASIA");
		
		System.out.println("hour: " + ds.getHour() + ", zone: " + ds.getZone());
		System.out.println("hour: " + ds.getHour() + ", zone: " + ds.getZone());
		System.out.println("hour: " + ds.getHour() + ", zone: " + ds.getZone());
		
		ds.setHour(1);
		System.out.println("hour: " + ds.getHour() + ", zone: " + ds.getZone());
		
		DemoStatic ds2 = new DemoStatic();
		System.out.println("hour: " + ds.getHour() + ", zone: " + ds.getZone());
		System.out.println("hour: " + ds2.getHour() + ", zone: " + ds2.getZone());
		
	}
}
