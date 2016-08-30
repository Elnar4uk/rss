package rss.presenters;

import rss.models.IRSSModel;
import rss.models.RSSModel;
import rss.models.responses.IRSSResponse;
import rss.presenters.interfaces.IMainPresenter;
import rss.views.interfaces.IMainView;

public class MainPresenter extends BasePresenter<IMainView> implements IMainPresenter, IRSSResponse {
	private IRSSModel model;
	public MainPresenter(IMainView view) {
		super(view);

		model = new RSSModel();
	}
}
