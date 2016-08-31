package test.rss.views.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import test.rss.R;
import test.rss.presenters.MainPresenter;
import test.rss.presenters.interfaces.IMainPresenter;
import test.rss.views.interfaces.IMainView;
import test.rss.views.main.states.PhoneMainState;
import test.rss.views.main.states.TabletMainState;

public class MainView extends AppCompatActivity implements IMainView {
	private IMainPresenter presenter;

	IMainState state;
	void setState(IMainState state){
		this.state = state;
	}

	PhoneMainState phoneMainState;
	TabletMainState tabletMainState;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_view);

		phoneMainState = new PhoneMainState(this);
		tabletMainState = new TabletMainState(this);

		setState(findViewById(R.id.fragment) == null ? tabletMainState : phoneMainState);

		if (savedInstanceState == null) {
			state.initialize();
		}

		presenter = new MainPresenter(this);
	}

	@Override
	public void onDestroy() {//todo move to base class or use aspects
		phoneMainState = null;
		tabletMainState = null;
		presenter.onDestroy();
		presenter = null;
		super.onDestroy();
	}
}
