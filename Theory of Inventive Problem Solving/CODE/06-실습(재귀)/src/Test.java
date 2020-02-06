//1
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
//		LinkedList<String> queue = new LinkedList<>();
//		queue.addLast("한국");   // 큐 rear에 자료 삽입, queue.add("한국");
//		queue.addLast("미국");   // 큐 rear에 자료 삽입
//		queue.addLast("독일");   // 큐 rear에 자료 삽입
//		System.out.println("큐 전체 내용 : " + queue);
//		System.out.println("큐 크기 : " + queue.size());
//		System.out.println("큐 가 비어 있는가? : " + queue.isEmpty());
//		String v = null;
//		v = queue.getFirst();
//		System.out.println("큐 front 자료 확인=" + v);
//		v = queue.removeFirst();  // String v=queue.remove();
//		System.out.println("큐 front 추출 값=" + v);
//		System.out.println("큐 전체 내용: " + queue);
//		System.out.println("큐 front 추출 값=" + queue.removeFirst());
//		System.out.println("큐 전체 내용: " + queue);
//		System.out.println("큐 front 추출 값=" + queue.removeFirst());
//		System.out.println("큐 전체 내용: " + queue);
//		System.out.println("큐가 비어 있는가? " + queue.isEmpty());
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
//		 System.out.println("제거된 값="+v);
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
//		System.out.println(queue.get(curPos + (k - 1))); // curPos부터 k번째 노드 값 => 4
//		curPos = 5;
//		System.out.println(queue.get(curPos - k)); // curPos부터 k번째 노드 값 => 2
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