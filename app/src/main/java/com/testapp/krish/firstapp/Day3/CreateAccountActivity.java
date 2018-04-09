package com.testapp.krish.firstapp.Day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.testapp.krish.firstapp.R;

public class CreateAccountActivity extends AppCompatActivity {

    EditText firstName, lastName, email, password;
    String fName, lName, eMail, pswd;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        firstName = (EditText) findViewById(R.id.editText_firstname);
        lastName = (EditText) findViewById(R.id.editText_lastname);
        email = (EditText) findViewById(R.id.editText_UserName);
        password = (EditText) findViewById(R.id.editText_password);

        btnSubmit = (Button) findViewById(R.id.btn_signin);

        fName = firstName.getText().toString();
        lName = lastName.getText().toString();
        eMail = email.getText().toString();
        pswd = password.getText().toString();


        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                    WalmartStoreActivity.users.add(new User(fName,lName,eMail,pswd));

                    Toast.makeText(CreateAccountActivity.this, "Successfully Added User", Toast.LENGTH_SHORT).show();

                firstName.setText("");
                lastName.setText("");
                email.setText("");
                password.setText("");
            }
        });

    }
}
