package com.alura.conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	public double ConvertirCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
		farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +farenheit+ " Grados Farenheit ");
		return farenheit;
	}
	public void ConvertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celcius+ " Celcius");
	}
	public void ConvertirCelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin");
	}
	public double ConvertirKelvinACelcius(double valor) {
		 double kelvinCelcius = valor - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celcius");
        return kelvinCelcius;
	}
	public double ConvertirKelvinAFarenheit(double valor) {
		 double kelvinFarenheit = ((valor - 273.15)*1.8+32);
       kelvinFarenheit = (double) Math.round(kelvinFarenheit *100d)/100;
       JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Farenheit");
       return kelvinFarenheit;
	}
	public double ConvertirFarenheitAKelvin(double valor) {
		 double Farenheitkelvin = ((valor - 32)*.5555 + 273.15);
		 Farenheitkelvin = (double) Math.round(Farenheitkelvin *100d)/100;
      JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +Farenheitkelvin+ " Farenheit");
      return Farenheitkelvin;
	}
}
