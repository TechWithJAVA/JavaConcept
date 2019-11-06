package com.saroj.designpattaern.behavioraldesignpattaern.temporarydesignpattern;

public class AndroidCompiler extends CrossCompiler{

	@Override
	protected void collectSource() {
		System.out.println("store");
		
	}

	@Override
	protected void compileToTarget() {
		System.out.println("direct");
		
	}

}
