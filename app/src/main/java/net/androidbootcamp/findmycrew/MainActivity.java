package net.androidbootcamp.findmycrew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button) findViewById(R.id.loginBtn);
        Button create = (Button) findViewById(R.id.createAccountBtn);
        Button forgot = (Button) findViewById(R.id.yourActivity);
        final EditText email = (EditText) findViewById(R.id.emailBox);
        final EditText password = (EditText) findViewById(R.id.passwordBox);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = getIntent().getStringExtra("first");
                String lastName = getIntent().getStringExtra("last");
                final String emailAddress = getIntent().getStringExtra("email");
                final String pass = getIntent().getStringExtra("password");
                if(email.getText().toString().equals(emailAddress) && password.getText().toString().equals(pass)){
                    Intent createProfile = new Intent(MainActivity.this, Profile.class);
                    createProfile.putExtra("first", firstName);
                    createProfile.putExtra("last", lastName);
                    startActivity(createProfile);
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect username or password.", Toast.LENGTH_LONG).show();
                }
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CreateAccount.class));
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
