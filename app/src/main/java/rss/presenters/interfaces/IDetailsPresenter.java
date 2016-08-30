package rss.presenters.interfaces;

import android.os.Bundle;

import org.mcsoxford.rss.RSSItem;

public interface IDetailsPresenter extends IPresenter {
	void showDetails(RSSItem item);
}
