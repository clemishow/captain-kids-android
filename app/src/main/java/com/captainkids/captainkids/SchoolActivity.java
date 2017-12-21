package com.captainkids.captainkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SchoolActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedIanstanceState) {
        super.onCreate(savedIanstanceState);
        setContentView(R.layout.activity_school);

        listView = (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(SchoolActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ecoles));

        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SchoolActivity.this, ChoiceActivity.class);
                intent.putExtra("ecoles",listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

    }

}
