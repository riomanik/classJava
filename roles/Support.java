package com.enigma.heroes.roles;
import com.enigma.heroes.Heroes;

public class Support extends Heroes{
    
    public void CreateSupport(String name, int damaged,String position) {
	    this.name = name;
	    this.color = "green";
	    this.damaged = damaged;
	    this.position = position;
	}   
		@Override
		public String toString() {
			return "|================================ \n"
					+ "|       Support \t\t \n"
					+ "|-------------------------------- \n"
					+ "| Name \t\t : " + name + " \n"
					+ "| color \t : " + color + " \n"
					+ "| damaged \t : " + damaged + " \n"
					+ "| position \t : " + position + "\n"
					+ "|--------------------------------";
		}
}
