package com.kodnest.alpha;

public class LetterFinder {
	AlphabetLetters letters=new AlphabetLetters();
	public void letterfinder(char vul) {
		switch(vul) {
		case 'A': letters.letterA();
		break;
		case 'B': letters.letterB();
		break;
		case 'C': letters.letterC();
		break;
		case 'D': letters.letterD();
		break;
		case 'E': letters.letterE();
		break;
		case 'F': letters.letterF();
		break;
		default:printingStarLine();
		System.out.println("Entered Letter is not Created by the developer.");
		System.out.println("The Letter '"+vul+"' will be added soon :) ");
		printingStarLine();
		}
	}
	public void printingStarLine() {
		System.out.println();
		for(int line=1;line<=50;line++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
