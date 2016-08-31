package test.rss.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.mcsoxford.rss.RSSFeed;

import test.rss.R;
import test.rss.viewholders.RssViewHolder;

public class FeedAdapter extends RecyclerView.Adapter<RssViewHolder> {
	private RSSFeed feed;
	public FeedAdapter(@NonNull RSSFeed feed) {
		this.feed = feed;
	}

	@Override
	public RssViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
		return new RssViewHolder(view);
	}

	@Override
	public void onBindViewHolder(RssViewHolder holder, int position) {
		holder.bind(feed.getItems().get(position));
	}

	@Override
	public int getItemCount() {
		return feed.getItems().size();
	}

	@Override
	public int getItemViewType(int position) {
		return R.layout.rss_item;
	}
}