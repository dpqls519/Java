//2920
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		int a = 0, b = 0;
//		int data[] = new int[8];
//		int data1[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
//		for (int i = 0; i < data.length; i++) {
//			data[i] = in.nextInt();
//		}
//		for (int i = 0; i < data.length; i++) {
//			if (data[i] == data1[i])
//				a++;
//			else if (data[i] == data1[data1.length - i - 1])
//				b++;
//		}
//		if (a == 8)
//			System.out.println("ascending");
//		else if (b == 8)
//			System.out.println("descending");
//		else
//			System.out.println("mixed");
//	}
//}

//2577
//import java.util.Scanner;
//public class Main{
//	public static void main(String args[]) {
//		Scanner in=new Scanner(System.in);
//		int[] counts=new int[10];
//		int A=in.nextInt();
//		int B=in.nextInt();
//		int C=in.nextInt();
//		int num=A*B*C;
//		while (num>0) {
//			 counts[num % 10]++;
//	            num /= 10;
//		}
//		for (int i = 0; i < counts.length; i++) {
//			System.out.println(counts[i]);
//		}
//	}
//}

//3052
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String args[]) {
//		int data[] = new int[10];
//		Scanner in = new Scanner(System.in);
//		for (int i = 0; i < data.length; i++) {
//			data[i] = in.nextInt();
//			data[i] = data[i] % 42;
//		}
//		int a = 1;
//		Arrays.sort(data);
//		for (int i = 0; i < data.length - 1; i++) {
//			if (data[i] != data[i + 1])
//				a++;
//		}
//		System.out.println(a);
//	}
//}

//8958
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		String[] cases = new String[N];
//		for (int i = 0; i < N; i++) {
//			cases[i] = sc.next();
//		}
//		sc.close();
//
//		int count, total;
//		for (String OXresult : cases) {
//			count = 0;
//			total = 0;
//			for (int i = 0; i < OXresult.length(); ++i) {
//				if (OXresult.charAt(i) == 'O') {
//					total += ++count;
//				} else {
//					count = 0;
//				}
//			}
//			System.out.println(total);
//		}
//	}
//}