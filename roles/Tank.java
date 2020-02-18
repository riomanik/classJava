package com.enigma.heroes.roles;
import com.enigma.heroes.Heroes;

public class Tank extends Heroes{

    public void CreateTank(String name, int damaged,String position) {
	    this.name = name;
	    this.color = "brown";
	    this.damaged = damaged;
	    this.position = position;
	}   
		@Override
		public String toString() {
			return "|================================ \n"
					+ "|       Tank \t\t \n"
					+ "|-------------------------------- \n"
					+ "| Name \t\t : " + name + " \n"
					+ "| color \t : " + color + " \n"
					+ "| damaged \t : " + damaged + " \n"
					+ "| position \t : " + position + "\n"
					+ "|--------------------------------";
		}
}
