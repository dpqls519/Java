//1
//public class Test {
//	public static void main(String[] args) {
//		int n = 10;
//		System.out.print(fact(n));
//	}
//
//	private static double fact(int n) {
//		double v = 1;
//		for (int i = 2; i <= n; i++)
//			v = v * i;
//		return v;
//	}
//}

//2
//public class Test {
//	public static void main(String[] args) {
//		int n = 10;
//		System.out.println(fact(n));
//	}
//
//	private static double fact(int n) {
//		if (n == 0)
//			return 1;
//		return n * fact(n - 1);
//	}
//}

//3
//public class Test {
//	public static void main(String[] args) {
//		int m = 2, n = 10;
//		System.out.println(power(m, n));
//	}
//
//	private static long power(int m, int n) {
//		long v = 1;
//		for (int i = 0; i < n; i++)
//			v *= m;
//		return v;
//	}
//}

//4
//public class Test {
//	public static void main(String[] args) {
//		int m = 2, n = 10;
//		System.out.println(power(m, n));
//	}
//
//	private static long power(long m, long n) {
////		if (n == 0)
////			return 1;
//		if(n==1) return m;
//		return m * power(m, n - 1);
//	}
//}

//5
//public class Test {
//	public static void main(String[] args) {
//		System.out.println(power(2, 10));
//	}
//
//	private static long power(long m, long n) {
//		if (n == 0)
//			return 1;
//		return power(m * m, n / 2) * (n % 2 == 0 ? 1 : m);
//	}
//}

//6
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 7, 2, 8, 4, 1 };
//		System.out.println(sum(n, n.length - 1));
//	}
//
//	private static int sum(int[] n, int i) { // 배열 n의 i~0 위치 원소들의 총합 반환
//		System.out.println(i);
//		if (i == 0)
//			return n[i];
//		return n[i] + sum(n, i - 1); // 0~(i-1)위치 원소들의 총합 더하기 n[i]
//	}
//}

//7
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 1, 2, 3, 4, 5 };
//		System.out.println(sum(n, 0));
//	}
//
//	private static int sum(int[] n, int i) { // 배열 n의 0~n.length-1(끝) 위치 원소들의 총합 반환
//		System.out.println(i);
////		if (i == n.length - 1)
////			return n[i];
//		if(i==n.length) return 0;
//		return n[i] + sum(n, i + 1);
//	}
//}

//8-1
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 5, 1, 8, 3, 2 };
//		System.out.println(max(n, n.length - 1));
//	}
//
//	private static int max(int[] n, int i) { // 배열 n의 0~i위피 원소들의 최대값 반환
//		if (i == 0)
//			return n[i];
//		return Math.max(n[i], max(n, i - 1));
//
////		if (i == 0)
////		return n[i];// 0~0위치 원소들의 최대값
////		int v1 = n[i];
////		int v2 = max(n, i - 1);
////		if(v1>v2)return v1;
////		else return v2;
////		return (v1 > v2) ? v1 : v2;
//////		return n[i]>max(n,i-1)? n[i]:max(n,i-1);
//	}
//}

//8-2
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 5, 1, 8, 3, 2 };
//		System.out.println(max(n, 0));
//	}
//
//	private static int max(int[] n, int i) { // 배열 n의 0~i위피 원소들의 최대값 반환
//		if (i == n.length-1)
//			return n[i];
//		return Math.max(n[i], max(n, i + 1));
//	}
//}

//9
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 5, 1, 8, 3, 2 };
//		System.out.println(max(n, 0, n.length - 1));
//	}
//
//	private static int max(int[] n, int low, int high) {
//		if (low == high)
//			return n[low];
//		int mid = (low + high) / 2;
//		int v1 = max(n, low, mid);
//		int v2 = max(n, mid + 1, high);
//		return Math.max(v1,v2);
//	}
//}

//10
//public class Test {
//	public static void main(String[] args) {
//		String s = "South, Korea 안녕";
//		char v[] = s.toCharArray();
//		toUpper(v, 0);
//		System.out.println(v);
//	}
//
//	private static void toUpper(char[] v, int i) {
//		if(i==v.length) return;
//		if (v[i] >= 'a' && v[i] <= 'z') 
//			v[i] -= 32;
//		toUpper(v, i+1);
//	}
//}

//11
//public class Test {
//	public static void main(String[] args) {
//		String s = "South, Korea";
//		char v[] = s.toCharArray();
//		System.out.println(countUpper(v, 0));
//	}
//
//	private static int countUpper(char[] v, int i) {
//		int sum=0;
//		if(i==v.length) return 0;
//		if(v[i]>=65 && v[i]<=90)
//		sum++;
//		return sum+countUpper(v,i+1);
//	}
//}

//12
//public class Test {
//	public static void main(String[] args) {
//		String s = "ABCDEDCBA";
//		System.out.println(palindrome(s, 0));
//	}
//
//	  private static boolean palindrome(String s, int i) {
//	      if (i == s.length() / 2) 
//	         return true;
//	      if (s.charAt(i) == s.charAt(s.length() - 1 - i))
//	         return palindrome(s, i + 1);
//	      else
//	         return false;
//	   }
//}

//13
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		reverse(n, 0);
//		System.out.println(Arrays.toString(n));
//	}
//
//	private static void reverse(int[] n, int i) {
//		if (i < n.length / 2) {
//			int temp;
//			temp = n[i];
//			n[i] = n[n.length - 1 - i];
//			n[n.length - 1 - i] = temp;
//			reverse(n, i + 1);
//		}
//	}
//}

//16
//public class Test {
//	public static void main(String[] args) {
//		System.out.println(fibo(50));
//	}
//
//	private static long fibo(int n) {
//		if (n < 2)
//			return n;
//		return fibo(n - 2) + fibo(n - 1);
//	}
//}

//17 (DP동적프로그래밍)
//public class Test {
//	public static void main(String[] args) {
//		System.out.println(fibo(50));
//	}
//
//	private static long fibo(int n) {
//		long memo[] = new long[n + 1];  //0으로 초기화
//		return fiboMemo(n, memo);
//	}
//
//	private static long fiboMemo(int n, long[] memo) {
//		if (memo[n] > 0)   //0이 아닌지 검사
//			return memo[n];
//		if (n < 2)
//			memo[n] = n;
//		else
//			memo[n] = fiboMemo(n - 2, memo) + fiboMemo(n - 1, memo);
//		return memo[n];
//	}
//}

//18-1
//public class Test {
//	public static void main(String[] args) {
//		System.out.println(fibo(50));
//	}
//
//	private static long fibo(int n) {
//		long n1 = 0, n2 = 1;
//		long n3 = 0;
//		for (int i = 2; i <= n; i++) {
//			n3 = n1 + n2;
//			n1 = n2;
//			n2 = n3;
//		}
//		return n3;
//	}
//}

//18-2
//public class Test {
//	public static void main(String[] args) {
//		System.out.println(fibo(50));
//	}
//
//	private static long fibo(int n) {
//		if(n<2) return n;
//		long memo[] = new long[n + 1]; // 0으로 초기화
//		memo[0] = 0;
//		memo[1] = 1;
//		for (int i = 2; i <= n; i++) {
//			memo[i] = memo[i - 2] + memo[i - 1];
//		}
//		return memo[n];
//	}
//}

//19
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int n[] = { 3, 4 };
		System.out.println(Arrays.toString(n));
		swap(n[0],n[1]);
		System.out.println(Arrays.toString(n));
	}

	private static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
}