package com.alura.conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 17.20;
		monedaDolar = (double) Math.round(monedaDolar *1000d)/1000;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Mexicano");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 18.31;
		monedaEuro = (double) Math.round(monedaEuro *1000d)/1000;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Mexicano");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 21.05;
        monedaLibra = (double) Math.round(monedaLibra *1000d)/1000;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Mexicano");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 0.013;
        monedaYen = (double) Math.round(monedaYen *1000d)/1000;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Mexicano");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.12;
        monedaWon = (double) Math.round(monedaWon *1000d)/1000;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Mexicano");
	}

}
