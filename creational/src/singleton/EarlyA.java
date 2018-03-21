package singleton;

public class EarlyA {
	private EarlyA() {}
	private static final EarlyA obj=new EarlyA();
	public EarlyA getA() {
		return obj;
	}
}
