package com.alura.conversorTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	public void ConvertirTemperatura(double Temp) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
    			"Celcius a Farenheit", 
    			"Celcius a Kelvin", 
    			"Farenheit a Celcius",
    			"Farenheit a Kelvin",
    			"Kelvin a Celcius"
    			,"Kelvin a Farenheit"
    			}, "Seleccion")).toString();
        switch(opcion) {
        case "Celcius a Farenheit":
        	temperatura.ConvertirCelciusAFarenheit(Temp);
        	break;
        case "Celcius a Kelvin":
            temperatura.ConvertirCelciusAKelvin(Temp);
            break;
        case "Farenheit a Celcius":
           temperatura.ConvertirFarenheitACelcius(Temp);
           break;
        case "Farenheit a Kelvin":
            temperatura.ConvertirFarenheitAKelvin(Temp);
            break;
        case "Kelvin a Celcius":
           temperatura.ConvertirKelvinACelcius(Temp);
           break;
        case "Kelvin a Farenheit":
        	temperatura.ConvertirKelvinAFarenheit(Temp);
        	break;
        }
	}
}
