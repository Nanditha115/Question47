package test4;

import java.util.Scanner;

public class Ques47 {
	
	private static Application configure() {
		Application app;
		WidgetFactory factory;
		
		Scanner input = new Scanner(System.in); 
	    System.out.println("PM / Motif");
	    String inp = input.next();
		
		if (inp == "pm"){
			factory = new PMWidgetFactory();
		} else {
			factory = new MotifWidgetFactory();
		}
		app = new Application(factory);
		return app;
	}
	
	public static void main(String[] args) {
		Application app = configure();
		app.wclass();
	}

}
