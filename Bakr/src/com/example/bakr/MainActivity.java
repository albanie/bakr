package com.example.bakr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {
final Context context = this;
public static final String[] titles = new String[] { "Baguettes",
    "Allinson Charlotte", "Baileys", "Cheese Cake", "Beetroot" };

public static final String[] descriptions = new String[] {
    "Hard Bread",
    "A cake", "Cupcakes",
    "Tastes like lemons", "Red Vegetable" };

public static final Integer[] images = { R.drawable.bakr_girl,
    R.drawable.bakr_girl, R.drawable.bakr_girl, R.drawable.bakr_girl, R.drawable.bakr_girl };

ListView listView;
List<RowItem> rowItems;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < titles.length; i++) {
            RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }
 
        listView = (ListView) findViewById(R.id.list);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list_row, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
	}
		
	    

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
public void doStuff(View view){
	Intent intent = new Intent(this,MenuActivity.class);
	intent.putExtra("ID", view.getId());
	startActivity(intent);
	
}

@Override
public void onItemClick(AdapterView<?> parent, View view, int position,
        long id) {
    Intent intent = new Intent(this,MenuActivity.class);
    intent.putExtra("ID", position);
    startActivity(intent);
}
}
