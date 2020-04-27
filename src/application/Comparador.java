package application;

import java.util.Comparator;

import entities.Produto;

public class Comparador implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().toUpperCase().compareTo(o2.getNome().toUpperCase());
	}

}
