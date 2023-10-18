package com.kodnest.alpha;
import java.util.Scanner;
public class Appliction {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		LetterFinder find=new LetterFinder();
		System.out.print("User Please Enter any Alphabet Letter : ");
		char alphachar=scan.next().charAt(0);
		find.letterfinder(alphachar);
		scan.close();
	}

}
