package com.gkcrop.riddlemethat;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

	
	
	Button earnButton;
	Button LetsPlay;
	Context context;
	

	EarnCoin coin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		coin=new EarnCoin(getApplicationContext());
		
		Typeface font = Typeface.createFromAsset(getAssets(), "SLABS THIN.otf");
		TextView play = (TextView) findViewById(R.id.letsPlay);
		TextView earncoin = (TextView) findViewById(R.id.earncoin);
		
		
		
		
		play.setTypeface(font);
		earncoin.setTypeface(font);
		
		
		
		
		
		

		LetsPlay = (Button)findViewById(R.id.letsPlay);
		
		
		
		earnButton = (Button)findViewById(R.id.earncoin);
		context = this;

		
		
		
		
		
		LetsPlay.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intgame=new Intent(MainActivity.this,TheGame.class);
				startActivity(intgame);

			}
		});

		

		

			
		
			
		
		earnButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent intearn=new Intent(MainActivity.this,EarnCoinActivity.class);
				startActivity(intearn);
				
				
			}
		});



	}



	

}
