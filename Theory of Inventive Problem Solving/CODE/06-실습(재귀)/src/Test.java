//1
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
//		LinkedList<String> queue = new LinkedList<>();
//		queue.addLast("�ѱ�");   // ť rear�� �ڷ� ����, queue.add("�ѱ�");
//		queue.addLast("�̱�");   // ť rear�� �ڷ� ����
//		queue.addLast("����");   // ť rear�� �ڷ� ����
//		System.out.println("ť ��ü ���� : " + queue);
//		System.out.println("ť ũ�� : " + queue.size());
//		System.out.println("ť �� ��� �ִ°�? : " + queue.isEmpty());
//		String v = null;
//		v = queue.getFirst();
//		System.out.println("ť front �ڷ� Ȯ��=" + v);
//		v = queue.removeFirst();  // String v=queue.remove();
//		System.out.println("ť front ���� ��=" + v);
//		System.out.println("ť ��ü ����: " + queue);
//		System.out.println("ť front ���� ��=" + queue.removeFirst());
//		System.out.println("ť ��ü ����: " + queue);
//		System.out.println("ť front ���� ��=" + queue.removeFirst());
//		System.out.println("ť ��ü ����: " + queue);
//		System.out.println("ť�� ��� �ִ°�? " + queue.isEmpty());
//	}
//}

//2
//import java.util.LinkedList;
//public class Test{
//	public static void main(String[] args) {
//		LinkedList<Integer> queue=new LinkedList<>();
//		 for (int i=1; i <=5; i++) queue.add(i); // 1 2 3 4 5
//		 System.out.println(queue);
//		 int v=queue.remove(2);
//		 System.out.println("���ŵ� ��="+v);
//		 System.out.println(queue); 
//	}
//}

//3
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
//		int n = 7, k = 4;
//		LinkedList<Integer> queue = new LinkedList<>();
//		for (int i = 1; i <= n; i++)
//			queue.add(i); // 1 2 3 4 5 6 7
//		int curPos = 0;
//		System.out.println(queue.get(curPos + (k - 1))); // curPos���� k��° ��� �� => 4
//		curPos = 5;
//		System.out.println(queue.get(curPos - k)); // curPos���� k��° ��� �� => 2
//	}
//}

//4-B
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
//		System.out.println(solveJosephusProblem(7, 3));
//	}
//
//	private static int solveJosephusProblem(int n, int k) {
//		LinkedList<Integer> queue = new LinkedList<Integer>();
//		for (int i = 1; i <= n; i++) {
//			queue.addLast(i);
//		}
//		while (queue.size() > 1) {
//			for (int i = 0; i < k - 1; i++) {
////				int v= queue.removeFirst();
////				queue.addLast(v);
//				queue.addLast(queue.removeFirst());
//			}
//			queue.removeFirst();
//		}
//		return queue.removeFirst();
//	}
//}