package test.rss.views.main.states;

import test.rss.R;
import test.rss.views.DetailsView;
import test.rss.views.MasterView;
import test.rss.views.main.MainView;

public class PhoneMainState extends BaseMainState {
	public PhoneMainState(MainView view) {
		super(view);
	}

	@Override
	public void initialize() {
		MasterView masterView = new MasterView();
		masterView.setArguments(view.getIntent().getExtras());

		view.getSupportFragmentManager().beginTransaction().add(R.id.fragment, masterView).commit();
	}
}
