package com.enigma.heroes.roles;
import com.enigma.heroes.Heroes;

public class Fighter extends Heroes{
    
    public void CreateFighter(String name, int damaged,String position) {
	    this.name = name;
	    this.color = "orange";
	    this.damaged = damaged;
	    this.position = position;
	}   
		@Override
		public String toString() {
			return "|================================ \n"
					+ "|       Fighter \t\t \n"
					+ "|-------------------------------- \n"
					+ "| Name \t\t : " + name + " \n"
					+ "| color \t : " + color + " \n"
					+ "| damaged \t : " + damaged + " \n"
					+ "| position \t : " + position + "\n"
					+ "|--------------------------------";
		}
}
