

//1
//public class Test {
//	public static void main(String[] args) {
//		SimpleLinearProbingHashTable ht = new SimpleLinearProbingHashTable(1000);
//		ht.put("Korea");
//		ht.put("Japan");
//		System.out.println(ht.get("Korea"));
//		System.out.println(ht.get("Japan"));
//		System.out.println(ht.get("China"));
//	}
//}

//4-hashset
//import java.util.HashSet;
//
//public class Test {
//	public static void main(String[] args) {
//		HashSet<String> hashSet = new HashSet<>();
//		hashSet.add("Korea");
//		hashSet.add("Japan");
//		hashSet.add("China");
//		System.out.println(hashSet);
//		for (String key : hashSet) {
//			System.out.println(key);
//		}
//		System.out.println(hashSet.contains("China"));
//		System.out.println(hashSet.contains("US"));
//		hashSet.remove("Japan");
//		System.out.println(hashSet);
//	}
//}

//4-hashmap
//import java.util.HashMap;
//
//public class Test {
//	public static void main(String[] args) {
//		HashMap<String, Integer> hashMap = new HashMap<>();
//		hashMap.put("Korea", 99);
//		hashMap.put("Japan", 87);
//		hashMap.put("China", 95);
//		System.out.println(hashMap);
//		for (String key : hashMap.keySet()) {
//			System.out.println(key + "=>" + hashMap.get(key));
//		}
//		System.out.println(hashMap.get("China"));
//		System.out.println(hashMap.get("US"));
//		hashMap.remove("Japan");
//		System.out.println(hashMap);
//	}
//}

//5
//import java.util.HashSet;
//import java.util.Random;
//import java.util.TreeSet;
//
//public class Test {
//	public static void main(String[] args) {
//		int n = 1000000;
//		String keys[] = new String[n];
//		for (int i = 0; i < n; i++)
//			keys[i] = genKeys();
//		long start;
//		start = System.currentTimeMillis();
//		TreeSet<String> treeSet = new TreeSet<>();
//		for (int i = 0; i < n; i++)
//			treeSet.add(keys[i]);
//		System.out.println("BST " + (System.currentTimeMillis() - start) / 1000. + " sec.");
//
//		start = System.currentTimeMillis(); 
//		// SimpleChainHashTable st=new SimpleChainHashTable(1); 
//		SimpleChainHashTable  st=new SimpleChainHashTable(n); 
//		for (int i = 0; i < n; i++) st.put(keys[i]);
//		System.out.println("Hash"+(System.currentTimeMillis()-start)/1000.+" sec.");
//
//		start = System.currentTimeMillis();
//		HashSet<String>  ht = new HashSet<String>();
//		for (int i = 0; i < n; i++) {
//			treeSet.add(keys[i]);			
//		}
//		System.out.println("Java Hash"+(System.currentTimeMillis()-start)/1000.+" sec.");
//	}
//
//	private static String genKeys() {
//		Random random = new Random();
//		int len = random.nextInt(10) + 5;
//		String s = "";
//		for (int j = 0; j < len; j++)
//			s += (char) (random.nextInt('z' - 'a') + 'a');
//		return s;
//	}
//}

//6
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random random = new Random();
		int N = 10000;
		int n[] = new int[N];
		for (int i = 0; i < n.length; i++)
			n[i] = random.nextInt(N / 2);
	}
}