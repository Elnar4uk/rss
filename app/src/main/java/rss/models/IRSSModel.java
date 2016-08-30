package rss.models;

import org.mcsoxford.rss.RSSFeed;

import java.util.concurrent.Future;

import rss.models.observers.IObservableModel;
import rss.models.responses.IRSSResponse;

public interface IRSSModel extends IModel, IObservableModel<IRSSResponse> {
	Future<RSSFeed> getFeed(String url);
}
