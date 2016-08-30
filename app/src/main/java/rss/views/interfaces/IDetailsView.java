package rss.views.interfaces;

import org.mcsoxford.rss.RSSItem;

public interface IDetailsView extends IView {
	void setArguments(RSSItem item);
	void update(RSSItem item);
}
