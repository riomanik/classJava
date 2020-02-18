package com.enigma.heroes;

import com.enigma.heroes.roles.Assassin;

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
//		DEMO
	      Heroes Assassins1 = new Heroes();
	      Heroes Assassins2 = new Heroes();
	      Assassins1.Assassins("Saber", 500, "Top Laner");
	      Assassins2.Assassins("Hanzo", 600, "Top Laner");
	      System.out.println(Assassins1);
	      System.out.println(Assassins2);
//	      THE CODE MUST RUN IF I RUN THIS CODE
		  Assassin Assassins3 = new Assassin();
		  Assassins3.CreateAssassin("Saber", 700, "Mid Laner");
		  System.out.println(Assassins3);
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
