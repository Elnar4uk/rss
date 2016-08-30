package rss.views.main.states;

import rss.views.main.IMainState;
import rss.views.main.MainView;

public abstract class BaseMainState implements IMainState {
	protected MainView view;

	public BaseMainState(MainView view) {
		this.view = view;
	}
}
