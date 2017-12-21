package com.captainkids.captainkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class ChoiceActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Bundle bundle = getIntent().getExtras();
        Button connect = (Button) findViewById(R.id.accompagnerbtn);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPage4();
            }
        });
    }

    private void openPage4() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }


}