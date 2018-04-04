package com.testapp.krish.firstapp.Day2;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.testapp.krish.firstapp.R;

public class ConverterActivity extends AppCompatActivity {

    EditText input, output;
    Double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        Button btn_Convert =(Button) findViewById(R.id.btn_Convert);

        input = (EditText) findViewById(R.id.et_layoutLB);
        output = (EditText) findViewById(R.id.et_layoutKG);



        btn_Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Double.parseDouble(input.getText().toString()) * 0.456;
                Log.e("Error", "This is Error");
                output.setText(result.toString());
            }
        });
    }


}
