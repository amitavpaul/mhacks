package com.smartapp.priyo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

	private Context context;

	public PagerAdapter(FragmentManager fm, Context context) {
		super(fm);
		this.context = context;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			return new Tab1Fragment();
		case 1:
			return new Tab2Fragment();
		case 2:
			return new Tab3Fragment();

		}
		return new Fragment();
	}

	@Override
	public int getCount() {
		return 5;
	}

	// @Override
	// public String getPageTitle(int position) {
	// Locale l = Locale.getDefault();
	// switch (position) {
	// case 0:
	// return context.getString(R.string.title_section1).toUpperCase(l);
	// case 1:
	// return context.getString(R.string.title_section2).toUpperCase(l);
	// case 2:
	// return context.getString(R.string.title_section3).toUpperCase(l);
	// }
	// return null;
	// }
}
