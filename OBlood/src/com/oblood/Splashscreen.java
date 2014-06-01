package com.oblood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class Splashscreen extends Activity {

	private static int waktusplash = 2000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fragment_splashscreen);
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent toSplashLogin = new Intent(Splashscreen.this,SplashLogin.class);
				startActivity(toSplashLogin);
				finish();
			}
		},waktusplash);
	}
	
	
}
