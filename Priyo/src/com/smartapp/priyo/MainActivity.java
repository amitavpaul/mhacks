package com.smartapp.priyo;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockFragmentActivity implements
		ActionBar.TabListener {

	PagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setDisplayShowHomeEnabled(true);
		mSectionsPagerAdapter = new PagerAdapter(getSupportFragmentManager(),
				this);

		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		mViewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar.setSelectedNavigationItem(position);
					}
				});
		LayoutInflater inflator = LayoutInflater.from(this);
		View v = inflator.inflate(R.layout.myabs_layout, null);
		TextView ABStitle = (TextView) v.findViewById(R.id.myabs_title);
		ABStitle.setText("Cars and Automobiles");
		actionBar.setCustomView(v);

		for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			if (i == 0) {
				actionBar.addTab(actionBar.newTab().setTabListener(this));
				LayoutInflater inflater = LayoutInflater.from(this);
				View customView = inflater.inflate(R.layout.tab_title, null);
				TextView titleTV = (TextView) customView
						.findViewById(R.id.action_custom_title);
				titleTV.setText("My Cars");
				actionBar.getTabAt(i).setCustomView(customView);
			} else if (i == 1) {
				actionBar.addTab(actionBar.newTab().setTabListener(this));
				LayoutInflater inflater = LayoutInflater.from(this);
				View customView = inflater.inflate(R.layout.tab_title, null);
				TextView titleTV = (TextView) customView
						.findViewById(R.id.action_custom_title);

				titleTV.setText("Buy Cars");
				actionBar.getTabAt(i).setCustomView(customView);
			} else if (i == 2) {
				actionBar.addTab(actionBar.newTab().setTabListener(this));
				LayoutInflater inflater = LayoutInflater.from(this);
				View customView = inflater.inflate(R.layout.tab_title, null);
				TextView titleTV = (TextView) customView
						.findViewById(R.id.action_custom_title);
				titleTV.setText("Explore");
				actionBar.getTabAt(i).setCustomView(customView);
			}
			// actionBar.addTab(actionBar.newTab().setText(s).setTabListener(this));
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

		case android.R.id.home:
			finish();
			break;

		default:
			return super.onOptionsItemSelected(item);
		}
		return false;
	}

	@Override
	public void onTabSelected(Tab tab,
			android.support.v4.app.FragmentTransaction ft) {
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab,
			android.support.v4.app.FragmentTransaction ft) {
	}

	@Override
	public void onTabReselected(Tab tab,
			android.support.v4.app.FragmentTransaction ft) {
	}
}
