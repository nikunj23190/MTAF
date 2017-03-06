package com.pratice.tests;

public class Glass<T extends Liquid> {
	
	private T liquid;
	
	public String checkTaste(){
	
		return liquid.taste();
	}
}
