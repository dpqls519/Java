
//재귀 6번
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 7, 2, 8, 4, 1 };
//		System.out.println(sum(n, n.length - 1));
//	}
//
//	private static int sum(int[] n, int i) {
//		if(i==0) return n[i];
////		if(i<0) return 0;    //다 더했으니 더할 게 없다  
//		return n[i]+sum(n,i-1);
//	}
//}

//7번
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 1, 2, 3, 4, 5 };
//		System.out.println(sum(n, 0));
//	}
//
//	private static int sum(int[] n, int i) {
//		if (i >= n.length - 1)
//			return n[i];
//		return n[i] + sum(n, i + 1);
//
//	}
//}

//8번
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 5, 1, 8, 3, 2 };
//		System.out.println(max(n, n.length - 1));
//	}
//
//	private static int max(int[] n, int i) {
//		if (i == 0)
//			return n[i];
//		int v = max(n, i - 1);
//		return v > n[i] ? v : n[i];
//	}
//}

//9번
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 5, 1, 8, 3, 2 };
//		System.out.println(max(n, 0, n.length - 1));
//	}
//
//	private static int max(int[] n, int low, int high) {
//		if(low==high) return n[low];		
//		int m = (low + high) / 2;
//		//low~m,m+1~high
//		int v1 = max(n, low, m), v2 = max(n, m + 1, high);
//		return v1 > v2 ? v1 : v2;
//	}
//}

//10번
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
//		if(i==v.length-1)
//			if(v[i]>='a'&&v[i]<='z') v[i]+='A'-'a';
//		if(v[i]>='a'&&v[i]<='z') v[i]+='A'-'a';
//		toUpper(v,i+1);
//	}
//}

//11번
//public class Test {
//	public static void main(String[] args) {
//		String s = "South, Korea";
//		char v[] = s.toCharArray();
//		System.out.println(countUpper(v, 0));
//	}
//
//	private static int countUpper(char[] v, int i) {
//		if(i==v.length) return 0;
//		int count=0;
//		if(v[i]>='A'&& v[i]<='Z') count=1;
//		return count+countUpper(v,i+1);
//		return ((v[i]>='A'&& v[i]<='Z')?1:0)+countUpper(v,i+1);
//	}
//}

//12번
//public class Test {
//	public static void main(String[] args) {
//		String s = "ABCDEDCBA";
//		System.out.println(palindrome(s, 0));
//	}
//
//	private static boolean palindrome(String s, int i) {
//		if(i>=s.length()/2) return true;
//		return s.charAt(i)==s.charAt(s.length()-1-i)&&palindrome(s, i+1);
//	}
//}

//13번
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
//		if(i>=n.length/2) return;
//		int temp=n[i];
//		n[i]=n[n.length-1-i];
//		n[n.length-1-i]=temp;
//		reverse(n,i+1);
//	}
//}

//해싱 4번
//HashSet
//import java.util.HashSet;
//
//public class Test {
//	public static void main(String[] args) {
//		HashSet<String> hashSet = new HashSet<>();
//		hashSet.add("Korea");
//		hashSet.add("Japan");
//		hashSet.add("China");
//		System.out.println(hashSet);
//
//		for (String key : hashSet) {
//			System.out.println(key);
//		}
//
//		System.out.println(hashSet.contains("China"));
//		System.out.println(hashSet.contains("US"));
//		hashSet.remove("Japan");
//		System.out.println(hashSet);
//	}
//}

//HashMap
//import java.util.HashMap;
//
//public class Test {
//	public static void main(String[] args) {
//		HashMap<String, Integer> hashMap = new HashMap<>();
//		hashMap.put("Korea", 99);
//		hashMap.put("Japan", 87);
//		hashMap.put("China", 95);
//		System.out.println(hashMap);
//
//		for (String key : hashMap.keySet()) {
//			System.out.println(key + "=>" + hashMap.get(key));
//		}
//
//		System.out.println(hashMap.get("China"));
//		System.out.println(hashMap.get("US"));
//		hashMap.remove("Japan");
//		System.out.println(hashMap);
//	}
//}

//6번
//import java.util.Random;
//
//public class Test {
//	public static void main(String[] args) {
//		Random random = new Random();
//		int N = 10000;
//		int n[] = new int[N];
//		for (int i = 0; i < n.length; i++)
//			n[i] = random.nextInt(N / 2);
//	}
//}

//6-1
//public class Test {
//	public static void main(String[] args) {
//		int n[]= {1,5,3,2,5,3,5};
//	
//		int maxCount=0,maxValue=n[0];
//	
//		for (int i = 0; i < n.length; i++) {
//			int count=0;
//			for (int j = 0; j < n.length; j++) {
//				if(n[i]==n[j]) count++;		
//				//n[i]의 빈도수가 count에 저장되어 있음
//				if(count>maxCount) {
//					maxCount =count;
//					maxValue = n[i];
//				}
//			}
//		}	
//	}
//}

//6-2
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 1, 5, 3, 2, 5, 3, 5 };
//		Arrays.parallelSort(n);
//		int count = 1, maxCount = 0, maxValue = n[0];
//		for (int i = 0; i < n.length; i++) {
//			if (n[i - 1] != n[i]) {
//				if (count > maxCount) {
//					maxCount = count;
//					maxValue = n[i - 1];
//				}
//				count = 0;
//			}
//			count++;
//		}
//		if (count > maxCount) {
//			maxCount = count;
//			maxValue = n[n.length - 1];
//		}
//	}
//}

//6-3
public class Test {
	public static void main(String[] args) {
		int n[] = { 1, 5, 3, 2, 5, 3, 5 };
		
	}
}