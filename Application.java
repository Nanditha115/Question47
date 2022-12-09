package test4;

public class Application {
	private Window window;
	private ScrollBar scrollbar;
	
	public Application(WidgetFactory factory) {
		window = factory.createWindow();
		scrollbar = factory.createScrollBar();
	}
	
	public void wclass() {
		window.wclass();
		scrollbar.wclass();
	}
}
