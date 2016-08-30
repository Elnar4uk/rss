package rss.presenters;

import rss.views.IView;

public abstract class BasePresenter<View extends IView> implements IPresenter {
	private View view;

	public BasePresenter(View view) {
		this.view = view;
	}
}
