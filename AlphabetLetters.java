package com.kodnest.alpha;

public class AlphabetLetters {
	//=============================================================================================
	public void letterA() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1||row==5||col==1||col==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//============================================================================================
	public void letterB() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1||row==5||row==10||col==1||col==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================	
	public void letterC() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1||col==1||row==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterD() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1||col==1||row==10||col==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterE() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1||col==1||row==5||row==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	//=============================================================================================
		public void letterF() {
			for(int row=1;row<=10;row++) {
				for(int col=1;col<=10;col++) {
					if(row==1||col==1||row==5) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}


}
