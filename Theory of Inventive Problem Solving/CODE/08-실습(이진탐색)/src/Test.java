

//1-1
/*import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int v[] = new int[] { 5, 8, 1, 9, 3, 5, 1, 5 };
		bubbleSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void bubbleSort(int[] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 1; j < v.length-i; j++) {
				if (v[j - 1] > v[j]) { // 인접 자료 간 순서 맞지 않으면 교환
					int temp = v[j];
					v[j] = v[j - 1];
					v[j - 1] = temp;
				}
			}
		}
	}
}*/

//1-2
/*import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int v[] = new int[] { 5, 8, 1, 9, 3, 5, 1, 5 };
		bubbleSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void bubbleSort(int[] v) {
		for (int i = 0; i < v.length; i++) {
			int n=0;
			for (int j = 1; j < v.length; j++) {
				if (v[j - 1] > v[j]) { // 인접 자료 간 순서 맞지 않으면 교환
					int temp = v[j];
					v[j] = v[j - 1];
					v[j - 1] = temp;
					n=1;
				}
				else if(n==0) 
					continue;
			}
		}
	}
}*/

//2
/*import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int v[] = new int[] { 5, 8, 1, 9, 3, 5, 1, 5 };
		selectionSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void selectionSort(int[] v) {
		for (int i = 0; i < v.length-1; i++) {
			int minPos = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[minPos] > v[j])
					minPos = j;
			}
			if(v[minPos]==v[i]) {
				int x = v[i+1];
				v[i+1] = v[minPos];
				v[minPos] = x;
			}
			else {
			int x = v[i];
			v[i] = v[minPos];
			v[minPos] = x;
			}
		}
	}
}*/

//3
//import java.util.Arrays;
//public class Test {
//	public static void main(String[] args) {
//		int v[] = new int[] { 5, 8, 1, 9, 3, 5, 1, 5 };
//		insertionSort(v);
//		System.out.println(Arrays.toString(v));
//	}
//
//	private static void insertionSort(int[] v) {
//		int size = v.length;
//		int temp,j;
//		for (int i = 1; i < size; i++) {
//			temp = v[i];
//			for (j = i - 1; j >= 0 && temp < v[j]; j--) {
//				v[j + 1] = v[j];
//			}
//			v[j + 1] = temp;
//		}
//	}
//}

//4
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 1, 3, 5, 7, 8 };
//		int m[] = { 2, 4, 6, 7, 10 };
//		int v[] = mergeArray(n, m);
//		System.out.println(Arrays.toString(v));
//	}
//
//	private static int[] mergeArray(int[] n, int[] m) {
//		int i = 0, j = 0, k = 0;
//		int v[] = new int[n.length + m.length];
//		while (i < n.length && j < m.length) {
//			v[k++] = (n[i] < m[j]) ? n[i++] : m[j++];
////			if(n[i]<m[j])
////				v[k++]=n[i++];
////			else
////				v[k++]=m[j++];
//		}
//		while (i < n.length)
//			v[k++] = n[i++];
//		while (j < m.length)
//			v[k++] = m[j++];
//		return v;
//	}
//}

//5
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int v[] = { 1, 3, 5, 7, 8, 2, 4, 6, 7, 10 };
//		mergeArray(v, 0, 4, 5, 9); // v의 부분 배열들 v[0..4], v[5..9]이 정렬된 상태임
//		System.out.println(Arrays.toString(v));
//	}
//
//	private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
//		int w[] = new int[right2 - left1 + 1];
//		int i = left1, j = left2, k = 0;
//		while (i <= right1 && j < right2)
//			w[k++] = (v[i] < v[j]) ? v[i++] : v[j++];
//		while (i < right1)
//			w[k++] = v[i++];
//		while (j < right2)
//			w[k++] = v[j++];
//		for (i = left1, k = 0; k < w.length;)
//			v[i++] = w[k++];
//	}
//}

//13
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String args[]) {
//		int v[] = { 87, 98, 53, 77, 100, 14 };
//		sort(v);
//		System.out.println(Arrays.toString(v));
//	}
//
//	private static void sort(int[] v) {
//		int c[] = new int[101];
//		for (int i = 0; i < v.length; i++) {
//			c[v[i]]++;
//		}
//		for (int i = 0, k = 0; i < c.length; i++) {
//			if (c[i] > 0)
//				v[k++] = i;
//		}
//	}
//}

//14
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String args[]) {
//		int v[] = { 87, 95, 53, 77, 100, 95, 14 };
//		sort(v);
//		System.out.println(Arrays.toString(v));
//	}
//
//	private static void sort(int[] v) {
//		int c[] = new int[101]; // index(0-100)
//		for (int i = 0; i < v.length; i++) {
//			c[v[i]]++;
//		}
//		for (int i = 0, k = 0; i < c.length; i++) {
////			for (int j = 0; j < c[i]; j++) {
////				v[k++] = i;
////			}
//			while (c[i]-- > 0)
//				v[k++] = i;
//		}
//	}
//}

//15
//import java.util.Arrays;

//public class Test {
//	public static void main(String args[]) {
//		int v[] = { 10005, 10002, 10002, 10001, 10003 };
//		sort(v);
//		System.out.println(Arrays.toString(v));
//	}
//
//	private static void sort(int[] v) {
//		int min = v[0], max = v[0];
//		for (int i = 0; i < v.length; i++) {
//			if (min > v[i])
//				min = v[i];
//			if (max < v[i])
//				max = v[i];
//		}
//		int c[] = new int[max - min + 1];
//		for (int i = 0; i < v.length; i++)
//			c[v[i] - min]++;
//		for (int i = 0, k = 0; i < c.length; i++) {
//			while (c[i]-- > 0)
//				v[k++] = i + min;
//		}
//	}
//}

//16

//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 5, 8, 1, 9, 3, 5, 1, 5 };
//		countingSort(n, 10); // 최대값 10
//		System.out.println(Arrays.toString(n));
//	}
//
//	private static void countingSort(int[] n, int max) {
//		int m[] = new int[n.length], count[] = new int[max + 1];
//		for (int i = 0; i < n.length; i++)
//			count[n[i]]++;
//		for (int i = 1; i < count.length; i++)
//			count[i] += count[i - 1];
//		for (int i = n.length - 1; i >= 0; i--)
//			m[--count[n[i]]] = n[i];
//		for (int i = 0; i < m.length; i++)
//			n[i] = m[i];
//	}
//}
