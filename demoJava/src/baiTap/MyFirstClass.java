package baiTap;

import java.util.Scanner;

public class MyFirstClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name here: ");
		String name = scanner.nextLine();
		System.out.println("Hello!" + name);
	}
}
