package rss.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.mcsoxford.rss.RSSFeed;

import rss.R;
import rss.adapters.FeedAdapter;
import rss.presenters.MasterPresenter;
import rss.presenters.interfaces.IMasterPresenter;
import rss.views.interfaces.IMasterView;

public class MasterView extends Fragment implements IMasterView {
	private IMasterPresenter presenter;

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		presenter = new MasterPresenter(this);
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.master_view, container, false);
	}

	@Override
	public void onStart() {
		super.onStart();

		presenter.loadFeed(getResources().getString(R.string.url));
	}

	@Override
	public void updateList(RSSFeed feed) {
		RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.list);
		FeedAdapter feedAdapter = new FeedAdapter(feed);

		recyclerView.setAdapter(feedAdapter);
	}

	@Override
	public void onDestroy() {//todo move to base class
		presenter.onDestroy();
		presenter = null;
		super.onDestroy();
	}
}
