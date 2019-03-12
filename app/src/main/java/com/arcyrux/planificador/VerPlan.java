package com.arcyrux.planificador;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class VerPlan extends AppCompatActivity {

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

        View linea1 = inflater.inflate(R.layout.linea_pierna, parent, false);
        parent.addView(linea1);
    }
}
