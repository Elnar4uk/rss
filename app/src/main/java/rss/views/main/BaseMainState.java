package rss.views.main;

public abstract class BaseMainState implements IMainState {
	protected MainView view;

	public BaseMainState(MainView view) {
		this.view = view;
	}
}
