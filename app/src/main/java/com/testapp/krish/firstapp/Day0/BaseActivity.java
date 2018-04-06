package com.testapp.krish.firstapp.Day0;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import com.testapp.krish.firstapp.Day1.MainActivity;
import com.testapp.krish.firstapp.Day2.ConverterActivity;
import com.testapp.krish.firstapp.Day2.DinnerDeciderActivity;
import com.testapp.krish.firstapp.Day3.ImplicitIntentActivity;
import com.testapp.krish.firstapp.Day3.WalmartStoreActivity;
import com.testapp.krish.firstapp.Day4.AutoCompleteTextViewDemo;
import com.testapp.krish.firstapp.R;

public class BaseActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String[] menu = {"Main Activity", "Converter Activity", "Dinner Selection", "Walmart Store","AutoCompleteTextViewDemo", "ImplicitIntentActivity"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(BaseActivity.this, android.R.layout.simple_list_item_1,menu);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if(position== 0){
            startActivity(new Intent(BaseActivity.this, MainActivity.class));
        }
        else if(position == 1){
            startActivity(new Intent(BaseActivity.this, ConverterActivity.class));
        }
        else if(position == 2){
            startActivity(new Intent(BaseActivity.this, DinnerDeciderActivity.class));
        }
        else if(position == 3){
            startActivity(new Intent(BaseActivity.this, WalmartStoreActivity.class));
        }
        else if(position == 4){
            startActivity(new Intent(BaseActivity.this, AutoCompleteTextViewDemo.class));
        }
        else if(position == 5){
            startActivity(new Intent(BaseActivity.this, ImplicitIntentActivity.class));
        }
    }
}
