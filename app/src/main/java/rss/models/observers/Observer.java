package rss.models.observers;

import org.mcsoxford.rss.RSSFeed;

import rss.models.responses.IResponse;

public interface Observer<Response extends IResponse> {
	void update(ObservableModel<Response> o, Response arg);
}