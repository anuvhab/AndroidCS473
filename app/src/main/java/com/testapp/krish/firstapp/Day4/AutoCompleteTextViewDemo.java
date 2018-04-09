package com.testapp.krish.firstapp.Day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.testapp.krish.firstapp.R;

public class AutoCompleteTextViewDemo extends AppCompatActivity {
    AutoCompleteTextView actv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        actv = (AutoCompleteTextView) findViewById(R.id.actv_movies);

        String[] values = getResources().getStringArray(R.array.movies);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(AutoCompleteTextViewDemo.this, android.R.layout.simple_spinner_item, values);

        actv.setAdapter(adapter);
        actv.setThreshold(2);

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(AutoCompleteTextViewDemo.this, "Item selected is : " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
