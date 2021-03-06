package test.rss.presenters;

import test.rss.presenters.interfaces.IPresenter;
import test.rss.views.interfaces.IView;

public abstract class BasePresenter<View extends IView> implements IPresenter {
	private View view;
	protected View getView() {
		return view;
	}
	public BasePresenter(View view) {
		this.view = view;
	}

	@Override
	public void onDestroy() {
		view = null;
	}
}
