package com.alura.conversorMonedas;

import javax.swing.JOptionPane;

public class FuctionMonedas {
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
	  public void ConvertirMonedas(double Dinero) {
	    	String opcion = (JOptionPane.showInputDialog(null, 
	    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
	    			JOptionPane.PLAIN_MESSAGE, null, new Object[]{
	    					"De Pesos a Dólar", 
	    					"De Pesos a Euro",
	    					"De Pesos a Libras",
	    					"De Pesos a Yen",
	    					"De Pesos a Won Coreano",
	    					"De Dólar a Pesos", 
	    					"De Euro a Pesos", 
	    					"De Libras a Pesos",
	    					"De Yen a Pesos",
	    					"De Won Coreano a Pesos"}, 
	    			"Seleccion")).toString();
	        switch(opcion) {
	        case "De Pesos a Dólar":
	        	monedas.ConvertirPesosADolares(Dinero);
	        	break;
	        case "De Pesos a Euro":
	        	monedas.ConvertirPesosAEuros(Dinero);
	        	break;
	        case "De Pesos a Libras":
	        	monedas.ConvertirPesosALibras(Dinero);
	        	break;
	        case "De Pesos a Yen":
	        	monedas.ConvertirPesosAYen(Dinero);
	        	break;
	        case "De Pesos a Won Coreano":
	        	monedas.ConvertirPesosAWon(Dinero);
	        	break;    	    	                          
	        case "De Dólar a Pesos":
	        	pesos.ConvertirDolaresAPesos(Dinero);
	        	break;
	        case "De Euro a Pesos":
	        	pesos.ConvertirEurosAPesos(Dinero);
	        	break;
	        case "De Libras a Pesos":
	        	pesos.ConvertirLibrasAPesos(Dinero);
	        	break;
	        case "De Yen a Pesos":
	        	pesos.ConvertirYenAPesos(Dinero);
	        	break;
	        case "De Won Coreano a Pesos":
	            pesos.ConvertirWonAPesos(Dinero);
	            break;
	        }      
	    }

}
