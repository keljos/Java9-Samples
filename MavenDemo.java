package com.kelliejos.examples;

import java.util.logging.Logger;

public class MavenDemo {
	Logger log = Logger.getLogger(Demo.class.getName());

	public static void main(String... args) {
		log.info("Java 9 and Maven demo.")

		System.out.println("Java 9 modules at work!");
		System.out.println("Lets do some math...");

		printCube(10);
	}

	private void printCube(int num) {
		log.info("Computing the cube of " + num);
		
		int cube = num * num * num
		System.out.println("The cube of " + num + " is " + cube);
	}
}
