package com.epam.customlist;

public class CustomList {
private Object[] list=new Object[30];                    //creates a simple array of object
private int pointer=0;                                    //pointer of insertion is initialized to zero

void add_to_list(Object obj) {
	if(pointer==list.length-1) {
		expand();
	}
	list[pointer++]=obj;
}

void remove_from_list(int index) {
	System.out.println(list[index]+" Removed");
	while(index<pointer) {
		list[index]=list[index+1];
		index++;
	}
	pointer--;
	
}

void display() {
	for(int i=0;i<pointer;i++) {
		System.out.print(list[i].toString()+" ");
	}
	System.out.println();
}


private void expand() {
	int new_capacity=(int)(list.length*1.2+1);
	Object[] new_one=new Object[new_capacity];
	for(int i=0;i<pointer;i++) {
		new_one[i]=list[i];
	}
	list=new_one;
}

}
