package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {
	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("Skriv inn et heltall "));
		double midlertidig = 1.0;
		if (n > 0) {
			while (n > 0) {
				midlertidig *= n;
				n--;
			}
			System.out.println(midlertidig);

		}
		else {
			System.out.println("Du må skrive inn et gyldig heltall!");
		}
	}
}
