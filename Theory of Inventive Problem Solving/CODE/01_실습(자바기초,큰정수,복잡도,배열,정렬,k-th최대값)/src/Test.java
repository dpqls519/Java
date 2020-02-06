import java.util.Arrays;

//2번
//import java.math.BigInteger;
//import java.util.Arrays;
//import java.util.Random;
//		
//public class Test {
//	public static void main(String[] args) {
//		String title = "자료구조";
//		int publicationYear = 2017;
//		double time = 2.5;
//		boolean supplementYN = true;
//		char language = '한';
//		System.out.println("- 영화제목:" + title + "\n- 개봉년도:" + publicationYear + "\n- 상영시간(시간):" + time + "\n- 더빙판존재유무:"
//				+ supplementYN + "\n- 언어:" + language);
//	}
//}
//	4번
//public class Test {
//	public static void main(String[] args) {
//		int n = 1;
//		int m = 2;
//		System.out.println((float) n / m);
//	}
//}

// 5번
//public class Test {
//	public static void main(String[] args) {
//		int n = 5;
//		int m = 2;
//		System.out.println(n / m);
//		System.out.println(n % m);
//	}
//}

// 6번
//public class Test {
//	public static void main(String[] args) {
//		int n = 987654321;
//		int k = 4;
//		int i = n / 1000;
//		System.out.println(i % 10);
//	}
//}

//	8번
//public class Test {
//	public static void main(String[] args) {
//		String n = "20000000000";
//		BigInteger n1 = new BigInteger(n);
//		System.out.println(n);
//	}
//}

//	9번
//public class Test {
//	public static void main(String[] args) {
//		String n = "2000000000";
//		BigInteger n1 = new BigInteger(n);
//		System.out.println(n1.add(n1));
//	}
//}

//	10번
//public class Test {
//	public static void main(String[] args) {
//		String s1="999999999999999999999999999999999999999999999";
//		String s2="888888888888888888888888888888888888";
//		String s3 = "";
//		int x = 0;
//		int y = 0;
//		while (s1.length() != s2.length()) {
//			s2 = "0" + s2;
//
//		}
//		for (int i = 1; i <= s1.length(); i++) {
//			char a1 = s1.charAt(s1.length() - i);
//			char a2 = s2.charAt(s2.length() - i);
//			int sum = (int) a1 + (int) a2 - ('0' * 2) + x;
//			if (sum >= 10) {
//				x = sum / 10;           //몫
//				y = sum % 10;           //나머지
// 				s3 = y + s3;
//				
//			} else {
//				x = 0;
//				s3 = sum + s3;
//			}
//		}
//			if (x == 1) {
//				s3 = x + s3;
//				System.out.println(s3);
//			} else 
//				System.out.println(s3);
//	}
//}

//10번-2

//import java.math.BigInteger;
//
//public class Test {
//	public static void main(String[] args) {
//		String s1 = "999999999999999999999999999999999999999999999";
//		String s2 = "888888888888888888888888888888888888";
//		BigInteger n1 = new BigInteger(s1);
//		BigInteger n2 = new BigInteger(s2);
//		System.out.println(n1.add(n2));
//		
//		String zeros="",v="";
//		for(int i=0;i<Math.abs(s1.length()-s2.length());i++) {
//			zeros = zeros+"0";
//		}
//		if(s1.length()>s2.length()) s2=zeros+s2;
//		else s1=zeros+s1;
//		int carry = 0;
//		for(int i =s1.length()-1;i>=0;i--) {
//			int sum=carry +s1.charAt(i)-'0'+s2.charAt(i)-'0';
//			v=(sum%10)+v;
//		}
//	}
//}

//	12번

//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 77, 88, 99 };
//		String v = "";
//		for (int i = 0; i < n.length; i++) {
//			v = v + n[i];
//			if(i==n.length-1)
//				break;
//			v = v + ",";
//			}
//		
//		System.out.println("[" + v + "]");
//	}
//}

//  13번

//		Random random = new Random();
//		int v = random.nextInt(3);
//		System.out.println(v);

//  14번
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//
//		Random random = new Random();
//		int n[] = new int[20];
//		for (int i = 0; i < n.length; i++) {
//			n[i] = random.nextInt(6)+1;
//		}
//		System.out.println(Arrays.toString(n));
//	}
//}

