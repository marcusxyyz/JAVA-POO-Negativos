package application;

import java.util.Scanner;

import util.Negatives;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		
		Negatives[] vect = new Negatives[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			vect[i] = new Negatives(number);
		}
		
		System.out.println("NEGATIVE NUMBERS: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumber() < 0) {
				System.out.println(vect[i].getNumber());
			}
		}
		
		
		sc.close();
	}

}
