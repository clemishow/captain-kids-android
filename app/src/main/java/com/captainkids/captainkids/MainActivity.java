package com.captainkids.captainkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button connect = (Button) findViewById(R.id.signinbtn);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPage2();
            }
        });
    }

    private void openPage2() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
