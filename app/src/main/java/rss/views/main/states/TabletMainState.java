package rss.views.main.states;

import rss.R;
import rss.views.MasterView;
import rss.views.main.MainView;
import rss.views.main.states.BaseMainState;

public class TabletMainState extends BaseMainState {
	public TabletMainState(MainView view) {
		super(view);
	}

	@Override
	public void initialize() {
		MasterView masterView = new MasterView();
		masterView.setArguments(view.getIntent().getExtras());

		view.getSupportFragmentManager().beginTransaction().add(R.id.fragment, masterView).commit();
	}
}
