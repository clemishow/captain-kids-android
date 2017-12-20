package com.captainkids.captainkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView =  (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ecoles));

        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("ecoles",listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

    }

}
