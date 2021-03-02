package linkedList;

public class LinkedList<T>{
	Node<T> head = null;
	int size;
	public LinkedList(){
		size=0;
	}
    public void addAtFront(T value) {
		Node<T> temp = new Node<T>(value);
        temp.next = head;
        head = temp;
		size++;
    }

    public void addAtEnd(T value) {
		Node<T> temp = new Node<T>(value);
        if (head == null)
            head = temp;
        else {
            Node<T> next = head;
            while(next.next != null)
                next = next.next;
            next.next = temp;
        }
		size++;
    }
	public void removeFront() {
		head = head.next;
		size--;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public boolean isFull(){
		return size==10;
	}
	public void removeValue(T value){
		Node<T> temp = head;
		LinkedList<T> res = new LinkedList<T>();
		while(temp != null){
			if(temp.value == value){
				temp = temp.next;
				continue;
			}
			res.addAtEnd(temp.value);
			temp = temp.next;
		}
		head = res.head;
		res.size--;
	}
	public void addNextTo(T value, T searchValue){
		Node<T> temp = head;
		LinkedList<T> res = new LinkedList<T>();
		while(temp != null){
			if(temp.value == searchValue){
				res.addAtEnd(temp.value);
				res.addAtEnd(value);
				temp = temp.next;
				continue;
			}
			res.addAtEnd(temp.value);
			temp = temp.next;
		}
		head = res.head;
		res.size--;
	}
	public void print() {
		Node<T> next = head;
		while(next != null) {
			System.out.print(next.value+" -> ");

			next = next.next;
		}
		System.out.print("\n");
	}
}
