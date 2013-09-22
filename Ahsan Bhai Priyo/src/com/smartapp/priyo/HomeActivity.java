package com.smartapp.priyo;

import java.io.FileInputStream;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.smartapp.coverflow.CoverAdapterView;
import com.smartapp.coverflow.CoverAdapterView.OnItemClickListener;
import com.smartapp.coverflow.CoverAdapterView.OnItemSelectedListener;
import com.smartapp.coverflow.CoverFlow;

public class HomeActivity extends SherlockActivity {
	ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		actionBar = getSupportActionBar();
		actionBar.setDisplayShowHomeEnabled(true);

		// coverFlow.setSelection(8, true);
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

		LayoutInflater inflator = LayoutInflater.from(this);
		View v = inflator.inflate(R.layout.myabs_layout_home, null);
		TextView ABStitle = (TextView) v.findViewById(R.id.myabs_title);
		ABStitle.setText("Cars and Automobiles");
		actionBar.setCustomView(v);

	}

}
