package test.rss.views.interfaces;

import org.mcsoxford.rss.RSSFeed;

public interface IMasterView extends IView {
	void updateList(RSSFeed feed);
}
