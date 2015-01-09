package com.sai.samples.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher.ViewFactory;

public class ImageSwitcherView extends Activity implements ViewFactory {

	Integer pics[] = { R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
			R.drawable.e };

	ImageSwitcher iSwitcher;
	Button like;
	Button dislike;
	Button love;
	Button next;
	int i = 0;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Firebase.setAndroidContext(this);
		// Firebase myFirebaseRef = new
		// Firebase("https://dazzling-heat-7789.firebaseio.com/");

		like = (Button) findViewById(R.id.button1);
		dislike = (Button) findViewById(R.id.button2);
		love = (Button) findViewById(R.id.button4);
		next = (Button) findViewById(R.id.button6);

		iSwitcher = (ImageSwitcher) findViewById(R.id.ImageSwitcher01);
		iSwitcher.setFactory(this);
		iSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.slide_in_left));
		iSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.slide_out_right));
		iSwitcher.setImageResource(pics[i]);

		like.setOnClickListener(new OnClickListener() {

			//

			@Override
			public void onClick(View arg0) {

				// TODO Auto-generated method stub

				if (i == 4) {
					i = 0;
					iSwitcher.setImageResource(pics[i]);

				} else {

					i++;
					iSwitcher.setImageResource(pics[i]);

				}
				Toast.makeText(getApplicationContext(), "Liked",
						Toast.LENGTH_SHORT).show();
				// try {
				// Firebase my = new Firebase("https://otw.firebaseio.com/");
				// my.child("d").setValue("Liked");
				// } catch (Exception e) {
				// Toast.makeText(getApplicationContext(),
				// "Can't Connect to Firebase", Toast.LENGTH_SHORT)
				// .show();
				// }
			}
		});

		dislike.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				if (i == 4) {
					i = 0;
					iSwitcher.setImageResource(pics[i]);

				} else {

					i++;
					iSwitcher.setImageResource(pics[i]);
				}
				Toast.makeText(getApplicationContext(), "Disliked",
						Toast.LENGTH_SHORT).show();

			}
		});
		
		
		love.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				if (i == 4) {
					i = 0;
					iSwitcher.setImageResource(pics[i]);

				} else {

					i++;
					iSwitcher.setImageResource(pics[i]);
				}
				Toast.makeText(getApplicationContext(), "Likey!!!!!!",
						Toast.LENGTH_SHORT).show();

			}
		});
		
		
		next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				if (i == 4) {
					i = 0;
					iSwitcher.setImageResource(pics[i]);

				} else {

					i++;
					iSwitcher.setImageResource(pics[i]);
				}
				Toast.makeText(getApplicationContext(), "Next",
						Toast.LENGTH_SHORT).show();

			}
		});
	}

	@Override
	public View makeView() {
		ImageView iView = new ImageView(this);
		iView.setScaleType(ImageView.ScaleType.FIT_CENTER);
		iView.setLayoutParams(new ImageSwitcher.LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
		iView.setBackgroundColor(0xFF000000);
		return iView;
	}
}