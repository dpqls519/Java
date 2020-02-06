
//배열
//import java.util.Arrays;
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		int n[] = new int[10];
//		for (int i = 0; i < 5; i++)
//			n[i] = i + 1; // 잘못된 거
//		System.out.println(Arrays.toString(n));
//
//		for (int i = 0; i <= 4; i++)
//			n[i + 1] = n[i]; // 잘못된 거 배열에 있는 걸 삭제하고 싶을때
//		System.out.println(Arrays.toString(n));
//
//		for (int i = 4; i <= 0; i--)
//			n[i + 1] = n[i];
//		System.out.println(Arrays.toString(n));
//	}
//}

//연결리스트
//import java.util.LinkedList;

//public class Test {
//	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(5);   //addList
//		list.add(8);
//		list.add(4);
//		System.out.println(list);
//	}
//}

//2번
//import java.util.LinkedList;
//public class Test{
//	public static void main(String[] args) {
//		LinkedList<Integer> list=new LinkedList<>();
//		for(int i=1;i<=100;i++)
//			list.add(i);
//		System.out.println(list);
//	}
//}

//3번
//import java.util.LinkedList;
//public class Test{
//	public static void main(String[] args) {
//		LinkedList<String> list=new LinkedList<>();
//			list.add("한국");
//			list.add("미국");
//			list.add("일본");
//		System.out.println(list);
//	}
//}

//4번
//import java.util.LinkedList;
//public class Test {
//	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(77);
//		list.add(99);
//		list.add(88);
//		int v1 = list.get(0);
//		int v2 = list.get(1);
//		int v3 = list.get(2);
//		System.out.println(v1);
//		System.out.println(v2);
//		System.out.println(v3);
//	}
//}

//5번
//import java.util.LinkedList;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//		Random random=new Random();
//		LinkedList<Integer> list = new LinkedList<>();
//		for (int i = 1; i <= 1000000; i++) {
//			list.add(random.nextInt(100));
//		}
//		System.out.println(list.get(99998));
//	}
//}

//6번
//import java.util.LinkedList;
//public class Test {
//	public static void main(String[] args) {
//		int N = 10000; // 자료 개수 
//		int s[]=new int[N]; // 배열 생성 
//		for (int i=0; i < N; i++) s[i]=i; // 배열 내 자료 저장
//		LinkedList<Integer> list=new LinkedList<>(); // 리스트 생성 
//		for (int i=0; i< N; i++) list.add(i); // 리스트 내 자료 삽입
//
//		long start;
//		start = System.currentTimeMillis();
//		for (int i = 0; i < N; i++) {
//			int v = s[i];
//		}
//		System.out.println((System.currentTimeMillis() - start) + " ms");
//		start = System.currentTimeMillis();
//		for (int i = 0; i < N; i++) {
//			int v = list.get(i);
//		}
//		System.out.println((System.currentTimeMillis() - start) + " ms");
//	}
//}

//7
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(77);
//		list.add(99);
//		list.add(88);
//		list.remove(1);
//		System.out.println(list);
//	}
//}

//8
//import java.util.LinkedList;
//public class Test{
//	public static void main(String[] args) {
//		LinkedList<Integer> list=new LinkedList<>();
//		for(int i=1;i<=100;i++)
//			list.add(i);
//		list.remove(list.get(2));
//		System.out.println(list);
//	}
//}

//9
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 3, 4, 5, 6, 7, 0, 0, 0, 0, 0 };
//		for (int i = 4; i >= 0; i--)
//			n[i + 1] = n[i]; // n[0..4]를 n[1..5]로 이동
//		n[0] = 2; // n[0]에 2를 삽입
//		System.out.println(Arrays.toString(n)); // [2,3,4,5,6,7,0,0,0,0]
//	}
//}

//10 왼쪽으로 땡겨
//import java.util.Arrays;
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 3, 4, 5, 6, 7, 0, 0, 0, 0, 0 };
//		for (int i = 0; i < 5; i++)
//			n[i] = n[i + 1];
//		System.out.println(Arrays.toString(n));
//	}
//}

//11
//import java.util.LinkedList;
//public class Test {  
//	public static void main(String[] args) { 
//		LinkedList<Integer> list=new LinkedList<>();
//		list.add(1); // list.addLast(1)와 동일   
//		list.add(2);   
//		list.add(3);   
//		list.addFirst(7);  
//		System.out.println(list);  
//		} 
//	}

//12
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
//		long start;
//		int N = 10000; // 자료 개수
//		int s[] = new int[N]; // 배열 생성
//		LinkedList<Integer> list = new LinkedList<>(); // 리스트 생성
//		start = System.currentTimeMillis();
//		for (int i = 0; i < N; i++) {
//			for (int j = i - 1; j >= 0; j--)
//				s[j + 1] = s[j]; // 배열 자료 전체 오른쪽 한칸 이동
//			s[0] = i; // 배열 0번째 위치에 자료 삽입 }
//			System.out.println((System.currentTimeMillis() - start) + " ms");
//			start = System.currentTimeMillis();
//			for (i = 0; i < N; i++)
//				list.addFirst(i); // 연결리스트 0번째 위치에 자료 삽입
//			System.out.println((System.currentTimeMillis() - start) + " ms");
//		}
//	}
//}

//13

//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		char s[] = { '화', '수', '목', '금', '토', '일' };
//		System.out.println("삽입 전: "+Arrays.toString(s)); // 삽입 전
//		char t[] = new char[s.length + 1];
////		System.arraycopy(s, 0, t, 1, s.length);   
//		t[0] = '월';
////		s=t;   
////		System.out.println(Arrays.toString(s)); // 삽입 후 
//		for (int i = 0; i < s.length; i++) {
//			t[i + 1] = s[i];
//		}
//		System.out.println("삽입 후: "+Arrays.toString(t));
//	}
//}

