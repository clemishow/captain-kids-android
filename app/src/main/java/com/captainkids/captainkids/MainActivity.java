package com.captainkids.captainkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connect = (Button)findViewById(R.id.connect);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPage2();
            }
        });
    }

    private void openPage2() {
        Intent intent = new Intent("android.intent.action.Main2Activity");
        startActivity(intent);
    }
}
