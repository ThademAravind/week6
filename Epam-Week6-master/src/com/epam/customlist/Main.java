package com.epam.customlist;

public class Main {

	public static void main(String[] args) {
		CustomList l=new CustomList();
		l.add_to_list(10);
		l.add_to_list(35);
		l.add_to_list("Hello");
		l.add_to_list("Avengers");
		l.add_to_list(35.5);
		l.add_to_list(21);
		l.display();
		l.remove_from_list(1);
		l.display();
		

	}

}
