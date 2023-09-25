package com.alura.conversorMonedas;

import javax.swing.JOptionPane;


public class ConvertirMonedas {
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor * 0.058;
		monedaDolar = (double) Math.round(monedaDolar *1000d)/1000;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor * 0.055;
		monedaEuro = (double) Math.round(monedaEuro *1000d)/1000;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor * 0.047;
        monedaLibra = (double) Math.round(monedaLibra *1000d)/1000;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor * 77.67;
        monedaYen = (double) Math.round(monedaYen *1000d)/1000;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double monedaWon = valor * 8.63;
        monedaWon = (double) Math.round(monedaWon *1000d)/1000;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
}
