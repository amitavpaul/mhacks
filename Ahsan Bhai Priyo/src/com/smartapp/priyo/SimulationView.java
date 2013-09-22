package com.smartapp.priyo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.smartapp.entities.Performance;

public class SimulationView extends SurfaceView implements
		SurfaceHolder.Callback, Runnable {
	private Bitmap car1, car2;
	private Performance p1, p2;
	private int x1, y1, x2, y2;

	public SimulationView(Context context, Performance pf1, Performance pf2) {
		super(context);
		car1 = BitmapFactory.decodeResource(context.getResources(),
				R.drawable.car1);
		car2 = BitmapFactory.decodeResource(context.getResources(),
				R.drawable.car2);
		this.p1 = pf1;
		this.p2 = pf2;
		setFocusableInTouchMode(true);
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// TODO Auto-generated method stub

	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}
