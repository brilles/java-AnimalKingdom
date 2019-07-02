package animalKingdom;

import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		//Mammals	
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		//Birds
		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758); 

		//Fish
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		// Mammals
		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigfoot);

		// Birds
		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);

		// Fish
		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		System.out.println(animalList);

		// List all the animals in desc order by year named
		// list all animals alphabetically
		// list all the animals order by how they mve
		// list only those animals that breath with lungs
		// list only thos animals that breath with lungs and were named on 1758
		// list only those animals that lay eggs and breath with lungs
		// list alphabetically only those animals that were named in 1758

		// Stretch: list alphabetically those animals that are mammals
	}
}