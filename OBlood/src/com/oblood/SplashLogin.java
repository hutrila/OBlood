package com.oblood;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;


public class SplashLogin extends Activity {
MediaPlayer sound;
ImageButton LoginFB;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_splashscreen);
		
		ImageView bloodanimasi = (ImageView) findViewById(R.id.bloodanimasi);
		bloodanimasi.setBackgroundResource(R.drawable.bloodloader);
		AnimationDrawable animationDrawable = (AnimationDrawable) bloodanimasi.getBackground();
		animationDrawable.start();
		
		sound = MediaPlayer.create(this, R.raw.music);
		sound.setLooping(true);
		sound.setVolume(1, 1);
		sound.start();
		
		LoginFB = (ImageButton) findViewById(R.id.btnLoginFB);
		LoginFB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent toMain = new Intent(SplashLogin.this, MainActivity.class);
				startActivity(toMain);
			}
		});
		
		
		
		
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		sound.stop();
	}
	
	
	
	

}
