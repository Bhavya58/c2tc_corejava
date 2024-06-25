package edu.svit.sf04java.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<Integer>l =new LinkedList();
		l.add(5);
		l.add(3);
		System.out.println(l);
		l.addFirst(1);
		System.out.println(l);
		l.addLast(3);
		System.out.println(l);
		System.out.println("The first element is" +l.getFirst());
		System.out.println("The first element is" +l.getLast());
		l.addFirst(1);
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
	}

}
