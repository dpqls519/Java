
//이진트리

//1
public class Test {
	public static void main(String[] args) {   
		BinarySearchTree tree=new BinarySearchTree();
		int n[]={50,20,70,10,30,5,15,25,60,90,62,65,64,35};
		for (int i = 0; i < n.length; i++) tree.add(n[i]);   
		System.out.println(tree.search(30));   
		System.out.println(tree.search(33));   
		System.out.println(tree);   
		System.out.println(BinarySearchTree.inorder(tree.root));  
		} 
	}

//2
//import java.util.TreeSet;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 50, 20, 70, 10, 30, 5, 15, 25, 60, 90, 62, 65, 64, 35 };
//		TreeSet<Integer> tree = new TreeSet<>();
//		for (int i = 0; i < n.length; i++)
//			tree.add(n[i]); // 이진탐색트리에 자료 삽입
//		System.out.println(tree);
//		System.out.println(tree.size()); // 트리 내 총 자료 개수 반환
//		tree.remove(20); // key 값 20 삭제
//		System.out.println(tree);
//		System.out.println(tree.contains(30)); // key 값 30이 존재하는 경우 true 반환
//		System.out.println(tree.contains(33)); // key 값 33이 존재하지 않는 경우 false 반환
//		System.out.println(tree);
//	}
//}

//3
//import java.util.TreeMap;
//
//public class Test {
//	public static void main(String[] args) {
//		TreeMap<String, Integer> map = new TreeMap<>();
//		map.put("Korea", 32); // <key, value>가 <"Korea", 32>인 자료 삽입
//		map.put("Japan", 50);
//		map.put("China", 16);
//		System.out.println(map);
//		map.remove("Japan"); // key 값 "Japan"에 해당하는 자료 삭제
//		System.out.println(map);
//		System.out.println(map.size()); // 트리 내 총 자료 개수 반환
//		System.out.println(map.get("Korea")); // key 값 "Korea"에 대응되는 value 반환
//		System.out.println(map.get("Germany")); // key 값 부재 시 null 반환
//	}
//}

//이진힙
//1
//public class Test {
//	public static void main(String[] args) {
//		int v[] = { 4, 2, 9, 5, 7, 5, 8, 10, 15 };
//		SimpleHeap heap = new SimpleHeap();
//		for (int i = 0; i < v.length; i++) {
//			heap.add(v[i]);
//			System.out.println(heap);
//		}
//		for (int i = 0; i < v.length; i++) {
//			System.out.println(heap.remove() + "=>" + heap);
//		}
//	}
//}

//2
//import java.util.PriorityQueue;
//
//public class Test {
//	public static void main(String[] args) {
//		int v[] = { 4, 2, 9, 5, 7, 5, 8, 10, 15 };
//		PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap
//		// PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); //
//		// max-heap
//		for (int i = 0; i < v.length; i++) {
//			pq.add(v[i]);
//			System.out.println(pq);
//		}
//		System.out.println("최소값=" + pq.peek()); // 삭제하지 않고 큐의 root값 반환
//		for (int i = 0; i < v.length; i++) {
//			System.out.println(pq.remove() + "=>" + pq);
//		}
//	}
//}

//3
//import java.util.ArrayList;
//import java.util.PriorityQueue;
//
//public class Test {
//	public static void main(String[] args) {
//		int v[] = { 4, 2, 9, 5, 7, 5, 8, 10, 15 };
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = 0; i < v.length; i++)
//			list.add(v[i]);
//		PriorityQueue<Integer> pq = new PriorityQueue<>(list); // 최소힙 생성
//		System.out.println("최소값=" + pq.peek()); // 삭제하지 않고 큐의 root값 반환
//		for (int i = 0; i < v.length; i++) {
//			System.out.println(pq.remove() + "=>" + pq);
//		}
//	}
//}

//4
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
//import java.util.Random;
//import java.util.TreeSet;
//
//public class Test {
//	public static void main(String[] args) {
//		Random random = new Random();
//		int N = 1000000;
//		ArrayList<Integer> list = new ArrayList<>();
//		int v[] = new int[N];
//		for (int i = 0; i < N; i++) {
//			int value = random.nextInt(N);
//			list.add(value);
//			v[i] = value;
//		}
//		long start;
//
//		// PriorityQueue add
//		start = System.currentTimeMillis();
//		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
//		for (int i = 0; i < v.length; i++)
//			pq1.add(v[i]);
//		for (int i = 0; i < 10; i++)
//			System.out.print(pq1.remove() + " ");
//		System.out.println(" ... " + (System.currentTimeMillis() - start) + " ms (PriorityQueue-add)");

//		//PriorityQueue build
//		start = System.currentTimeMillis();
//		PriorityQueue<Integer> pq2 = new PriorityQueue<>(list);
//		for (int i = 0; i < 10; i++)
//			System.out.print(pq2.remove() + " ");
//		System.out.println(" ... " + (System.currentTimeMillis() - start) + " ms (PriorityQueue-build)");
//
//		// TreeSet add
//		start = System.currentTimeMillis();
//		TreeSet<Integer> bst = new TreeSet<>();
//		for (int i = 0; i < v.length; i++)
//			bst.add(v[i]);
//		for (int i = 0; i < 10; i++) {
//			Integer n = bst.first();
//			System.out.print(n + " ");
//			bst.remove(n);
//		}
//		System.out.println(" ... " + (System.currentTimeMillis() - start) + " ms (TreeMap)");
//
//		// Sort
//		start = System.currentTimeMillis();
//		Arrays.sort(v);
//		for (int i = 0; i < 10; i++)
//			System.out.print(v[i] + " ");
//		System.out.println(" ... " + (System.currentTimeMillis() - start) + " ms (Arrays.sort())");
//	}
//}

//5
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String args[]) {
//		int heap[] = { 3, 1, 2, 8, 7, 9, 4, 6, 5, 4 };
//		int last = heap.length - 1;
//		for (int i = heap.length / 2; i >= 0; i--)
//			heapifyDown(heap, last, i);
//		System.out.println(Arrays.toString(heap));
//		System.out.println("최대값="+peek(heap)); // 최대값 출력 
//		for (int i = 0; i < 5;i++) { // 상위 5개 자료 추출 
//			System.out.print(remove(heap, last--)+" "); // 각 추출후 힙 크기 1 감소
//			System.out.println(" ");
//		}    
//	}
//
//	private static int peek(int[] heap) {
//	return heap[0];
//	}
//	
//	private static int remove(int[] heap, int last) {
//	int data=heap[0];
//	heap[0]=heap[last--];
//		heapifyDown(heap, last, 0);
//		return data;
//	}
//
//	private static void heapifyDown(int[] heap, int last, int p) {
//		for (int c = 2 * p + 1; c <= last; p = c, c = 2 * p + 1) {
//			if (c < last && heap[c] > heap[c + 1])
//				c++;
//			if (heap[p] <= heap[c])
//				break;
//			int temp = heap[c];
//			heap[c] = heap[p];
//			heap[p] = temp;
//		}
//	}
//}