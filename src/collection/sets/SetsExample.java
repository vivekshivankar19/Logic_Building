package collection.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsExample {

	public static void main(String[] args) {
		SetsExample obj = new SetsExample();
		
		System.out.println("Calling Hashsets");
		obj.hashSets();
		System.out.println("Calling LinkesHashsets");
		obj.linkedHashSets();
		System.out.println("Calling TreeSets");
		obj.treeSets();
	}
	
	
	void hashSets() {
		HashSet <String> al=new HashSet<String>(); // creating hashSet
		 al.add("Rachit");                 // adding elements
		 al.add("Amit");
		 al.add("jack");
		 Iterator <String> itr=al.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
	}
	
	void linkedHashSets() {
		LinkedHashSet <String> al=new LinkedHashSet<String>(); // creating hashSet
		 al.add("Rachit");                 // adding elements
		 al.add("Amit");
		 al.add("jack");
		 Iterator <String> itr=al.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
	}
	
	void treeSets() {
		TreeSet <String> al=new TreeSet<String>(); // creating hashSet
		 al.add("Rachit");                 // adding elements
		 al.add("Amit");
		 al.add("jack");
		 Iterator <String> itr=al.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
	}

}
