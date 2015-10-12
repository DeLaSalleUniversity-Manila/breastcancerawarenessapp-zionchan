package com.example.zion.breastcancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Metastasis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metastasis);
        ListView listRM = (ListView) findViewById(R.id.listViewRM);
        int[] photosRM = {R.drawable.annaliza, R.drawable.teresita, R.drawable.anna, R.drawable.ma_victoria, R.drawable.patria};
        String[] namesRM = getResources().getStringArray(R.array.namesRM);
        DataAdapter adapter = new DataAdapter(getApplicationContext(),R.layout.row_layout);
        listRM.setAdapter(adapter);

        int i=0;
        for(String names: namesRM)
        {
            DataProvider provide = new DataProvider(photosRM[i],namesRM[i]);
            adapter.add(provide);
            i++;
        }
        listRM.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent goToAnnaliza = new Intent(Metastasis.this, annaliza.class);
                        startActivity(goToAnnaliza);
                        break;
                    case 1:
                        Intent goToTeresita = new Intent(Metastasis.this, teresita.class);
                        startActivity(goToTeresita);
                        break;
                    case 2:
                        Intent goToAnna = new Intent(Metastasis.this, anna.class);
                        startActivity(goToAnna);
                        break;
                    case 3:
                        Intent goToMaVictoria = new Intent(Metastasis.this, ma_victoria.class);
                        startActivity(goToMaVictoria);
                        break;
                    case 4:
                        Intent goToPatria = new Intent(Metastasis.this, patria.class);
                        startActivity(goToPatria);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_metastasis, menu);
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
