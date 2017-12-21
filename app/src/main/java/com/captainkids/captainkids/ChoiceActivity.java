package com.captainkids.captainkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class ChoiceActivity extends AppCompatActivity  {

    private TextView TextViewUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Bundle bundle = getIntent().getExtras();
        Button connect = (Button) findViewById(R.id.accompagnerbtn);

        TextViewUsername = (TextView) findViewById(R.id.TextViewUsername);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // Name, email address, and profile photo Url
            String name = user.getDisplayName();
            String email = user.getEmail();

            String uid = user.getUid();

            TextViewUsername.setText("Bonjour " + name);
        }

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPage4();
            }
        });
    }

    private void openPage4() {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }


}