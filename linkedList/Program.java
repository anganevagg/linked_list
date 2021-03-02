package linkedList;

public class Program{
	public static void main(String[] args){
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.addAtFront(1);
		ll.addAtEnd(3);
		ll.addAtEnd(5);
		ll.addAtEnd(7);
		ll.addNextTo(10, 5);
		ll.print();
	}
}
