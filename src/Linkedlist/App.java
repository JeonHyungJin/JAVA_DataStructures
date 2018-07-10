package Linkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new LinkedList<String>();

		list.insert("HI");
		list.insert("JOHN");
		list.insert("Mickel");
		list.insert("Jeo");

		list.remove("JOHN");
		System.out.println(list.size());
		list.travelList();

		System.out.println("\n-------------------------");

		List<Person> list2 = new LinkedList<Person>();

		list2.insert(new Person("John", 15));
		list2.insert(new Person("Mickel", 20));
		list2.insert(new Person("Susan", 19));
		list2.insert(new Person("Kelly", 21));

		System.out.println(list2.size());
		list2.travelList();

	}

}
