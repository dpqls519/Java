
//�迭
//import java.util.Arrays;
//
//public class Test {
//
//	public static void main(String[] args) {
//
//		int n[] = new int[10];
//		for (int i = 0; i < 5; i++)
//			n[i] = i + 1; // �߸��� ��
//		System.out.println(Arrays.toString(n));
//
//		for (int i = 0; i <= 4; i++)
//			n[i + 1] = n[i]; // �߸��� �� �迭�� �ִ� �� �����ϰ� ������
//		System.out.println(Arrays.toString(n));
//
//		for (int i = 4; i <= 0; i--)
//			n[i + 1] = n[i];
//		System.out.println(Arrays.toString(n));
//	}
//}

//���Ḯ��Ʈ
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

//2��
//import java.util.LinkedList;
//public class Test{
//	public static void main(String[] args) {
//		LinkedList<Integer> list=new LinkedList<>();
//		for(int i=1;i<=100;i++)
//			list.add(i);
//		System.out.println(list);
//	}
//}

//3��
//import java.util.LinkedList;
//public class Test{
//	public static void main(String[] args) {
//		LinkedList<String> list=new LinkedList<>();
//			list.add("�ѱ�");
//			list.add("�̱�");
//			list.add("�Ϻ�");
//		System.out.println(list);
//	}
//}

//4��
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

//5��
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

//6��
//import java.util.LinkedList;
//public class Test {
//	public static void main(String[] args) {
//		int N = 10000; // �ڷ� ���� 
//		int s[]=new int[N]; // �迭 ���� 
//		for (int i=0; i < N; i++) s[i]=i; // �迭 �� �ڷ� ����
//		LinkedList<Integer> list=new LinkedList<>(); // ����Ʈ ���� 
//		for (int i=0; i< N; i++) list.add(i); // ����Ʈ �� �ڷ� ����
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
//			n[i + 1] = n[i]; // n[0..4]�� n[1..5]�� �̵�
//		n[0] = 2; // n[0]�� 2�� ����
//		System.out.println(Arrays.toString(n)); // [2,3,4,5,6,7,0,0,0,0]
//	}
//}

//10 �������� ����
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
//		list.add(1); // list.addLast(1)�� ����   
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
//		int N = 10000; // �ڷ� ����
//		int s[] = new int[N]; // �迭 ����
//		LinkedList<Integer> list = new LinkedList<>(); // ����Ʈ ����
//		start = System.currentTimeMillis();
//		for (int i = 0; i < N; i++) {
//			for (int j = i - 1; j >= 0; j--)
//				s[j + 1] = s[j]; // �迭 �ڷ� ��ü ������ ��ĭ �̵�
//			s[0] = i; // �迭 0��° ��ġ�� �ڷ� ���� }
//			System.out.println((System.currentTimeMillis() - start) + " ms");
//			start = System.currentTimeMillis();
//			for (i = 0; i < N; i++)
//				list.addFirst(i); // ���Ḯ��Ʈ 0��° ��ġ�� �ڷ� ����
//			System.out.println((System.currentTimeMillis() - start) + " ms");
//		}
//	}
//}

//13

//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		char s[] = { 'ȭ', '��', '��', '��', '��', '��' };
//		System.out.println("���� ��: "+Arrays.toString(s)); // ���� ��
//		char t[] = new char[s.length + 1];
////		System.arraycopy(s, 0, t, 1, s.length);   
//		t[0] = '��';
////		s=t;   
////		System.out.println(Arrays.toString(s)); // ���� �� 
//		for (int i = 0; i < s.length; i++) {
//			t[i + 1] = s[i];
//		}
//		System.out.println("���� ��: "+Arrays.toString(t));
//	}
//}

