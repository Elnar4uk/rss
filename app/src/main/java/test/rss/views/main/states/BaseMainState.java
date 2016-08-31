package test.rss.views.main.states;

import test.rss.views.main.IMainState;
import test.rss.views.main.MainView;

public abstract class BaseMainState implements IMainState {
	protected MainView view;

	public BaseMainState(MainView view) {
		this.view = view;
	}
}
