package prototype;

import java.text.NumberFormat;

class Abc{
	static{System.out.println("abc");}
}
public class Test extends Abc {
	static {
		System.out.println("Test");
	}
public static void main(String...args) {
	/*NumberFormat nf = NumberFormat.getInstance();
	nf.setMinimumFractionDigits(2);
	nf.setMaximumFractionDigits(4);
	String a = nf.format(3.14541);
	String b = nf.format(2);
	System.out.println(a);
	System.out.println(b);*/
	//Abc p;
}
}
