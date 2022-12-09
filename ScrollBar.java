package test4;

public interface ScrollBar {
	 void wclass();
}

class PMScrollBar implements ScrollBar {
	@Override
	public void wclass() {
		System.out.println("PMScrollBar class");	
	}
}

class MotifScrollBar implements ScrollBar {
	@Override
	public void wclass() {
		System.out.println("MotifScrollBar class");	
	}
}