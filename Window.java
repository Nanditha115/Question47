package test4;

public interface Window {
	 void wclass();
}

class PMWindow implements Window {
	@Override
	public void wclass() {
		System.out.println("PMWindow class");	
	}
}

class MotifWindow implements Window {
	@Override
	public void wclass() {
		System.out.println("MotifWindow class");	
	}
}

