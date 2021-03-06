package com.example.zion.breastcancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MAKING OF THE ARRAY
        String[] classification = getResources().getStringArray(R.array.classification);

        //THE ARRAY ADAPTER
        ArrayAdapter<String> myAdapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classification);

        //CONNECTING LISTVIEW TO THE CODE
        ListView myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(myAdapter);

        //SETTING LISTENERS ON CLICK AND TRANSFERRING TO NEW ACTIVITY
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent goToEarlyIntervention = new Intent(MainActivity.this, EarlyIntervention.class);
                        startActivity(goToEarlyIntervention);
                        break;
                    case 1:
                        Intent goToLivingBreast = new Intent(MainActivity.this, LivingBreast.class);
                        startActivity(goToLivingBreast);
                        break;
                    case 2:
                        Intent goToMetastasis = new Intent(MainActivity.this, Metastasis.class);
                        startActivity(goToMetastasis);
                        break;
                    case 3:
                        Intent goToPrevention = new Intent(MainActivity.this, Prevention.class);
                        startActivity(goToPrevention);
                        break;
                    case 4:
                        Intent goToSurvivor = new Intent(MainActivity.this, Survivors.class);
                        startActivity(goToSurvivor);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
