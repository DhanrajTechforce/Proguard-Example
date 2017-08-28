package com.obs.tech.main;

import com.obs.tech.model.ModelCalssOne;
import com.obs.tech.model.ModelClassTwo;

public class MainClass {
	ModelCalssOne modelCalssOne;
	ModelClassTwo modelClassTwo;

	public MainClass() {
		modelCalssOne = new ModelCalssOne();
		modelClassTwo = new ModelClassTwo();
		
		modelCalssOne.setVal1("Val1");	
		modelCalssOne.setVal2("Val2");		
		
		modelClassTwo.setVal1("Val1");		
		modelClassTwo.setVal2("Val2");		
		
		System.out.println(modelCalssOne.getVal1());
		System.out.println(modelClassTwo.getVal1());
		
	}

	public static void main(String[] args) {
		
new MainClass();
	}

}
