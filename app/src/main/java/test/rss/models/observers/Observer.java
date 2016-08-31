package test.rss.models.observers;

import test.rss.models.responses.IResponse;

public interface Observer<Response extends IResponse> {
	void update(Response arg);
}