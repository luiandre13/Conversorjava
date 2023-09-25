package com.alura.home;

import javax.swing.JOptionPane;

import com.alura.conversorMonedas.FuctionMonedas;
import com.alura.conversorTemperatura.functionTemperatura;


public class Home {
	public static void main(String[] args) {
		
		FuctionMonedas monedas = new FuctionMonedas();
		functionTemperatura temperatura = new functionTemperatura();
		
		
		while (true) {
            String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };

            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                    "Menu", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == null) {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;
            }

            switch (seleccion) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(Minput);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir: ");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        }
    }

    public static boolean ValidarNumero(String input) {
        try {
             Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
