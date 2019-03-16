package com.arcyrux.planificador;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class VerPlanActivity extends AppCompatActivity {

    private LinearLayout parent;
    int hijos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_plan);
    }

    @Override
    protected void onResume() {
        super.onResume();

        setContentView(R.layout.activity_ver_plan);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout parent = findViewById(R.id.parent);

        View linea = inflater.inflate(R.layout.linea_pierna, parent, false);
        parent.addView(linea);

    }

    public void nuevaPierna(View view){


        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        parent = findViewById(R.id.parent);

        View linea = inflater.inflate(R.layout.linea_pierna, parent, false);
        parent.addView(linea);

        hijos = parent.getChildCount();
        linea.setId(hijos);
    }

    public void quitarPierna(View view){

        try {
            hijos = parent.getChildCount();
            View linea = findViewById(hijos);
            parent = findViewById(R.id.parent);
            parent.removeView(linea);
        } catch(Exception ignored){}
    }



/*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Make sure to call the super method so that the states of our views are saved
        super.onSaveInstanceState(outState);

        outState.putInt("lineas", hijos);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        savedInstanceState.getInt("lineas");
    }*/
}
