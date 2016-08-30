package rss.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import rss.R;
import rss.presenters.interfaces.IMainPresenter;
import rss.presenters.MainPresenter;
import rss.views.interfaces.IMainView;

public class MainView extends AppCompatActivity implements IMainView {
	private IMainPresenter presenter;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_view);

		if (savedInstanceState != null) {
			return;
		}

		//todo add states

		if(findViewById(R.id.fragment) != null) {
			MasterView masterView = new MasterView();
			masterView.setArguments(getIntent().getExtras());

			getSupportFragmentManager().beginTransaction().add(R.id.fragment, masterView).commit();
		}
		else
		{
			MasterView masterView = new MasterView();
			masterView.setArguments(getIntent().getExtras());

			getSupportFragmentManager().beginTransaction().add(R.id.left, masterView).commit();

			DetailsView detailsView = new DetailsView();
			detailsView.setArguments(getIntent().getExtras());

			getSupportFragmentManager().beginTransaction().add(R.id.right, detailsView).commit();
		}

		presenter = new MainPresenter(this);
	}

	@Override
	public void onDestroy() {//todo move to base class
		presenter.onDestroy();
		super.onDestroy();
	}
}
