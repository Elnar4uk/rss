package test.rss.pointers;

import java.util.concurrent.Callable;

public interface SafeCallable<V> extends Callable<V> {
	@Override
	V call();
}
