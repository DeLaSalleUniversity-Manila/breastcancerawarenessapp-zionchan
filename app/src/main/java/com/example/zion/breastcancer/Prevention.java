package com.example.zion.breastcancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Prevention extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);
        ListView listP = (ListView) findViewById(R.id.listViewP);
        int[] photosP = {R.drawable.julie, R.drawable.theodora, R.drawable.concepcion, R.drawable.ma_asuncion, R.drawable.jane};
        String[] namesP = getResources().getStringArray(R.array.namesPitC);
        DataAdapter adapter = new DataAdapter(getApplicationContext(),R.layout.row_layout);
        listP.setAdapter(adapter);

        int i=0;
        for(String names: namesP)
        {
            DataProvider provide = new DataProvider(photosP[i],namesP[i]);
            adapter.add(provide);
            i++;
        }
        listP.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent goToJulie = new Intent(Prevention.this, julie.class);
                        startActivity(goToJulie);
                        break;
                    case 1:
                        Intent goToTheodora = new Intent(Prevention.this, theodora.class);
                        startActivity(goToTheodora);
                        break;
                    case 2:
                        Intent goToConcepcion = new Intent(Prevention.this, concepcion.class);
                        startActivity(goToConcepcion);
                        break;
                    case 3:
                        Intent goToMaAsuncion = new Intent(Prevention.this, ma_ascuncion.class);
                        startActivity(goToMaAsuncion);
                        break;
                    case 4:
                        Intent goToJane = new Intent(Prevention.this, jane.class);
                        startActivity(goToJane);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_prevention, menu);
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
