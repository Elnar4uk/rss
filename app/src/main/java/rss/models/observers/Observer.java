package rss.models.observers;

import rss.models.responses.IResponse;

public interface Observer<Response extends IResponse> {
	void update(Response arg);
}