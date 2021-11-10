package Sort;

public class MainApp {

	public static void main(String[] args) {
		LinkedList lk = new LinkedList();
		lk.Add(2);
		lk.Add(4);
		lk.Add(5);
		lk.Add(62);
		lk.Add(22);
		lk.Add(1);
		lk.Sort();
		lk.printList();
		int k = 4;
		String kq = lk.find(k)? "có" : "không";
		System.out.println("\nTìm kiếm " + k + " có trong mảng không: " + kq);
	}

}
