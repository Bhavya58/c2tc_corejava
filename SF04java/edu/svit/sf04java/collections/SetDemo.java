package edu.svit.sf04java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add(1);
		s.add(1);
		s.add(true);
		s.add(null);
		s.add("Rahul");
		System.out.println(s);
		
	}

}
