package test.rss.views.main.states;

import test.rss.R;
import test.rss.views.DetailsView;
import test.rss.views.MasterView;
import test.rss.views.main.MainView;

public class TabletMainState extends BaseMainState {
	public TabletMainState(MainView view) {
		super(view);
	}

	@Override
	public void initialize() {
		MasterView masterView = new MasterView();
		masterView.setArguments(view.getIntent().getExtras());

		view.getSupportFragmentManager().beginTransaction().add(R.id.left, masterView).commit();

		DetailsView detailsView = new DetailsView();
		detailsView.setArguments(view.getIntent().getExtras());

		view.getSupportFragmentManager().beginTransaction().add(R.id.right, detailsView).commit();
	}
}
