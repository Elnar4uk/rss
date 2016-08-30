package rss.models.observers;

import java.util.ArrayList;

import rss.models.responses.IResponse;

public class ObservableModel<Response extends IResponse> {
	private boolean changed = false;
	private final ArrayList<Observer<Response>> observers;

	public ObservableModel() {
		observers = new ArrayList<>();
	}

	public synchronized void addObserver(Observer<Response> o) {
		if (o == null)
			throw new NullPointerException();
		if (!observers.contains(o)) {
			observers.add(o);
		}
	}

	public synchronized void deleteObserver(Observer<Response> o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		notifyObservers(null);
	}

	public void notifyObservers(Response arg) {
		Observer[] arrLocal;

		synchronized (this) {
			if (!hasChanged())
				return;

			arrLocal = observers.toArray(new Observer[observers.size()]);
			clearChanged();
		}

		for (int i = arrLocal.length - 1; i >= 0; i--)
			arrLocal[i].update(this, arg);
	}

	public synchronized void deleteObservers() {
		observers.clear();
	}

	protected synchronized void setChanged() {
		changed = true;
	}

	protected synchronized void clearChanged() {
		changed = false;
	}

	public synchronized boolean hasChanged() {
		return changed;
	}

	public synchronized int countObservers() {
		return observers.size();
	}
}