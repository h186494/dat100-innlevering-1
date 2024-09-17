package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {
	public static void main(String[] args) {
		int antallStudenter = 0;
		
		for( ; antallStudenter <= 10; antallStudenter++) {
			int poeng = Integer.parseInt(showInputDialog("Skriv inn poengsum: "));
			
			if (poeng >= 90 && poeng <= 100) {
				System.out.println("A");
			}
			else if (poeng >= 80 && poeng <= 89) {
				System.out.println("B");
			}
			else if (poeng >= 60 && poeng <= 79) {
				System.out.println("C");
			}
			else if (poeng >= 50 && poeng <= 59) {
				System.out.println("D");
			}
			else if (poeng >= 40 && poeng <= 49) {
				System.out.println("E");
			}
			else if (poeng >= 0 && poeng <= 39) {
				System.out.println("F");
			}
			else {
				System.out.println("Du må skrive en gyldig score");
				antallStudenter--;
			}
			
		}
	}
}
