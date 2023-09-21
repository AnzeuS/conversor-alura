package com.alura.conversor.modelo;

public class Convertir implements GestionMoneda{
	@Override
	public double gestionMoneda(double d, double c) {;
		
		double resultadoOpera = (double) (d / c);
	
		return resultadoOpera;
	}

}
