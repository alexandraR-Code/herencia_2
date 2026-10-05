package com.krakedev.herencia;

public class Padre {
//--------------------------------------//
// toString: de object devuelve el nombre de la clase el simbolo @ y el hash
// code, que es una identificacion del objeto
// SOBREESCRITURA: Definir el comportamiento de toString 
//-------------------------------------------------------------
	private int defectos;
	private int virtudes;

//-------------------------------//
	public int getDefectos() {
		return defectos;
	}

	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}

	public int getVirtudes() {
		return virtudes;
	}

	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}

//-----------------------------------///
	public void imprimir() {
		System.out.println("Virtude: " + virtudes);
		System.out.println("Defectos: " + defectos);
	}

//------------------------------------///
	public void guardarSecreto() {
		System.out.println("Esto  no se hereda");
	}

//-------------------------------------///
//	public String toString() {
//		return "Defectos : " + getDefectos() + "Virtudes : " + getVirtudes();
//	}
//--------------------------------------------------------------------------------
	@Override // permite evitar sobreescribir de la manera correcta
	public String toString() { // Generada d3sde el IDE
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
	}
//--------------------------------------------------------------------------------

}
