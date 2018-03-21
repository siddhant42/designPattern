package observerPattern;

public class MyTopicSubscriber implements Observer {
	String name;
	Subject sub;
	public MyTopicSubscriber(String name) {
		this.name = name;
	}
	@Override
	public void update() {
		String msg = (String) sub.getUpdate(this);
		if(msg == null) System.out.println(name+":: no update ");
		else 
			System.out.println(name+" consuming message "+msg );
	}

	@Override
	public void setSubject(Subject sub) {
		this.sub = sub;
	}

}
