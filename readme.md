# Create a Hero Mobile Legends

## Make your own hero

This Project is a Make you to create some heroes

1. Creating a Hero with name , damaged , position
2. There is an 1 main class in here
3. In here you will learn how to create a method to create a hero
4. The Demo show you method and void main in 1 class and only 1 java class
5. You must spread a method in to a different class and you must associate the class in to an object
6. And you must create Hero in main class not in different class

## Demo

```bash
package com.enigma.heroes;


public class Heroes {
	   protected String name;
	   protected String color;
	   protected int damaged;
	   protected String position;

	public void Assassins(String name,int damaged,String position) {
		this.name = name;
		this.color = "red";
		this.damaged = damaged;
		this.position = position;
	}

	public static void main(String[] args) {
	      Heroes Assassins1 = new Heroes();
	      Heroes Assassins2 = new Heroes();
	      Assassins1.Assassins("Saber", 500, "Top Laner");
	      Assassins2.Assassins("Hanzo", 600, "Top Laner");
	      System.out.println(Assassins1);
	      System.out.println(Assassins2);
	}

	@Override
	public String toString() {
		return "|================================ \n"
				+ "|       Assassin \t\t \n"
				+ "|-------------------------------- \n"
				+ "| Name \t\t : " + name + " \n"
				+ "| color \t : " + color + " \n"
				+ "| damaged \t : " + damaged + " \n"
				+ "| position \t : " + position + "\n"
				+ "|--------------------------------";
	}

}

```

### https://aditya-sridhar.github.io/simple-reactjs-app

    Let see the result

```bash
    |================================
    |       Assassin
    |--------------------------------
    | Name 		 : Saber
    | color 	 : red
    | damaged 	 : 500
    | position 	 : Top Laner
    |--------------------------------
    |================================
    |       Assassin
    |--------------------------------
    | Name 		 : Hanzo
    | color 	 : red
    | damaged 	 : 600
    | position 	 : Top Laner
    |--------------------------------
```

## Look at this line code

```bash
          Heroes Assassins1 = new Heroes();
	      Heroes Assassins2 = new Heroes();
	      Assassins1.Assassins("Saber", 500, "Top Laner");
	      Assassins2.Assassins("Hanzo", 600, "Top Laner");
```

it create some heroes name Saber , damaged 500 and position in Top Laner

## Use this for convert the result to String

You will need this line of code

```bash
@Override
	public String toString() {
		return "|================================ \n"
				+ "|       Assassin \t\t \n"
				+ "|-------------------------------- \n"
				+ "| Name \t\t : " + name + " \n"
				+ "| color \t : " + color + " \n"
				+ "| damaged \t : " + damaged + " \n"
				+ "| position \t : " + position + "\n"
				+ "|--------------------------------";
	}
```

## Task

Now you must create another Assassin but you must create a method into a class and you now have 2 class ,,

so if i run

```bash
public static void main(String[] args) {
		  Assassin Assassins3 = new Assassin();
		  Assassins3.CreateAssassin("Saber", 700, "Mid Laner");
		  System.out.println(Assassins3);
	}
```

it will show

|================================
| Assassin
|--------------------------------
| Name : Saber
| color : red
| damaged : 700
| position : Mid Laner
|--------------------------------
