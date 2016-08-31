package rss.presenters;

import rss.models.IRSSModel;
import rss.models.RSSModel;
import rss.models.observers.Observer;
import rss.models.responses.IRSSResponse;
import rss.presenters.interfaces.IMasterPresenter;
import rss.views.interfaces.IMasterView;

public class MasterPresenter extends BasePresenter<IMasterView> implements IMasterPresenter, Observer<IRSSResponse> {
	private IRSSModel model;
	public MasterPresenter(IMasterView view) {
		super(view);

		model = new RSSModel();
		model.addObserver(this);
	}

	@Override
	public void loadFeed(String uri) {
		model.getFeed(uri);
	}

	@Override
	public void update(IRSSResponse arg) {
		getView().updateList(arg.getFeed());
	}
}
