package main;

import java.util.List;
import java.util.Scanner;


/*
 * By: Sherry Wang
 * 03/23/2021
 * 
 * Main App
 * Take an input from command, converted to binary and padded to 8 digits, output the numeric with reversed binary
 */


public class App {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		BinaryReversalProcessor brp = BinaryReversalProcessor.getInstance();
		System.out.println(brp.binaryReversal(input));
	}
}
