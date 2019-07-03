package animalKingdom;

import java.util.*;
public class Main 
{
	public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester)
	{
		for (Animal a : animals)
		{
			if (tester.test(a))
			{
				System.out.println(a.getName() + " " + a.getYear());

			}
		}
	}
	
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

		System.out.println();
		System.out.println("List all the animals in descending order by year named");
		animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
		animalList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));

		System.out.println();
		System.out.println("List all the animals alphabetically");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animalList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));

		System.out.println();
		System.out.println("List all the animals order by how they move");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animalList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear() + " " + a.move()));

		System.out.println();
		System.out.println("List only those animals the breath with lungs");
		printAnimals(animalList, a -> a.breath() == "lungs");

		System.out.println();
		System.out.println("List only those animals that breath with lungs and were named in 1758");
		printAnimals(animalList, a -> (a.breath() == "lungs") && (a.getYear() == 1758));

		System.out.println();
		System.out.println("List only those animals that lay eggs and breath with lungs");
		printAnimals(animalList, a -> (a.breath() == "lungs") && (a.reproduce() == "eggs"));

		System.out.println();
		System.out.println("List alphabetically only those animals that were named in 1758");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		printAnimals(animalList, a -> a.getYear() == 1758);
		
	}
}