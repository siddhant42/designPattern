package singleton;

public class LazyA {
	private LazyA(){}
	private static LazyA obj;
	public LazyA getA(){
		if (obj == null){  
			synchronized(LazyA.class){  
				if (obj == null){  
					obj = new LazyA();//instance will be created at request time  
				}  
			}              
		}  
		return obj;
	}
}