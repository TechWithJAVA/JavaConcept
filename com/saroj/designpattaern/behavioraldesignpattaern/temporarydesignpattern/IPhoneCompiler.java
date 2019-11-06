package com.saroj.designpattaern.behavioraldesignpattaern.temporarydesignpattern;

public class IPhoneCompiler extends CrossCompiler {

	@Override
	protected void collectSource() {
		System.out.println("Store");
		
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Direct");
		
	}

}
