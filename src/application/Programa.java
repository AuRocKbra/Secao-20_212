package application;

import java.util.List;
import java.util.ArrayList;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV",900.00));
		list.add(new Produto("Notebook",1200.00));
		list.add(new Produto("Tablet",450.00));
		
		list.sort(new Comparador());
		
		for(Produto p : list) {
			System.out.println(p);
		}
	}

}
