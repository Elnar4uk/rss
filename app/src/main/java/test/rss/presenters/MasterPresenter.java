package test.rss.presenters;

import test.rss.models.IRSSModel;
import test.rss.models.RSSModel;
import test.rss.models.observers.Observer;
import test.rss.models.responses.IRSSResponse;
import test.rss.presenters.interfaces.IMasterPresenter;
import test.rss.views.interfaces.IMasterView;

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
