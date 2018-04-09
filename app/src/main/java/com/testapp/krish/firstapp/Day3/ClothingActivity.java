package com.testapp.krish.firstapp.Day3;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.testapp.krish.firstapp.R;

import org.w3c.dom.Text;

public class ClothingActivity extends AppCompatActivity {


    String[] itemsNames = new String[]{"Blue Jeans", " Jeans Shirt", "Men Shirt", "t-shirt", "White Jeans"};

    ListView clListview;
    final Context context = this;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);

        clListview = (ListView) findViewById(R.id.cl_list);
        ArrayAdapter adapter = new ArrayAdapter<String>(ClothingActivity.this,android.R.layout.simple_list_item_1, itemsNames);

       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(ClothingActivity.this, android.R.layout.simple_list_item_1,android.R.id.text1, itemsNames);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(BaseActivity.this, android.R.layout.simple_list_item_1,menu);
        clListview.setAdapter(adapter);
        clListview.setClickable(true);

     //   clListview.setAdapter(new ArrayAdapter<String>(ClothingActivity.this, R.layout.custom_clothing, R.id.itemname, itemsNames));

        // Bind array strings into an adapter
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, android.R.id.text1,
//                SamsungPhones);
//        listView.setAdapter(adapter);

    }


//    private class MySimpleAdapater extends ArrayAdapter<String>{
//        Context context;
//
//        public MySimpleAdapater(@NonNull Context context, String[] values) {
//            super(context, 0,values);
//            this.context = context;
//        }
//
//
//        @NonNull
//        @Override
//        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//           // return super.getView(position, convertView, parent);
//
//
//            View rowView = LayoutInflater.from(context).inflate(R.layout.custom_clothing,parent,false);
////            LayoutInflater inflater = (LayoutInflater) context
////                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
////            View rowView = inflater.inflate(R.layout.custom_clothing, parent, false);
//            TextView textView = (TextView) rowView.findViewById(R.id.itemname);
//            ImageView imageView = (ImageView) rowView.findViewById(R.id.imageview_icon);
//            textView.setText("gjgjhg");
//
//
//            return rowView;
//        }
//
//        @Override
//        public int getCount() {
//            return itemsNames.length;
//        }
//    }
}