//15번
//import java.util.Random;
//public class Test{
//	public static void main(String[] args) {
//		Random random = new Random();
//		int a=0,b=0,c=0,d=0,e=0,f=0;
//		int n[] = new int[6000];
//		for (int i = 0; i < n.length; i++) {
//			n[i] = random.nextInt(6)+1;
//			if(n[i]==1)
//				a++;
//			else if(n[i]==2)
//				b++;
//			else if(n[i]==3)
//				c++;
//			else if(n[i]==4)
//				d++;
//			else if(n[i]==5)
//				e++;
//			else if(n[i]==6)
//				f++;
//		}
//		System.out.println("["+a+","+b+","+c+","+d+","+e+","+f+"]");
//	}
//}

//15-2
//import java.util.Arrays;
//import java.util.Random;
//public class Test{
//	public static void main(String[] args) {
//		int c[]=new int[6];
//		Random random = new Random();
//		for (int i = 0; i < 6000; i++) {
//			int v=random.nextInt(6);
//			c[v]++;	
//		}
//		System.out.println(Arrays.toString(c));
//	}
//}

//	17번 반복문안에서 출력  (대칭적인 위치에 있는 숫자 교환,반만)
//for( 어디서부터; 어디까지; 증감식)

// 18번 반복문 밖에서 출력
//import java.util.Arrays;
//
//public class Test{
//	public static void main(String[] args) {
//		int x;
//		int n[]= {5,7,9,1,3,5,8,2,4,9};
//		Arrays.sort(n);
//		for(int i=0;i<n.length/2;i++) {
//			x=n[i];
//			n[i]=n[n.length-i-1];
//			n[n.length-i-1]=x;
//		}
//		System.out.println(Arrays.toString(n));
//	}
//}

//18-2

//import java.util.Arrays;
//
//public class Test{
//	public static void main(String[] args) {
//		int n[]= {5,7,9,1,3,5,8,2,4,9};
//		Arrays.parallelSort(n);
//		for (int i = 0; i < n.length/2; i++) {
//			int temp=n[i];
//			n[i]=n[n.length-1-i];
//			n[n.length-1-i]=temp;
//		}
//		System.out.println(Arrays.toString(n));
//	}
//}

//21번
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//		long start;
//		int N = 1000000, M = 100;
//		int n[] = new int[N];
//		Random random = new Random();
//		for (int i = 0; i < N; i++)
//			n[i] = random.nextInt(M);
//		start = System.currentTimeMillis();
//		Arrays.sort(n); // 배열 정렬
//		System.out.println("최대값:" + n[n.length - 1]); // 최대값 출력
//		System.out.println("소요시간:" + (System.currentTimeMillis() - start) + " ms"); // 소요 시간 출력
//		for (int i = 0; i < N; i++)
//			n[i] = random.nextInt(M);
//		start = System.currentTimeMillis();
//		int max = n[0];
//		for (int i = 1; i < n.length; i++) {
//			if (n[i] > max)
//				max = n[i];
//		}
//		System.out.println("최대값:" + max); // 최대값 출력
//		System.out.println("소요시간:" + (System.currentTimeMillis() - start) + " ms"); // 소요 시간 출력
//	}
//}

