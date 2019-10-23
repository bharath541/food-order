package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button pizzaButton,BurgerButton,PastryButton;
    String choices = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzaButton = (Button) findViewById(R.id.pizzaButton);
        BurgerButton = (Button) findViewById(R.id.BurgerButton);
        PastryButton = (Button) findViewById(R.id.PastryButton);
    }
    public void add_to_list(View view)
    {
        if (view == findViewById(R.id.pizzaButton))
        {
            choices = choices+"Pizza"+"\n";
            price = price+1200;
        }
        else if (view == findViewById(R.id.BurgerButton))
        {
            choices = choices+"Burger"+"\n";
            price = price+200;
        }
        else if (view == findViewById(R.id.PastryButton))
        {
            choices = choices+"Pastry"+"\n";
            price = price+80;
        }
    }
    public void placeOrder(View view) {
        Intent i = new Intent ( MainActivity.this, Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);
    }
}
