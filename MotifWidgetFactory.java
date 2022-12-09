package test4;

public class MotifWidgetFactory implements WidgetFactory {

	@Override
	public Window createWindow() {
		return new MotifWindow();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}
}
