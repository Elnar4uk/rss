package rss.presenters;

import rss.presenters.interfaces.IMainPresenter;
import rss.views.interfaces.IMainView;

public class MainPresenter extends BasePresenter<IMainView> implements IMainPresenter {
	public MainPresenter(IMainView view) {
		super(view);
	}
}
