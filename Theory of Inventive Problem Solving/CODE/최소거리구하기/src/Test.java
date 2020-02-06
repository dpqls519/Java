//1¹ø
//
//public class Test {
//	public static void main(String args[]) {
//		long v[] = { 34, 76, 11, 3, 7, 13, 9 };
//		long dis = Long.MAX_VALUE;
//		for (int i = 0; i < v.length - 1; i++) {
//			for (int j = i + 1; j < v.length; j++) {
//				long dis1 = Math.abs(v[i] - v[j]);
//				System.out.println(dis1);
//				if (dis > dis1)
//					dis = dis1;
//			}
//		}
//		System.out.println(dis);
//	}
//}

////2¹ø

//import java.util.Arrays;
//
//public class Test {
//	public static void main(String args[]) {
//		long dis2 = 0;
//		long v[] = { 34, 76, 11, 3, 7, 13, 9 };
//		Arrays.sort(v);
////		System.out.println(Arrays.toString(v));
//		long dis1 = Math.abs(v[1] - v[0]);
//		for (int i = 0; i < v.length - 1; i++) {
//			dis2 = Math.abs(v[i + 1] - v[i]);
//			if (dis1 > dis2)
//				dis1 = dis2;
//		}
//		System.out.println(dis1);
//	}
//}