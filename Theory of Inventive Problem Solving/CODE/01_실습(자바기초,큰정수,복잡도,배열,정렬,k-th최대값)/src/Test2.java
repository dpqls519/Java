import java.math.BigInteger;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="99999999999999999999999999999999999999999999988888888888888888888";
		String s2="888888888888888888888888888888888888777777777777777777";
		BigInteger n1=new BigInteger(s1);
		BigInteger n2=new BigInteger(s2);
		System.out.println(n1.add(n2));
	}

}
