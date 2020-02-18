package com.enigma.heroes.roles;
import com.enigma.heroes.Heroes;

public class Mage extends Heroes{
    
    public void CreateMage(String name, int damaged,String position) {
	    this.name = name;
	    this.color = "blue";
	    this.damaged = damaged;
	    this.position = position;
	} 
		@Override
		public String toString() {
			return "|================================ \n"
					+ "|       Mage \t\t \n"
					+ "|-------------------------------- \n"
					+ "| Name \t\t : " + name + " \n"
					+ "| color \t : " + color + " \n"
					+ "| damaged \t : " + damaged + " \n"
					+ "| position \t : " + position + "\n"
					+ "|--------------------------------";
		}
}
