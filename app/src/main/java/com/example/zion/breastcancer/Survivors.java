package com.example.zion.breastcancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Survivors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survivors);
        ListView listCS = (ListView) findViewById(R.id.listViewCS);
        int[] photosCS = {R.drawable.ana, R.drawable.mercy, R.drawable.richilda, R.drawable.lily, R.drawable.bibiana};
        String[] namesCS = getResources().getStringArray(R.array.namesCS);
        DataAdapter adapter = new DataAdapter(getApplicationContext(),R.layout.row_layout);
        listCS.setAdapter(adapter);

        int i=0;
        for(String names: namesCS)
        {
            DataProvider provide = new DataProvider(photosCS[i],namesCS[i]);
            adapter.add(provide);
            i++;
        }

        listCS.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent goToAna = new Intent(Survivors.this, ana.class);
                        startActivity(goToAna);
                        break;
                    case 1:
                        Intent goToMercy = new Intent(Survivors.this, mercy.class);
                        startActivity(goToMercy);
                        break;
                    case 2:
                        Intent goToRichilda = new Intent(Survivors.this, richilda.class);
                        startActivity(goToRichilda);
                        break;
                    case 3:
                        Intent goToLily = new Intent(Survivors.this, lily.class);
                        startActivity(goToLily);
                        break;
                    case 4:
                        Intent goToBibiana = new Intent(Survivors.this, bibiana.class);
                        startActivity(goToBibiana);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_survivors, menu);
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
