
package com.example.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);

        //captura el valor de la tabla
        tabla = findViewById(R.id.tabla);

        //comunica con el metodo
        personas= Datos.obtener();


        for(int i = 0; i<personas.size(); i++){

            //crea el objeto fila
            TableRow fila = new TableRow(this);

            //crea el objeto por cada columna
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            //En la primera columna se llena con un autoincremantal
            c1.setText(""+(i+1));
            //Las demás columnas se llena con la cedula, nombre y apellido de la persona.
            c2.setText(personas.get(i).getCedula());
            c3.setText(personas.get(i).getNombre());
            c4.setText(personas.get(i).getApellido());

            //se pasan las columnas a la filas
            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            //se pasa la fila a la tabla
            tabla.addView(fila);
        }


    }
}
