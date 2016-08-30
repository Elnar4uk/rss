package rss.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.mcsoxford.rss.RSSItem;

import rss.R;
import rss.presenters.DetailsPresenter;
import rss.presenters.interfaces.IDetailsPresenter;
import rss.views.interfaces.IDetailsView;

public class DetailsView extends Fragment implements IDetailsView {
	private IDetailsPresenter presenter;
	private RSSItem item;

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		presenter = new DetailsPresenter(this);
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.details_view, container, false);
	}

	@Override
	public void onStart() {
		super.onStart();

		presenter.showDetails(item);
	}

	@Override
	public void setArguments(RSSItem item) {
		this.item = item;
	}

	public void update(RSSItem item) {

	}

	@Override
	public void onDestroy() {//todo move to base class
		presenter.onDestroy();
		presenter = null;
		super.onDestroy();
	}
}
