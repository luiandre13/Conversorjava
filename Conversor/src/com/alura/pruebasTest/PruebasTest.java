package com.alura.pruebasTest;

import com.alura.conversorMonedas.ConvertirMonedas;
import com.alura.conversorMonedas.ConvertirMonedasAPesos;
import com.alura.conversorMonedas.FuctionMonedas;
import com.alura.conversorTemperatura.ConvertirTemperatura;
import com.alura.conversorTemperatura.functionTemperatura;

public class PruebasTest {
	public static void main(String[] args) {
		
		//Test temperatura celsius a fahrenheit
		ConvertirTemperatura temperatura = new ConvertirTemperatura();
		temperatura.ConvertirCelciusAFarenheit(45);
		System.out.println(temperatura);
		//farenheit a celcius
		ConvertirTemperatura temperatura2 = new ConvertirTemperatura();
		temperatura2.ConvertirFarenheitACelcius(45);
		System.out.println(temperatura2);
		//celcius a kelvin
		ConvertirTemperatura temperatura3 = new ConvertirTemperatura();
		temperatura3.ConvertirCelciusAKelvin(45);
		System.out.println(temperatura3);
		//kelvin a celcius  
		ConvertirTemperatura temperatura4 = new ConvertirTemperatura();
		temperatura4.ConvertirKelvinACelcius(45);
		System.out.println(temperatura4);
		//kelvin a farenheit  
		ConvertirTemperatura temperatura5 = new ConvertirTemperatura();
		temperatura5.ConvertirKelvinAFarenheit(45);
		System.out.println(temperatura5);
		//farenheit a   kelvin
		ConvertirTemperatura temperatura6 = new ConvertirTemperatura();
		temperatura6.ConvertirFarenheitAKelvin(45);
		System.out.println(temperatura6);
		functionTemperatura fun = new functionTemperatura();
		fun.ConvertirTemperatura(45);
		//Pruebas Monedas peso mexicano a divisas extranjeras
		
		ConvertirMonedas moneda = new ConvertirMonedas();
		moneda.ConvertirPesosADolares(1);
		ConvertirMonedas moneda2 = new ConvertirMonedas();
		moneda2.ConvertirPesosAEuros(1);
		ConvertirMonedas moneda3 = new ConvertirMonedas();
		moneda3.ConvertirPesosALibras(1);
		ConvertirMonedas moneda4 = new ConvertirMonedas();
		moneda4.ConvertirPesosAWon(1);
		ConvertirMonedas moneda5 = new ConvertirMonedas();
		moneda5.ConvertirPesosAYen(1);
		//prueba inversa divisas extranjeras peso mexicano
		
		ConvertirMonedasAPesos moneda1 = new ConvertirMonedasAPesos();
		moneda1.ConvertirDolaresAPesos(1);
		moneda1.ConvertirEurosAPesos(1);
		moneda1.ConvertirLibrasAPesos(1);
		moneda1.ConvertirWonAPesos(1);
		moneda1.ConvertirYenAPesos(1);
		FuctionMonedas fun1 = new FuctionMonedas();
		fun1.ConvertirMonedas(1);
	}

}
