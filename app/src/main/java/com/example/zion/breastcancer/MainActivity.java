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
        String[] myStringArray = {"A", "B", "C", "Example Testimony", "E", "F", "G", "H", "I", "J", "K", "L"};

        //THE ARRAY ADAPTER
        ArrayAdapter<String> myAdapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myStringArray);

        //CONNECTING LISTVIEW TO THE CODE
        ListView myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(myAdapter);

        //SETTING LISTENERS ON CLICK AND TRANSFERRING TO NEW ACTIVITY
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 3:
                        Intent goToExampleTestimony = new Intent(MainActivity.this, ExampleTestimony.class);
                        startActivity(goToExampleTestimony);
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
