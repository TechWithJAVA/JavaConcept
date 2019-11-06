package com.saroj.designpattaern.behavioraldesignpattaern.temporarydesignpattern;

public abstract class CrossCompiler {
	  protected abstract void collectSource();
	  protected abstract void compileToTarget();
   
	  public final void crossCompile() {
		    collectSource();
		    compileToTarget();
	  }

}
