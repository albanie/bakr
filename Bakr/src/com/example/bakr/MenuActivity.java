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
	    case (R.id.baguetteButton):
	    	setContentView(R.layout.recipe_one);
	    break;
	    case (R.id.appleButton):
	    	setContentView(R.layout.recipe_two);
	    break;
	    case (R.id.cupcakeButton):
	    	setContentView(R.layout.recipe_three);
	    break;
	    case (R.id.cheesecakeButton):
	    	setContentView(R.layout.recipe_four);
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

