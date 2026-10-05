package com.krakedev.herencia;

public class Hija extends Padre {

//----------------------------------------------------------------
	public void escucharBadBunny() {
		System.out.println("Escuchando esta musiaca horrible");
	}
//-----------------------------------------------------------------

	@Override
	public String toString() {
		return "Defectos : " + getDefectos() + " Virtudes : " + getVirtudes();
	}

}
