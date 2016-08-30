package rss.presenters;

import rss.presenters.interfaces.IDetailsPresenter;
import rss.views.DetailsView;

public class DetailsPresenter extends BasePresenter<DetailsView> implements IDetailsPresenter {
	public DetailsPresenter(DetailsView view) {
		super(view);
	}
}
