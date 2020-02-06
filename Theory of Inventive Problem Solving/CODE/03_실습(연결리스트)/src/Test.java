//Node
//
//public class Test{
//	public static void main(String[] args) {
//		Node head=null;
//		Node n1=new Node(1);
//		Node n2=new Node(2);
//		Node n3=new Node(3);
//		head=n1;
//		n1.next=n2;
//		n2.next=n3;
//		
//		Node newNode= new Node(7);
//		newNode.next=head;
//		head=newNode;
//		
//		for (Node p=head; p!=null; p=p.next) {
//			System.out.print(p.data+"=>");
//		}
//	}
//}

//3
//
//public class Test {
//	public static void main(String[] args) {
//		Node head = null;
//		head = new Node(1);
//		head.next = new Node(2);
//		head.next.next = new Node(3);
//		printList(head);
//
//		Node newNode = new Node(7);
//		newNode.next = head;
//		head = newNode;
//		printList(head);
//	}
//
//	private static void printList(Node head) {
//		for (Node p = head; p != null; p = p.next)
//			System.out.print(p.data + "->");
//		System.out.println();
//	}
//}

//4
//public class Test {
//	public static void main(String[] args) {
//		Node head = null;
//		head = new Node(1);
//		head.next = new Node(2);
//		head.next.next = new Node(3);
//		printList(head);
//
//		Node newNode = new Node(7);
//		if (head != null) {
//			Node p = head;
//			while (p.next != null)
//				p = p.next;
//			p.next = newNode;
//		} else
//			head = newNode; // 연결리스트가 비어 있는 경우
//		printList(head);
//	}
//
//	private static void printList(Node head) {
//		for (Node p = head; p != null; p = p.next)
//			System.out.print(p.data + "->");
//		System.out.println();
//	}
//}

//5
//public class Test {
//	public static void main(String[] args) {
//		Node head = null;
//		head = new Node(1);
//		head.next = new Node(2);
//		head.next.next = new Node(3);
//		printList(head);
//
//		int searchValue = 3; // 1,2,9 등으로 변경하면서 실행해 볼 것.
//
//		Node newNode = new Node(7);
//		Node p = head, prev = null;
//		while (p != null && p.data != searchValue) {
//			prev = p;
//			p = p.next;
//		}
//		if (p == null)
//			System.out.println(searchValue + " does not exist");
//		else {
//			if (prev != null)
//				prev.next = newNode;
//			else
//				head = newNode;
//			newNode.next = p;
//		}
//		printList(head);
//	}
//
//	private static void printList(Node head) {
//		for (Node p = head; p != null; p = p.next)
//			System.out.print(p.data + "->");
//		System.out.println();
//	}
//}

//9
//public class Test {
//	public static void main(String args[]) {
//		SimpleList list = new SimpleList();
//		list.addFirst(1);
//		list.addFirst(2);
//		list.addFirst(3);
//		System.out.println(list);
//	}
//}

//10
//public class Test {
//	public static void main(String[] args) {
//		SimpleList<Integer> listA = new SimpleList<>();
//		listA.addFirst(1);
//		listA.addFirst(2);
//		listA.addFirst(3);
//		System.out.println(listA);
//		SimpleList<String> listB = new SimpleList<>();
//		listB.addFirst("Korea");
//		listB.addFirst("Japan");
//		listB.addFirst("China");
//		System.out.println(listB);
//		SimpleList<Boolean> listC = new SimpleList<>();
//		listC.addFirst(true);
//		listC.addFirst(true);
//		listC.addFirst(false);
//		System.out.println(listC);
//	}
//}

//11
//public class Test{
//	public static void main(String args[]){
//		SimpleList list = new SimpleList();
//		for (int i = 0; i < 5; i++) 
//			list.addFirst(i);
//		System.out.println(list);
//		list.removeFirst();
//		System.out.println(list);
//	}
//}
//12
//public class Test {
//	public static void main(String[] args) {
//		SimpleList list = new SimpleList();
//		for (int i = 0; i < 5; i++)
//			list.addFirst(i);
//		for (int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i) + " ");
//	}
//}

//13
//public class Test {
//	public static void main(String[] args) {
//		SimpleList list = new SimpleList();
//		list.addLast(1);
//		list.addLast(2);
//		list.addLast(3);
//		System.out.println(list);
//	}
//}

//14
//public class Test {
//	public static void main(String[] args) {
//		SimpleList list = new SimpleList();
//		for (int i = 0; i < 5; i++)
//			list.addLast(i);
//		System.out.println(list);
//		list.removeLast();
//		System.out.println(list);
//	}
//}

//15
//public class Test {
//	public static void main(String[] args) {
//		class Node {
//			int data;
//			Node prev, next;
//
//			public Node(int data) {
//				this.data = data;
//			}
//		}
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node head = n1;
//		Node tail = n2;
//		n1.next = n2;
//		n2.prev = n1;
//		System.out.print("head");
//		for (Node p = head; p != null; p = p.next)
//			System.out.print("->" + p.data);
//		System.out.print("\ntail");
//		for (Node p = tail; p != null; p = p.prev)
//			System.out.print("->" + p.data);
//	}
//}

//16
//public class Test {
//	public static void main(String[] args) {
//		SimpleList list = new SimpleList();
//		list.addFirst(1);
//		list.addFirst(2);
//		list.addLast(9);
//		list.addLast(8);
//		System.out.println(list);
//		list.removeFirst();
//		list.removeLast();
//		System.out.println(list);
//	}
//}