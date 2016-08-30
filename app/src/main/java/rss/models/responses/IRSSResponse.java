package rss.models.responses;

import org.mcsoxford.rss.RSSFeed;

public interface IRSSResponse extends IResponse {
	RSSFeed getFeed();
}
