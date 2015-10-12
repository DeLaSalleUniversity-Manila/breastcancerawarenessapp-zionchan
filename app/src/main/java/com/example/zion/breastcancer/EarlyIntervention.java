package com.example.zion.breastcancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class EarlyIntervention extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_early_intervention);
        ListView listEI = (ListView) findViewById(R.id.listViewEI);
        int[] photosEI = {R.drawable.norie, R.drawable.placida, R.drawable.marivic, R.drawable.rosalie, R.drawable.bernardita};
        String[] namesEI = getResources().getStringArray(R.array.namesEI);
        DataAdapter adapter = new DataAdapter(getApplicationContext(),R.layout.row_layout);
        listEI.setAdapter(adapter);

        int i=0;
        for(String names: namesEI)
        {
            DataProvider provide = new DataProvider(photosEI[i],namesEI[i]);
            adapter.add(provide);
            i++;
        }
        listEI.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent goToNorie = new Intent(EarlyIntervention.this, norie.class);
                        startActivity(goToNorie);
                        break;
                    case 1:
                        Intent goToPlacida = new Intent(EarlyIntervention.this, placida.class);
                        startActivity(goToPlacida);
                        break;
                    case 2:
                        Intent goToMarivic = new Intent(EarlyIntervention.this, marivic.class);
                        startActivity(goToMarivic);
                        break;
                    case 3:
                        Intent goToRosalie = new Intent(EarlyIntervention.this, rosalie.class);
                        startActivity(goToRosalie);
                        break;
                    case 4:
                        Intent goToBernardita = new Intent(EarlyIntervention.this, bernardita.class);
                        startActivity(goToBernardita);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_early_intervention, menu);
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
