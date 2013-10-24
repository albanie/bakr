package com.example.bakr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		int id=intent.getIntExtra("ID",0);
		setContentView(R.layout.activity_main);
	    switch (id) {
	    case (R.id.imageView3):
	    	setContentView(R.layout.recipe_one);
	    break;
	    case (R.id.imageView4):
	    	setContentView(R.layout.recipe_two);
	    break;
	    case (R.id.imageView5):
	    	setContentView(R.layout.recipe_three);
	    break;
	    case (R.id.imageView6):
	    	setContentView(R.layout.recipe_four);
	    break;
	    case (R.id.imageView7):
	    	setContentView(R.layout.recipe_five);
	    break;

	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}

