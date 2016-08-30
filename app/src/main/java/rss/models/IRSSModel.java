package rss.models;

import org.mcsoxford.rss.RSSFeed;

import java.util.concurrent.Future;

public interface IRSSModel extends IModel {
	Future<RSSFeed> getFeed(String url);
}
