package com.testapp.krish.firstapp.Day3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.testapp.krish.firstapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WalmartStoreActivity extends AppCompatActivity {

    static ArrayList<User> users;
    EditText userName, password;
    Button btn;
    TextView text_createaccount;

    String userNameStr, passwordStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walmart_store);
        userName = (EditText) findViewById(R.id.editText_UserName);
        password = (EditText) findViewById(R.id.editText_password);


        users = new ArrayList<User>(Arrays.asList(
                new User("Krishna", "KC", "kkc@mum.edu","kkc"),
                new User("Niwesh", "Rai", "ncrai@mum.edu", "ncrai")
        ));



        btn = (Button) findViewById(R.id.btn_signin);
        text_createaccount = (TextView) findViewById(R.id.txt_register);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WalmartStoreActivity.this, ShoppingActivity.class);
                intent.putExtra("userNameInput",userNameStr);
                startActivity(intent);

               /* userNameStr = userName.getText().toString();
                Toast.makeText(WalmartStoreActivity.this, userNameStr, Toast.LENGTH_SHORT).show();
                passwordStr = password.getText().toString();
                Toast.makeText(WalmartStoreActivity.this, passwordStr, Toast.LENGTH_SHORT).show();

                for(User u : users){
                    if(u.geteMail().equals(userNameStr) && u.getPassword().equals(passwordStr)){
                        Intent intent = new Intent(WalmartStoreActivity.this, ShoppingActivity.class);
                        intent.putExtra("userNameInput",userNameStr);
                        startActivity(intent);
                    }

                }*/

            }
        });



//        text_createaccount.setOnTouchListener(new View.OnTouchListener(){
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Intent intent = new Intent(WalmartStoreActivity.this, CreateAccountActivity.class);
//                startActivity(intent);
//
//                return true;
//            }
//        });




    }
    public void registerClick(View v){
        Intent intent = new Intent(WalmartStoreActivity.this, CreateAccountActivity.class);
        startActivity(intent);
    }
}
