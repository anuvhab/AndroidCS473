package com.testapp.krish.firstapp.Day2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.testapp.krish.firstapp.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DinnerDeciderActivity extends AppCompatActivity {

    ArrayList<String> food;
    Random randomGenerator;
    TextView viewFood;
    EditText editTextAddFood;
    Button btn_Decide;
    Button btn_AddFood;
    String foodAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_decider);

        food = new ArrayList<String>(
                Arrays.asList("Pizza", "Burger", "Doughnut", "Mexican", "American")
        );

        randomGenerator = new Random();
        btn_Decide = (Button) findViewById(R.id.btn_Decide);
        viewFood = (TextView) findViewById(R.id.txt_food);

        btn_Decide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = randomGenerator.nextInt(food.size());
                String randomData = food.get(index);
                viewFood.setText(randomData);

            }
        });

        btn_AddFood = (Button) findViewById(R.id.btn_AddFood);
        editTextAddFood = (EditText) findViewById(R.id.et_AddFood);

        btn_AddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                foodAdded = editTextAddFood.getText().toString();
                if(!foodAdded.equals("")){
                    food.add(foodAdded);
                    Toast.makeText(getApplicationContext(),"Successfully added item", Toast.LENGTH_LONG).show();
                    editTextAddFood.setText("");

                }
                else{
                    Toast.makeText(getApplicationContext(),"Failed to add item", Toast.LENGTH_LONG).show();
                }

            }
        });


    }

}
