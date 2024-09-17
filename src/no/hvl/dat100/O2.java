package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {
	public static void main(String[] args) {
		
	double trinn1 = 1441.6;
	double trinn2 = 15086.0;
	double trinn3 = 36434.4;
	double trinn4 = 68408.6;
	
	boolean program = true;
	
	while(program == true) {
		double skatt = Double.parseDouble(showInputDialog("Skriv inn hvor mye du tjener i året: "));
		
		if (skatt < 208051 && skatt > 1) {
			System.out.println("Du betaler ingen trinnskatt");
			program = false;
		}
		else if (skatt >= 208051 && skatt <= 292850) {
			skatt = (skatt - 208051)*0.017;
			program = false;
		}
		else if (skatt >= 292851 && skatt <= 670000) {
			skatt = (skatt - 292851)*0.04 + trinn1;
			program = false;
		}
		else if (skatt >= 670001 && skatt <= 937900) {
			skatt = (skatt-670001)*0.136+trinn1+trinn2;
			program = false;
		}
		else if (skatt >= 937901 && skatt <= 1350000) {
			skatt = (skatt-937901)*0.166+trinn1+trinn2+trinn3;
					program = false;
		}
		else if (skatt >= 1350001) {
			skatt = (skatt-1350001)*0.176+trinn1+trinn2+trinn3+trinn4;
			program = false;
		}
		else {
			System.out.println("Du må skrive en gyldig skatteverdi: ");
			
	}
		int trinnSkatt;
		trinnSkatt = (int) skatt;
		System.out.println("Du betaler " + trinnSkatt + " kroner i trinnskatt");
		
	}
}
}
