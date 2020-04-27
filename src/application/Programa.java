package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV",900.00));
		list.add(new Produto("Notebook",1200.00));
		list.add(new Produto("Tablet",450.00));
		
		Comparator<Produto> comparador =(o1,o2) -> {
				return o1.getNome().toUpperCase().compareTo(o2.getNome().toUpperCase());
		}; 
		
		list.sort(comparador);
		
		for(Produto p : list) {
			System.out.println(p);
		}
	}

}
