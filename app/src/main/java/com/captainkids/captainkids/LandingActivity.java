package com.captainkids.captainkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        Bundle bundle = getIntent().getExtras();
        Button connect = (Button) findViewById(R.id.buttonConnect);
        Button register = (Button) findViewById(R.id.buttonRegister);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPageLogin();
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPageRegister();
            }
        });
    }

    private void openPageLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    private void openPageRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }


}
