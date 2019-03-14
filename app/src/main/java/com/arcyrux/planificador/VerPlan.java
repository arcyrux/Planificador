package com.arcyrux.planificador;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class VerPlan extends AppCompatActivity {

    private LinearLayout parent;

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

//        Button btn_quitar_pierna = linea.findViewById(R.id.btn_quitar_pierna);
//        btn_quitar_pierna.setVisibility(View.GONE);

    }

    public void nuevaPierna(View view){


        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        parent = findViewById(R.id.parent);

        View linea = inflater.inflate(R.layout.linea_pierna, parent, false);
        parent.addView(linea);

        int hijos = parent.getChildCount();
        linea.setId(hijos);

/*        Button btn_quitar_pierna = linea.findViewById(R.id.btn_quitar_pierna);
        btn_quitar_pierna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                parent.removeView((View) view.getParent());
            }
        });*/
    }

    public void quitarPierna(View view){

        try {
            int hijos = parent.getChildCount();
            View linea = findViewById(hijos);
            parent = findViewById(R.id.parent);
            parent.removeView(linea);
        } catch(Exception ignored){}
    }
}
