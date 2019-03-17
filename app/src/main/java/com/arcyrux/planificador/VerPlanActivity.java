package com.arcyrux.planificador;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class VerPlanActivity extends AppCompatActivity{

    private LinearLayout parent;
    private int hijos = 0;
    ArrayList<Pierna> pierna = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_plan);

        if (savedInstanceState != null) {
            // Restore value of members from saved state
            pierna = savedInstanceState.getParcelableArrayList("pierna");
            Toast.makeText(getApplicationContext(), pierna.size()+"",Toast.LENGTH_SHORT).show();
        }
        else{
            Pierna leg = new Pierna(1);
            pierna.add(leg);

        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout parent = findViewById(R.id.parent);
        //LinearLayout contenedor = findViewById(R.id.contenedor);

        for (int i = 0; i < pierna.size(); i++) {
            //Toast.makeText(getApplicationContext(), i+"",Toast.LENGTH_SHORT).show();

            View linea = inflater.inflate(R.layout.linea_pierna, null);
            parent.addView(linea);

            Button boton = linea.findViewById(R.id.btn_leg);
            boton.setText(i+1+"");

            linea.setId(i + 1);
            boton.setId(i);
        }

    }

    public void nuevaPierna(View view){

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        parent = findViewById(R.id.parent);

        View linea = inflater.inflate(R.layout.linea_pierna, parent, false);
        parent.addView(linea);

        hijos = pierna.size();
        //Toast.makeText(getApplicationContext(), hijos+"",Toast.LENGTH_SHORT).show();
        linea.setId(hijos+1);
        Pierna leg = new Pierna(hijos+1);
        pierna.add(leg);

        Button boton = findViewById(R.id.btn_leg);
        boton.setText(hijos+1+"");
        boton.setId(hijos);
    }

    public void quitarPierna(View view){

        try {
            hijos = pierna.size();
            Toast.makeText(getApplicationContext(), hijos+"",Toast.LENGTH_SHORT).show();
            if(hijos > 1){
                View linea = findViewById(hijos);
                parent = findViewById(R.id.parent);
                parent.removeView(linea);
                pierna.remove(hijos-1);
            }
        } catch(Exception ignored){}
    }

    public void calcular(View view){
        int hijos = pierna.size();

        for(int i = 0; i < hijos; i++){

        }
    }



//    public void onClick(View v){
//        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        parent = findViewById(R.id.parent);
//
//        View linea = inflater.inflate(R.layout.linea_pierna, parent, false);
//        parent.addView(linea);
//
//        switch (v.getId()) {
//
//            case R.id.btn_agregar_pierna:
////                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
////                parent = findViewById(R.id.parent);
////
////                View linea = inflater.inflate(R.layout.linea_pierna, parent, false);
////                parent.addView(linea);
//
//                hijos = pierna.size();
//                //Toast.makeText(getApplicationContext(), hijos+"",Toast.LENGTH_SHORT).show();
//                linea.setId(hijos+1);
//                Pierna leg = new Pierna(hijos+1);
//                pierna.add(leg);
//
//                Button boton = findViewById(R.id.btn_leg);
//                boton.setText(hijos+1+"");
//                boton.setId(hijos);
//                break;
//
//            case R.id.btn_remove_leg:
//                try {
//                    hijos = pierna.size();
//                    if(hijos > 1){
//                        //Toast.makeText(getApplicationContext(), hijos+"",Toast.LENGTH_SHORT).show();
////                        View linea = findViewById(hijos);
//                        parent = findViewById(R.id.parent);
//                        parent.removeView(linea);
//                        pierna.remove(hijos-1);
//                    }
//                } catch(Exception ignored){}
//                break;
//
//            case R.id.btn_calcular:
//                // do your code
//                break;
//
//            default:
//                break;
//        }
//    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Make sure to call the super method so that the states of our views are saved
        //Toast.makeText(getApplicationContext(), pierna.size()+"",Toast.LENGTH_SHORT).show();
        outState.putParcelableArrayList("pierna",pierna);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        savedInstanceState.getParcelableArrayList("pierna");
    }
}