//22번
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	   public static void main(String[] args) {
//
//	      Random random = new Random();
//	      int[] n = new int[9];
//	      for (int i = 0; i < n.length; i++) {
//	         n[i] = random.nextInt(10);
//	      }
//
//	      System.out.println("입력: " + Arrays.toString(n));
//	      int max = 0;
//	      int max2 = 0;
//	      for (int i = 0; i < n.length; i++) {
//	         if (max <= n[i])
//	            max = n[i];
//	      }
//	      for (int i = 0; i < n.length; i++) {
//	         if (max2 <= n[i] && max > n[i])
//	            max2 = n[i];
//	         
//	      }
//	      System.out.println("출력: " + max2);
//	   }
//	}

//22-2
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//
//		Random random = new Random();
//		int[] n = new int[9];
//		for (int i = 0; i < n.length; i++) {
//			n[i] = random.nextInt(10);
//		}
//		System.out.println("입력: " + Arrays.toString(n));
//		boolean secondChange=false;
//		int max = Integer.MIN_VALUE;
//		int second = Integer.MIN_VALUE;
//		for (int i = 0; i < n.length; i++) {
//			if (max <= n[i])
//				max = n[i];
//		}
//		for (int i = 0; i < n.length; i++) {
//			if (n[i] == max)
//				continue;
//			if (second < n[i]) {
//				secondChange=true;
//				second = n[i];
//			}
//		}
//		if(secondChange)System.out.println();
//		System.out.println("출력: " + second);
//	}
//}

//23번
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//		Random random = new Random();
//		int[] n = new int[9];
//		for (int i = 0; i < n.length; i++) {
//			n[i] = random.nextInt(10);
//		}
//		System.out.println("입력: " + Arrays.toString(n));
//		int max = 0, max2 = 0, a = 0;
//		for (int i = 0; i < n.length; i++) {
//			if (max <= n[i])
//				max = n[i];
//		}
//		for (int i = 0; i < n.length; i++) {
//			if (max2 <= n[i] && max > n[i])
//				max2 = n[i];
//			else if (max == n[i])
//				a++;
//			if (a > 1)
//				max2 = max;
//		}
//		System.out.println("출력: " + max2);
//	}
//}

//23-2
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//
//		Random random = new Random();
//		int[] n = new int[9];
//		for (int i = 0; i < n.length; i++) {
//			n[i] = random.nextInt(10);
//		}
//		System.out.println("입력: " + Arrays.toString(n));
//		int max = Integer.MIN_VALUE;
//		int second = Integer.MIN_VALUE,maxCount=0; 
//		for (int i = 0; i < n.length; i++) {
//			if (max <= n[i])
//				max = n[i];
//		}
//		for (int i = 0; i < n.length; i++) {
//			if (n[i] == max) {
//				maxCount++;
//				continue;}
//			if (second < n[i])
//				second = n[i];
//		}
//		if(maxCount==1) System.out.println("출력: " + second);
//		else System.out.println("출력: " +max);
//	}
//}

//25번 정렬먼저하고 중앙값 나머지가 0이면 짝수개 1이면 홀수개
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//		Random random = new Random();
//		int[] n = new int[9];
//		int[] m = new int[8];
//		int num1 = 0;
//		double num2 = 0;
//		for (int i = 0; i < n.length; i++) {
//			n[i] = random.nextInt(10);
//		}
//		System.out.println("입력: " + Arrays.toString(n));
//		Arrays.sort(n);
//		if (n.length % 2 != 0)
//			num1 = n[n.length / 2];
//		System.out.println("출력: " + num1);
//		for (int i = 0; i < m.length; i++) {
//			m[i] = random.nextInt(10);
//		}
//		System.out.println("입력: " + Arrays.toString(m));
//		Arrays.sort(m);
//		if (m.length % 2 == 0)
//			num2 = (m[m.length / 2 - 1] + m[m.length / 2]) / 2.0;
//		System.out.println("출력: " + num2);
//	}
//}

//25-2
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int[] n = { 4, 3, 1, 2 };
//		Arrays.parallelSort(n);
//		if (n.length % 2 == 1)
//			System.out.println(n[n.length / 2]);
//
//		if (n.length % 2 == 0)
//			System.out.println((n[n.length / 2 - 1] + n[n.length / 2 - 1]) / 2.0);
//	}
//}

//26-2
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//		Random random = new Random();
//		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
//		int[] n = new int[9];
//		for (int x = 0; x < n.length; x++) {
//			n[x] = random.nextInt(10);
//			if (n[x] == 0)
//				a++;
//			else if (n[x] == 1)
//				b++;
//			else if (n[x] == 2)
//				c++;
//			else if (n[x] == 3)
//				d++;
//			else if (n[x] == 4)
//				e++;
//			else if (n[x] == 5)
//				f++;
//			else if (n[x] == 6)
//				g++;
//			else if (n[x] == 7)
//				h++;
//			else if (n[x] == 8)
//				i++;
//			else if (n[x] == 9)
//				j++;
//		}
//		System.out.println("입력: " + Arrays.toString(n));
//		System.out.print("출력: ");
//		Arrays.sort(n);
//		for (int x = 0; x < n.length; x++) {
//		if (a > 0)
//			System.out.print("0 ");
//		if (b > 0)
//			System.out.print("1 ");
//		if (c > 0)
//			System.out.print("2 ");
//		if (d > 0)
//			System.out.print("3 ");
//		if (e > 0)
//			System.out.print("4 ");
//		if (f > 0)
//			System.out.print("5 ");
//		if (g > 0)
//			System.out.print("6 ");
//		if (h > 0)
//			System.out.print("7 ");
//		if (i > 0)
//			System.out.print("8 ");
//		if (j > 0)
//			System.out.print("9 ");
//
//	}
//}
//}

//26번
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//		Random random = new Random();
//		int[] m = new int[10];
//		int[] n = new int[9];
//		for (int i = 0; i < n.length; i++) {
//			n[i] = random.nextInt(10);
//			m[n[i]]++;
//		}
//		System.out.println("입력: "+Arrays.toString(n));
//		System.out.print("출력: ");
//		for (int i = 0; i < n.length; i++) {
//			if(m[i]>=1)
//				System.out.print(i+" ");
//		}
//	}
//}

//26
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 4, 1, 2, 1, 1, 4, 3, 3 };  //값범위 :0~9
//		int c[] = new int[10];
//		Arrays.parallelSort(n);
////		System.out.println(n[0] + " ");
//		for (int i = 0; i < n.length; i++) {
//			c[n[i]]++;
//		}
//		System.out.print("출력: ");
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c[i]; j++) {
//				System.out.print(i+" ");
//			}   //순서대로 정렬해서 다시 배열로  (숫자범위가 제한되어 있을떄만 사용)
////			if (c[i] > 0)
////				System.out.print(i + " ");
//		}
////		System.out.println(Arrays.toString(c));   //숫자 개수 차례대로 ++
//	}
//}

//27번
//import java.util.Arrays;
//import java.util.Random;
//
//public class Test{
//	public static void main(String[] args) {
//		int x = 0, y=0;
//		int n[]=new int[9];
//		Random random = new Random();
//		for (int i = 0; i < n.length; i++) {
//			n[i] = random.nextInt(10);
//		}
//		System.out.println("입력: "+Arrays.toString(n));
//		Arrays.sort(n);
//		for(int i=0;i<n.length/2;i++) {
//			x=n[i];
//			n[i]=n[n.length-i-1];
//			n[n.length-i-1]=x;
//		}
//		System.out.println("출력: "+Arrays.toString(n));
//	System.out.print("     ");
//		for (int i = 0; i < n.length; i++) {
//			if (x != n[i]) {
//				y++;
//			}
//			if (i > 0)
//				System.out.print(" ");
//			System.out.print(y + " ");
//			x = n[i];
//	}
//	}
//}
//29번
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = new int[5];
//		Scanner s = new Scanner(System.in);
//		int k = s.nextInt();
//		if (k > n.length)
//			k = n.length % k;
//		Random random = new Random();
//		for (int i = 0; i < n.length; i++) {
//			n[i] = random.nextInt(10);
//		}
//		System.out.println(Arrays.toString(n));
//		rev(n, 0, n.length - 1);
//		System.out.println(Arrays.toString(n));
//		rev(n, 0, k - 1);
//		System.out.println(Arrays.toString(n));
//		rev(n, k, n.length - 1);
//		System.out.println(Arrays.toString(n));
////		 rev(n,0,n.length) 역순
////		 rev(n,0,k-1) 오른쪽
////		rev(n,k,n.length-1) 오른쪽
//
//	}
//
//	private static void rev(int[] n, int s, int e) {
//		for (; s < e; e--, s++) {
//			int temp = n[s];
//			n[s] = n[e];
//			n[e] = temp;
////			swap(n[s], n[e]);
//		}
//	}
//}

//29-2

public class Test {
	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5 };
		int v[] = new int[n.length];
		int k = 2;
		for (int i = 0; i < n.length; i++) {
			v[(i + k) % n.length] = n[i];
		}
		for (int i = 0; i < v.length; i++) {
			n[i] = v[i];
		}
		System.out.println(Arrays.toString(n));
	}
}