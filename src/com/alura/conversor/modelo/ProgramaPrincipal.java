package com.alura.conversor.modelo;

import javax.swing.*; 
/**
 * *
 * @author Andrews Lora
 * @version 1.0.0.1
 * @param args
 * Oracle / Alura Latam Challenge 
 */
 
public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		// Creamos los arrays necesarios para los menus desplegables
		String[] opciones = {"Conversor de Moneda", "Conversor de temperatura"};
		String[] monedaOpciones = {"Dolar Americano", "Euro", "Peso Mexicano", "Peso Colombiano"};
		String[] temperaturaOpciones = {"Celsius", "Farenheight"};

		boolean finalizar = false;
		
		do {


			boolean error = true;

						String opcionTomada = (String) JOptionPane.showInputDialog(
							null,
							"Que quieres realizar?",
							"Elije una opcion.",
							JOptionPane.QUESTION_MESSAGE,
							null,
							opciones,
							opciones[0]
		
							);				
		
				System.out.println("Has tomado esta opcion: " + opcionTomada);

				if (opcionTomada == null) {
					break;
				}
				
				int valor = 0;
				Integer valorNumericoTomado = (Integer) null;
				try {
					valorNumericoTomado = Integer.parseInt((String) JOptionPane.showInputDialog(
							null,
							"Ingrese la Cantidad",
							JOptionPane.INPUT_VALUE_PROPERTY,
							valor
							));
					valor = valorNumericoTomado;		
					System.out.println("Has tomado esta opcion: " + valor);
					

				}
				catch(NumberFormatException e) {
	
					JOptionPane.showMessageDialog(null, "No se admiten este elemento","Error",JOptionPane.ERROR_MESSAGE);
					System.out.println("Error" + e);
					error = false;
				}
				
				if (valorNumericoTomado == null) {
					break;
				}
				
				if (error && opcionTomada.equals("Conversor de Moneda")) {
					String monedaTomada = (String) JOptionPane.showInputDialog(
							null,
							"Que quieres realizar?",
							"Elije una opcion.",
							JOptionPane.QUESTION_MESSAGE,
							null,
							monedaOpciones,
							monedaOpciones[0]
							);
					
					int valor1 = valor;
					
					
					if (monedaTomada == null) {
						break;
					}
					
					GestionMoneda Convertir = new Convertir();
					Resultado resultadoObjeto = new Resultado();
										
					switch(monedaTomada){
					case "Dolar Americano":
						double resultado = (double) Convertir.gestionMoneda(valor1, 56);
						resultadoObjeto.mostrarResultado(resultado);
						System.out.println("Has tomado esta opcion de resultado: " + resultado);
						break;
					case "Euro":
						double resultado1 = (double)Convertir.gestionMoneda(valor1, 61);
						resultadoObjeto.mostrarResultado(resultado1);
						System.out.println("Has tomado esta opcion de resultado: " + resultado1);
						break;
					case "Peso Mexicano":
						double resultado2 = (double) Convertir.gestionMoneda(valor1, 30);
						resultadoObjeto.mostrarResultado(resultado2);
						System.out.println("Has tomado esta opcion de resultado: " + resultado2);
						break;
					case "Peso Colombiano":
						double resultado3 = (double) Convertir.gestionMoneda(valor1, 79);
						resultadoObjeto.mostrarResultado(resultado3);
						System.out.println("Has tomado esta opcion de resultado: " + resultado3);
						break;
					};


				}
				else if (error && opcionTomada.equals("Conversor de temperatura")) {
						String temperaturaTomada = (String) JOptionPane.showInputDialog(
								null,
								"Que quieres realizar?",
								"Elije una opcion.",
								JOptionPane.QUESTION_MESSAGE,
								null,
								temperaturaOpciones,
								temperaturaOpciones[0]
								);
						System.out.println("Has tomado esta opcion de temperatura: " + temperaturaTomada);
	
						if (temperaturaTomada == null) {
							break;
						}
						
						int valorTemp = valor;
						
						
						Resultado resultadoObjeto = new Resultado();
						
						switch(temperaturaTomada){
						case "Celsius":
							double resultado = (double) (valorTemp * 9/5) + 32;
							resultadoObjeto.mostrarResultado(resultado);
							System.out.println("Has tomado esta opcion de resultado: " + resultado);
							break;
						case "Farenheight":
							double resultado1 = (double) (valorTemp - 32) * 9/5;
							resultadoObjeto.mostrarResultado(resultado1);
							System.out.println("Has tomado esta opcion de resultado: " + resultado1);
							break;
						
					}
			} 
				int finalizarAceptado = JOptionPane.showConfirmDialog(null, "Desea Continuar?", "Confirmar",
						JOptionPane.YES_NO_OPTION);
					
				if (finalizarAceptado != JOptionPane.YES_NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Programa Finalizado", null, JOptionPane.INFORMATION_MESSAGE);	
					finalizar = true;
				}	
		}while (!finalizar);
	}
}


