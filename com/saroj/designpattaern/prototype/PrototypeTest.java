package com.saroj.designpattaern.prototype;

public class PrototypeTest {

	
	public static void main(String[] args) {
		ColorStore.getColor("red").fillcolor();
        ColorStore.getColor("green").fillcolor();
        ColorStore.getColor("green").fillcolor();
        ColorStore.getColor("red").fillcolor();
	}
}
