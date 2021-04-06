package linkedlist01;
import java.util.*;
public class llist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(30);
		ll.add(1,100);
		ll.addFirst(0);
		System.out.println(ll);
		System.out.println("the size of linkedlist "+ll.size());
		System.out.println(ll.contains(3));
		System.out.println(ll.clone());
		System.out.println(ll.get(1));
	//	System.out.println(ll.removeFirstOccurrence(ll)));
	}

}
