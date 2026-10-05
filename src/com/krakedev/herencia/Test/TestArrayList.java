package com.krakedev.herencia.Test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Hija> listaHijas = new ArrayList<Hija>();

		Hija hija1 = new Hija();
		hija1.setDefectos(2);
		hija1.setVirtudes(4);
		listaHijas.add(hija1);

		Hija hija2 = new Hija();
		hija2.setDefectos(6);
		hija2.setVirtudes(1);
		listaHijas.add(hija2);

		Hija hija3 = new Hija();
		hija3.setDefectos(6);
		hija3.setVirtudes(1);
		listaHijas.add(hija3);

		System.out.println(listaHijas);

	}

}
