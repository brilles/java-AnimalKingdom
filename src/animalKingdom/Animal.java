package animalKingdom;

public abstract class Animal
{
	private static int maxId = 0;
	int id;
	String name;
	int year;

	public Animal(String name, int year)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.year = year;
	}

	public String move()
	{
		return "move";
	}

	public String breath()
	{
		return "breath";
	}
	public String reproduce()
	{
		return "reproduce";
	}

	public String consumeFood()
	{
		return "eat";
	}
}