package com.example.zion.breastcancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LivingBreast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_breast);
        ListView listLB = (ListView) findViewById(R.id.listViewLB);
        int[] photosLB = {R.drawable.rosalisa, R.drawable.ma_cristina, R.drawable.marcelina, R.drawable.juanita, R.drawable.helen};
        String[] namesLB = getResources().getStringArray(R.array.namesLwBC);
        DataAdapter adapter = new DataAdapter(getApplicationContext(),R.layout.row_layout);
        listLB.setAdapter(adapter);

        int i=0;
        for(String names: namesLB)
        {
            DataProvider provide = new DataProvider(photosLB[i],namesLB[i]);
            adapter.add(provide);
            i++;
        }

        listLB.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent goToRosalisa = new Intent(LivingBreast.this, rosalisa.class);
                        startActivity(goToRosalisa);
                        break;
                    case 1:
                        Intent goToMaCristina = new Intent(LivingBreast.this, ma_cristina.class);
                        startActivity(goToMaCristina);
                        break;
                    case 2:
                        Intent goToMarcelina = new Intent(LivingBreast.this, marcelina.class);
                        startActivity(goToMarcelina);
                        break;
                    case 3:
                        Intent goToJuanita = new Intent(LivingBreast.this, juanita.class);
                        startActivity(goToJuanita);
                        break;
                    case 4:
                        Intent goToHelen = new Intent(LivingBreast.this, helen.class);
                        startActivity(goToHelen);
                        break;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_living_breast, menu);
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
