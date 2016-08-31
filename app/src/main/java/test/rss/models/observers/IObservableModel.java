package test.rss.models.observers;

import test.rss.models.responses.IResponse;

public interface IObservableModel<Response extends IResponse> {
	void addObserver(Observer<Response> o);

	void deleteObserver(Observer<Response> o);

	void notifyObservers();

	void notifyObservers(Response arg);

	void deleteObservers();

	boolean hasChanged();

	int countObservers();
}
