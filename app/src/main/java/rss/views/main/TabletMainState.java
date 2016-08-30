package rss.views.main;

import rss.R;
import rss.views.MasterView;

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
