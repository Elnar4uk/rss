package test.rss.presenters;

import org.mcsoxford.rss.RSSItem;

import test.rss.presenters.interfaces.IDetailsPresenter;
import test.rss.views.DetailsView;

public class DetailsPresenter extends BasePresenter<DetailsView> implements IDetailsPresenter {
	public DetailsPresenter(DetailsView view) {
		super(view);
	}

	@Override
	public void showDetails(RSSItem item) {
		getView().update(item);
	}
}
