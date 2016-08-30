package rss.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import rss.presenters.IMainPresenter;
import rss.presenters.MainPresenter;
import test.rss.R;

public class MainView extends AppCompatActivity implements IMainView {
	private IMainPresenter presenter;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_view);

		presenter = new MainPresenter(this);
	}
}
