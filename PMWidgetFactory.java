package test4;

public class PMWidgetFactory implements WidgetFactory {

	@Override
	public Window createWindow() {
		return new PMWindow();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new PMScrollBar();
	}
}
