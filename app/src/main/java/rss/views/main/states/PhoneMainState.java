package rss.views.main.states;

import rss.R;
import rss.views.DetailsView;
import rss.views.MasterView;
import rss.views.main.MainView;

public class PhoneMainState extends BaseMainState {
	public PhoneMainState(MainView view) {
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
