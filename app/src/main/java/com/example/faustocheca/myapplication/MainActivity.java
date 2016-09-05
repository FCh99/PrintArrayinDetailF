package com.example.faustocheca.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);
        button = (Button) findViewById(R.id.button_main);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Car car1 = new Car("Toyota", 12000);
                Car car2 = new Car("Seat", 89000);

                ArrayList<Car> carCollection = new ArrayList<>();

                carCollection.add(car1);
                carCollection.add(car2);


                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                intent.putParcelableArrayListExtra("cars", carCollection);


                startActivity(intent);
            }
        });







    }
}
