package com.enigma.heroes.roles;
import com.enigma.heroes.Heroes;

public class Assassin extends Heroes {
		
	public void CreateAssassin(String name, int damaged,String position) {
	    this.name = name;
	    this.color = "red";
	    this.damaged = damaged;
	    this.position = position;
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
