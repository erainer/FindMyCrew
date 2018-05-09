package net.androidbootcamp.findmycrew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Button createBtn = (Button) findViewById(R.id.createBtn);
        final EditText first = (EditText) findViewById(R.id.firstNameBox);
        final EditText last = (EditText) findViewById(R.id.lastNameBox);
        final EditText email = (EditText) findViewById(R.id.emailBox);
        final EditText password = (EditText) findViewById(R.id.passBox);
        final EditText rePassword = (EditText) findViewById(R.id.repassBox);

        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = first.getText().toString();
                String lastName = last.getText().toString();
                String emailAddress = email.getText().toString();
                String pass = password.getText().toString();
                String rePass = rePassword.getText().toString();
                if(!firstName.isEmpty() && !lastName.isEmpty() && !emailAddress.isEmpty() && !pass.isEmpty() && !rePass.isEmpty()){
                    Intent createUser = new Intent(CreateAccount.this, MainActivity.class);
                    createUser.putExtra("first", firstName);
                    createUser.putExtra("last", lastName);
                    createUser.putExtra("email", emailAddress);
                    createUser.putExtra("password", pass);
                    startActivity(createUser);
                }else{
                    if(firstName.isEmpty()){
                        Toast.makeText(CreateAccount.this, "Enter your first name.", Toast.LENGTH_LONG).show();
                    }
                    else if(lastName.isEmpty()){
                        Toast.makeText(CreateAccount.this, "Enter your last name.", Toast.LENGTH_LONG).show();
                    }
                    else if(emailAddress.isEmpty()){
                        Toast.makeText(CreateAccount.this, "Enter your email.", Toast.LENGTH_LONG).show();
                    }
                    else if(pass.isEmpty()){
                        Toast.makeText(CreateAccount.this, "Enter your password.", Toast.LENGTH_LONG).show();
                    }
                    else if(rePass.isEmpty()) {
                        Toast.makeText(CreateAccount.this, "Re-enter your password.", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
