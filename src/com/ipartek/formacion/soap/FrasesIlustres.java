package com.ipartek.formacion.soap;

import java.util.ArrayList;

public class FrasesIlustres {
	
	private ArrayList<String> frases;
	private int contador=0;
	

	public FrasesIlustres() {
		super();
		crearFrases();
		// TODO Auto-generated constructor stub
		
	}
	private void crearFrases() {
		frases= new ArrayList<String>();
		frases.add("Cuanto peor mejor para todos y cuanto peor para todos mejor, mejor para m� el suyo, beneficio pol�tico");
		frases.add("Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde");
		frases.add("It�s very difficult todo esto");
		frases.add("�Ustedes piensan antes de hablar o hablan tras pensar?");
		frases.add("Exportar es positivo porque vendes lo que produces");
		frases.add("Perm�tanme que haga un reconocimiento a la mayor�a de espa�oles que no se manifiesta, que no sale en las portadas de la prensa y que no abre los telediarios");
		frases.add("Somos sentimientos y tenemos seres humanos.");
		frases.add("A veces la mejor decisi�n es no tomar ninguna decisi�n, que tambi�n es tomar una decisi�n");
		frases.add("Vamos a ver, eeeh, uuum� �Medidas para crear empleo? Bueno, la verdad es que me ha pasado una cosa verdaderamente notable, que lo he escrito aqu� y no entiendo mi letra");
		frases.add("Espa�a es un gran pa�s que hace cosas importantes y tiene espa�oles");
		frases.add("No es lo mismo que gobierne uno que que gobierne otro. No es lo mismo. Dicho de otra manera: es muy distinto, muy diferente");
		frases.add("Todo lo que se refiere a m� y a los compa�eros del partido no es cierto, salvo alguna cosa que han publicado los medios");
		frases.add("No he dormido nada. No me pregunten demasiado si hacen el favor");
		frases.add("Quien me ha impedido cumplir mi programa electoral es la realidad");
		frases.add("Esto no es como el agua que cae del cielo, sin que se sepa exactamente por qu�.");
		frases.add("Por las carreteras tienen que ir coches y de los aeropuertos tienen que salir aviones");
		frases.add("Una cosa es ser solidario, y otra es serlo a cambio de nada");
		frases.add("La cer�mica de Talavera no es cosa menor, dicho de otra forma: es cosa mayor");
		frases.add("Estoy peleando duro para estudiar ingl�s. Le dedico tres horas a la semana y luego voy por ah� practicando en coches y aviones");
		frases.add("Lo que nosotros hemos hecho, cosa que no hizo usted, es enga�ar a la gente");
		
		
	}
	
	/*
	 * Metodo public para exponer en el WSDL, si fuera private no estaria expuesto
	 */
	public String llenateDeGloria(){
	
		if(contador == frases.size()) {
			contador=0;
		}
		int intAletorio =(int) Math.random() *frases.size();
		String frase = frases.get(contador);
		contador++;
		return frase;
	}
	public String fraseAleatoria() {
		return "frase aleatoria";
	}

}
