package com.smartapp.priyo;

import java.io.FileInputStream;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.smartapp.coverflow.CoverAdapterView;
import com.smartapp.coverflow.CoverAdapterView.OnItemClickListener;
import com.smartapp.coverflow.CoverAdapterView.OnItemSelectedListener;
import com.smartapp.coverflow.CoverFlow;

public class Tab2Fragment extends Fragment {
	private CoverFlow coverFlow;
	private TextView tvNewsTitle;
	final String[] mImageNames = { "মুন্নি সাহা হোটেল",
			"মুক্তির আগেই আয় ৭৫ কোটি টাকা!",
			"বারাক ওবামার শার্টে কার লিপস্টিক ?", "আধুনিক সাইকেলআধুনিক সাইকেল",
			"সময় বাঁচায় স্মার্টফোন", "একশো কোটির মুখ দেখল আশিকি টু",
			"রাজধানীতে সাইকেল চালানোর প্রধান সমস্যা নিরাপত্তার অভাব",
			"মনোবিজ্ঞানের ক্লাস", "তুমি ওরকম করো না কেন ?" };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_buy_cars, container,
				false);
		coverFlow = (CoverFlow) rootView.findViewById(R.id.coverflow);
		tvNewsTitle = (TextView) rootView.findViewById(R.id.tvNewsTitle);
		coverFlow.setAdapter(new ImageAdapter(getActivity()));

		ImageAdapter coverImageAdapter = new ImageAdapter(getActivity());
		// coverImageAdapter.createReflectedImages();
		coverFlow.setAdapter(coverImageAdapter);

		coverFlow.setSpacing(2);
		coverFlow.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(CoverAdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub

			}
		});

		coverFlow.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(CoverAdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub

				tvNewsTitle.setText("Cars");
			}

			@Override
			public void onNothingSelected(CoverAdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});
		coverFlow.setSelection(8, true);
		return rootView;
	}

	public class ImageAdapter extends BaseAdapter {
		int mGalleryItemBackground;
		private Context mContext;

		private FileInputStream fis;

		private Integer[] mImageIds = { R.drawable.kasabian_kasabian,
				R.drawable.starssailor_silence_is_easy,
				R.drawable.killers_day_and_age,
				R.drawable.garbage_bleed_like_me,
				R.drawable.death_cub_for_cutie_the_photo_album,
				R.drawable.kasabian_kasabian,
				R.drawable.massive_attack_collected,
				R.drawable.muse_the_resistance,
				R.drawable.starssailor_silence_is_easy };

		private ImageView[] mImages;

		public ImageAdapter(Context c) {
			mContext = c;
			mImages = new ImageView[mImageIds.length];
		}

		public int getCount() {
			return mImageIds.length;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {

			// Use this code if you want to load from resources
			ImageView i = new ImageView(mContext);
			i.setImageResource(mImageIds[position]);
			i.setLayoutParams(new CoverFlow.LayoutParams(180, 180));
			// i.setLayoutParams(new CoverFlow.LayoutParams(130, 130));
			i.setScaleType(ImageView.ScaleType.MATRIX);
			return i;

			// return mImages[position];
		}

		/**
		 * Returns the size (0.0f to 1.0f) of the views depending on the
		 * 'offset' to the center.
		 */
		public float getScale(boolean focused, int offset) {
			/* Formula: 1 / (2 ^ offset) */
			return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
		}

	}
}
