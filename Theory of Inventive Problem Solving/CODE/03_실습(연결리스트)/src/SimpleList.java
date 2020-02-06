//9
//public class SimpleList {
//	Node head;
//
//	public void addFirst(int data) {
//		Node newNode = new Node(data);
//		newNode.next = head;
//		head = newNode;
//	}
//
//	@Override
//	public String toString() {String v = "";
//	for (Node p = head; p != null; p = p.next) {
//		if (v.length() > 0)
//			v += "->";
//		v += p.data;
//	}
//	return v;
//	}
//}

//10
//public class SimpleList<T> {
//	Node<T> head;
//
//	public void addFirst(T data) {
//		Node<T> newNode = new Node<>(data);
//		newNode.next = head;
//		head = newNode;
//	}
//
//	@Override
//	public String toString() {String v = "";
//	for (Node<T> p = head; p != null; p = p.next) {
//		if (v.length() > 0)
//			v += "->";
//		v += p.data;
//	}
//	return v;
//	}
//}

//11
//public class SimpleList {
//	Node head;
//
//	public void addFirst(int data) {
//		Node newNode = new Node(data);
//		newNode.next = head;
//		head = newNode;
//	}
//
//	public void removeFirst() {
//		if (head != null) {
//			Node data = head;
//			head = head.next;
//			data.next = null;
//		}
//	}
//
//	@Override
//	public String toString() {
//		String v = "";
//		for (Node p = head; p != null; p = p.next) {
//			if (v.length() > 0)
//				v += "->";
//			v += p.data;
//		}
//		return v;
//	}
//}

//12
//public class SimpleList {
//	Node head;
//
//	public void addFirst(int data) {
//		Node newNode = new Node(data);
//		newNode.next = head;
//		head = newNode;
//	}
//
//	public int size() {
//		int cnt = 0;
//		Node p = head;
//		while (true) {
//			if (p == null) {
//				break;
//			} else if (p != null) {
//				p = p.next;
//				cnt++;
//			}
//		}
//		return cnt;
//	}
//
//	public String get(int i) {
//		Node p = head;
//		while (i > 0) {
//			p = p.next;
//			i--;
//		}
//		return "" + p.data;
//	}
//
//	@Override
//	public String toString() {
//		String v = "";
//		for (Node p = head; p != null; p = p.next) {
//			if (v.length() > 0)
//				v += "->";
//			v += p.data;
//		}
//		return v;
//	}
//
//}

//13-1
//public class SimpleList {
//	Node head;
//
//	public void addLast(int i) {
//		Node newNode = new Node(i);
//		if (head != null) {
//			Node p = head;
//			while (p.next != null)
//				p = p.next;
//			p.next = newNode;
//		} else
//			head = newNode;
//	}
//
//	@Override
//	public String toString() {
//		String v = "";
//		for (Node p = head; p != null; p = p.next) {
//			if (v.length() > 0)
//				v += "->";
//			v += p.data;
//		}
//		return v;
//	}
//}

//13-2
//public class SimpleList {
//	Node head;
//	Node tail;
//
// public void addLast(int i) {
//      Node newNode = new Node(i);
//      if (tail == null) {
//         tail = newNode;
//         head = tail;
//      } else {
//         tail.next = newNode;
//         newNode.prev = tail;
//         tail = newNode;
//      }
//   }
//
//	@Override
//	public String toString() {
//		String v = "";
//		for (Node p = head; p != null; p = p.next) {
//			if (v.length() > 0)
//				v += "->";
//			v += p.data;
//		}
//		return v;
//	}
//}

//14
//public class SimpleList {
//	Node head;
//
//	public void addLast(int i) {
//		Node newNode = new Node(i);
//		if (head != null) {
//			Node p = head;
//			while (p.next != null)
//				p = p.next;
//			p.next = newNode;
//		} else
//			head = newNode;
//	}
//
//	public void removeLast() {
//		if (head != null) {
//			Node p = head, prev = null;
//			while (p.next != null) {
//				prev = p;
//				p = p.next;
//			}
//			if (prev != null)
//				prev.next = null;
//			else
//				head = null;
//		}
//	}
//
//	@Override
//	public String toString() {
//		String v = "";
//		for (Node p = head; p != null; p = p.next) {
//			if (v.length() > 0)
//				v += "->";
//			v += p.data;
//		}
//		return v;
//	}
//}

//16
//public class SimpleList {
//	Node head;
//	Node tail;
//
//	public void addFirst(int i) {
//		Node newNode = new Node(i);
//		if (head == null) {
//			head = newNode;
//			tail = head;
//		} else {
//			newNode.next = head;
//			head.prev = newNode;
//			head = newNode;
//		}
//	}
//
//	public void removeFirst() {
//		if (head == null) {
//			return;
//		} else if (head == tail) {
//			head = null;
//			tail = null;
//			return;
//		} else {
//			head.next.prev = null;
//			head = head.next;
//			head.prev = null;
//			return;
//		}
//	}
//
//	public void addLast(int i) {
//		Node newNode = new Node(i);
//		if (tail == null) {
//			tail = newNode;
//			head = tail;
//		} else {
//			tail.next = newNode;
//			newNode.prev = tail;
//			tail = newNode;
//		}
//	}

//Ç®ÀÌ
//Node tail;
//public void addLast(int data) {
//	if(tail==null)head=tail=new Node(data);
//	else {
//	tail.next = new Node(data);
//	tail=tail.next;
//	}
//}


//
//	public void removeLast() {
//		if (tail == null) {
//			return;
//		} else if (head == tail) {
//			head = null;
//			tail = null;
//			return;
//		} else {
//			tail.prev.next = null;
//			tail = tail.prev;
//			return;
//		}
//	}
//
//	@Override
//	public String toString() {
//		String v = "";
//		for (Node p = head; p != null; p = p.next) {
//			if (v.length() > 0)
//				v += "->";
//			v += p.data;
//		}
//		return v;
//	}
//}