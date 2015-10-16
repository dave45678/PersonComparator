import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;


public class PersonComparisonApp {

	public static void main (String[] args){
		
	List<Person> friends = new ArrayList<Person>();
	
	friends.add(new Person("Bart","Simpson",new GregorianCalendar(2005,2,15).getTime()));
	friends.add(new Person("Lisa","Simpson",new GregorianCalendar(2007,8,7).getTime()));
	friends.add(new Person("Homer","Simpson",new GregorianCalendar(1984,10,25).getTime()));
	friends.add(new Person("Marge","Simpson",new GregorianCalendar(1987,12,17).getTime()));

	System.out.println("\nprint in order they were added to the collection:");
	for(Person friend:friends){
		System.out.println(friend.toString());
	}
	
	List<Person> coll = friends; 
	Collections.sort(coll,new BirthdayComparator()); 

	System.out.println("\nprint from first birthday (oldest) to last birthday (youngest):");
	for(Person friend:friends){
		System.out.println(friend.toString());
	}
	
	
	System.out.println("\nprint from youngest to oldest:");
	Collections.sort(coll,new AgeComparator()); 

	for(Person friend:friends){
		System.out.println(friend.toString());
	}
	
	
	}
		
}
