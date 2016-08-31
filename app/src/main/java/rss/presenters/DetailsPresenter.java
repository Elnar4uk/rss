package rss.presenters;

import org.mcsoxford.rss.RSSItem;

import rss.presenters.interfaces.IDetailsPresenter;
import rss.views.DetailsView;

public class DetailsPresenter extends BasePresenter<DetailsView> implements IDetailsPresenter {
	public DetailsPresenter(DetailsView view) {
		super(view);
	}

	@Override
	public void showDetails(RSSItem item) {
		getView().update(item);
	}
}
