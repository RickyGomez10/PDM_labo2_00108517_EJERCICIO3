package com.example.ejercicio3;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout Padrelll;
    LinearLayout rojolll;
    LinearLayout verdelll;
    LinearLayout azullll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Padrelll = findViewById(R.id.LLLpadre);
        rojolll = findViewById(R.id.LLLrojo);
        verdelll = findViewById(R.id.lllverde);
        azullll = findViewById(R.id.lllazul);

        rojolll.setOnClickListener(this);
        verdelll.setOnClickListener(this);
        azullll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int[] rojos = {R.color.rojo1, R.color.rojo2, R.color.rojo3, R.color.rojo4, R.color.rojo5, R.color.rojo6};
        int[] verdes = {R.color.verde1,R.color.verde2,R.color.verde3,R.color.verde4,R.color.verde5,R.color.verde6};

        int[] azules = {R.color.azul1,R.color.azul2,R.color.azul3,R.color.azul4,R.color.azul5,R.color.azul6};
        int viewId = v.getId();
        Log.i("id ",viewId+"");
        switch (viewId){
            case R.id.LLLrojo:

                rojolll.setBackgroundResource(rojos[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.lllverde:
                verdelll.setBackgroundResource(verdes[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.lllazul:
                azullll.setBackgroundResource(azules[(int) Math.floor(Math.random()*6)]);
                break;
        }
    }
}
