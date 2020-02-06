
//1
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//		int v[] = new int[1000000];
//		Random random = new Random();
//		for (int i = 0; i < v.length; i++)
//			v[i] = random.nextInt(1000000);
//		int key = 1234;
//		System.out.println(search(v, key));
//	}
//
//	private static int search(int[] v, int key) {
//		for (int i = 0; i < v.length; i++) {
//			if(v[i]==key) return i;
//		}
//		return -1;
//	}
//}

//2
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//		int v[] = new int[100];
//		Random random = new Random();
//		for (int i = 0; i < v.length; i++) {
//			v[i]=random.nextInt(100);
//		}
//		Arrays.sort(v); // �迭 ����
//		int key = 8;
//		int index = Arrays.binarySearch(v, key); // ���ĵ� �迭 �� �ڷ� ��ġ ���� Ž��
//		if (index < 0)
//			System.out.println("�迭 �� �ڷ� ����");
//		else
//			System.out.println("�ڷ� �߰� ��ġ(�迭 �� index): " + index);
//	}
//}

//3
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	   public static void main(String[] args) {
//		   int v[] = new int[1000000];
//			Random random = new Random();
//			for (int i = 0; i < v.length; i++) {
//				v[i]=random.nextInt(1000000);
//			}
//	      Arrays.sort(v); // �迭 ����
//	      int key = 8;
//	      int index = binarySearch(v, 0, v.length - 1, key); // ���ĵ� �迭 �� �ڷ� ��ġ ���� Ž��
//	      if (index < 0)
//	         System.out.println("�迭 �� �ڷ� ����");
//	      else
//	         System.out.println("�ڷ� �߰� ��ġ(�迭 �� index): " + index);
//	   }
//
//	   private static int binarySearch(int[] v, int left, int right, int key) {
//	      if (left > right)
//	         return -1;
//	      int m = (left + right) / 2;
//	      if (key == v[m])
//	         return m;
//	      if (key < v[m])
//	         return binarySearch(v, left, m - 1, key);
//	      else
//	         return binarySearch(v, m + 1, right, key);
//	   }
//	}

//	private static int binarySearch(int[] v, int key) {
//		int left = 0, right = v.length - 1;
//		while (left <= right) {
////			int m = (left + right) / 2;        //�����߻��κ�
//			int m = left + (right-left) / 2;
//			if (key == v[m])
//				return m;
//			if (key < v[m])
//				right = m - 1;
//			else
//				left = m + 1;
//		}                                            
//		return -1;
//	}
//}

	
//public class Test {
//	public static void main(String[] args) {
//		int v[] = { 1, 2, 3, 4, 5 };
//		int key = 7;
//		System.out.println(search(v, key));
//	}
//
//	private static int search(int v[], int key) {
//		int i = 0;
//		int lastValue = v[v.length - 1];
//		v[v.length-1] = key;
//		while (v[i] != key)
//			i++;
//		v[v.length-1]=lastValue;     //����
//		if (i < v.length - 1)
//			
//			return i;
//		if(key ==lastValue)return v.length-1;
//		
//		return -1;
//		
//	}

//	private static int search(int v[],int key) {
//		for (int i = 0; i < v.length; i++) {
//			if(v[i]==key) return i;
//		}
//		return -1;
//	}
//}