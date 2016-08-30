package rss.presenters;

import rss.presenters.interfaces.IMasterPresenter;
import rss.views.interfaces.IMasterView;

public class MasterPresenter extends BasePresenter<IMasterView> implements IMasterPresenter {
	public MasterPresenter(IMasterView view) {
		super(view);
	}
}
