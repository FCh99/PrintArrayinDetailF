package com.example.faustocheca.myapplication;

import android.content.Intent;
import android.support.v4.util.CircularIntArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    TextView textView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = (TextView) findViewById(R.id.text_view_detail);




        ArrayList<Car> myList = getIntent().getParcelableArrayListExtra("cars");




        textView.setText(String.valueOf(myList));



    }











}
