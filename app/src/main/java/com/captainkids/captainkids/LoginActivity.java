package com.captainkids.captainkids;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button signinbtn;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button registerbtn;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() !=null){
            finish();
            startActivity(new Intent(getApplicationContext(), Main3Activity.class));
        }

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        signinbtn = (Button) findViewById(R.id.signinbtn);
        registerbtn = (Button) findViewById(R.id.registerbtn);

        signinbtn.setOnClickListener(this);
        registerbtn.setOnClickListener(this);
    }

    private void userLogin() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)){
            Toast.makeText(getBaseContext(), "Please enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)){
            Toast.makeText(getBaseContext(), "Please enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(getBaseContext(), "ok", Toast.LENGTH_SHORT).show();

        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Toast.makeText(getBaseContext(), "allo", Toast.LENGTH_SHORT).show();
                        if(task.isSuccessful()){
                            Toast.makeText(getBaseContext(), "heyyyyyyy", Toast.LENGTH_SHORT).show();
                            finish();
                            startActivity(new Intent(getApplicationContext(), Main3Activity.class));
                        }
                    }
                });
    }



    //Button signinbtn = (Button) findViewById(R.id.signinbtn);
//

//
    //signinbtn.setOnClickListener(new View.OnClickListener() {
    //    @Override
    //    public void onClick(View view) {
    //        openPage2();
    //    }
    //});
    // }
//
    //private void openPage2() {
    //    Intent intent = new Intent(this, Main2Activity.class);
    //    startActivity(intent);
    //}

    @Override
    public void onClick(View view) {
        if (view == signinbtn) {
            userLogin();
        }
        if (view == registerbtn) {
            //finish();
            //startActivity(new Intent( this, RegisterActivity.class));;
        }
    }
}