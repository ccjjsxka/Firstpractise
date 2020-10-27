package com.example.firstpractise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取控件 out
        TextView outobj = findViewById(R.id.out);
        outobj.setText("kkkkk");

        //Log.i(tag:"loading",msg:"onCreate:"msg.......");

        EditText inp = findViewById(R.id.inp);
        String text = inp.getText().toString();
    }

}