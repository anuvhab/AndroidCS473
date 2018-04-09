package com.testapp.krish.firstapp.Day3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.testapp.krish.firstapp.R;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        Intent intent =  getIntent();

        String output = intent.getStringExtra("userNameInput");
        TextView tv = (TextView) findViewById(R.id.textviewwelcomename);

        tv.setText("Welcome " + output);
    }


    public void electronicsClick(View view) {

        Toast.makeText(this, "You clicked Electronics", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(ShoppingActivity.this, ElectronicsActivity.class);
        startActivity(intent);
    }

    public void clothingClick(View view) {
        Toast.makeText(this, "You have clicked clothing", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(ShoppingActivity.this, ClothingActivity.class);
        startActivity(intent);
    }

    public void beautyClick(View view) {
        Toast.makeText(this, "You have clicked Beauty", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(ShoppingActivity.this, BeautyActivity.class);
        startActivity(intent);
    }

    public void foodClick(View view) {

        Toast.makeText(this, "You have clicked Food", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ShoppingActivity.this, FoodActivity.class);
        startActivity(intent);
    }

    public static class ClothingActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_clothing);
        }
    }
}
