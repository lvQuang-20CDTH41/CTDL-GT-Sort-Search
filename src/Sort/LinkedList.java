package Sort;

public class LinkedList {
	Node first, last;
	LinkedList(){
		first = last = null;
	}
	public void Add(int data) {
		Node node = new Node(data);
		this.Add(node);
	}
	public void Add(Node node) {
		if(first == null) {
			first = last = node;
			return;
		}else {
			last.next = node;
			node.prev = last;
			last = node;
		}
	}
	public void printList() {
		Node node = first;
		while(node != null) {
			node.printNode();
			node = node.next;
		}
	}
	public void Sort() {
		Node a = first;
		while(a != null) {
			Node b = a.next;
			while(b != null) {
				if(a.data > b.data) {
					int tamp  = a.data;
					a.data = b.data;
					b.data = tamp;
				}
				b = b.next;
			}
			a = a.next;
		}
	}
	public boolean find(int k) {
		Node node = first;
		while(node != null) {
			if(node.data == k) return true;
			node = node.next;
		}
		return false;
	}

}
