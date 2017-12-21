package com.captainkids.captainkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Bundle bundle = getIntent().getExtras();
        Button buttonValidate = (Button) findViewById(R.id.buttonValidate);

        buttonValidate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                openPageEnd();
            }
        });
    }
    private void openPageEnd() {
        Intent intent = new Intent(this, EndActivity.class);
        startActivity(intent);
    }
}

