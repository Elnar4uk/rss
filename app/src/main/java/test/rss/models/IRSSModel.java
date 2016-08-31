package test.rss.models;

import org.mcsoxford.rss.RSSFeed;

import java.util.concurrent.Future;

import test.rss.models.observers.IObservableModel;
import test.rss.models.responses.IRSSResponse;

public interface IRSSModel extends IModel, IObservableModel<IRSSResponse> {
	Future<RSSFeed> getFeed(String url);
}
