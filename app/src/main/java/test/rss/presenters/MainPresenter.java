package test.rss.presenters;

import test.rss.presenters.interfaces.IMainPresenter;
import test.rss.views.interfaces.IMainView;

public class MainPresenter extends BasePresenter<IMainView> implements IMainPresenter {
	public MainPresenter(IMainView view) {
		super(view);
	}
}
