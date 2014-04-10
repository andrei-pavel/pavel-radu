package com.pdsd.blue_fi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;

//This is the detailed Bluetooth activity of a certain device.

public class WifiActivity extends Activity {

	// Constants.
	public final static String GO_BACK = "com.example.myfirstapp.GO_BACK";

	// Global variables.
	SharedPreferences preferences;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wifi);

		// Global variables at app-level.
		preferences = this.getSharedPreferences( "com.pdsd.blue_fi", Context.MODE_PRIVATE );
		
		Intent intent = getIntent();
		String id = intent.getStringExtra( MainActivity.GO_TO_WIFI_ACTIVITY );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wifi, menu);
		return true;
	}

	public void goBack( View view ){
		Intent intent = new Intent( this, MainActivity.class );
		intent.putExtra( GO_BACK, view.getId() );
		startActivity( intent );		
	}
}
