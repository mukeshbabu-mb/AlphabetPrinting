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
	//=============================================================================================
	public void letterG() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1||col==1||(row==5 && col>=5)||(col==5&&row>=5)||(col==10&&row>=5)||(row==10&&col<=5)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterH() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==5||col==1||col==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterI() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(col==5||row==1||row==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterJ() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1||col==6||(row==10&&col<=6)||(col==1&&row>5)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterK() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(col==1||(row+col==7)||(row-col==4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterL() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(col==1||row==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterM() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(col==1||col==10||(row==col&&row<=5)||(row+col==11&&col>5)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterN() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(col==1||col==10||(row==col)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	//=============================================================================================
	public void letterS() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1||(col==1&&row<=5)||row==5||(col==10&&row>=5)||row==10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//=============================================================================================
	public void letterT() {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1||col==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}




}
