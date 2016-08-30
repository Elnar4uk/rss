package rss.models;

import org.mcsoxford.rss.RSSFeed;
import org.mcsoxford.rss.RSSLoader;

import java.util.concurrent.Future;

import rss.models.observers.ObservableModel;
import rss.models.responses.IRSSResponse;

public class RSSModel extends ObservableModel<IRSSResponse> implements IRSSModel {
	RSSLoader rssLoader;

	public RSSModel() {
		rssLoader = RSSLoader.fifo();
	}

	@Override
	public Future<RSSFeed> getFeed(String url) {
		return rssLoader.load(url);
	}
}
