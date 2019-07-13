package com.example.personas;

import android.app.Person;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CrearPersonas extends AppCompatActivity {
    // declara las variables
    private EditText cedula, nombre, apellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);

        //captura los valores de la interfaz
        cedula = findViewById(R.id.txtCedula);
        nombre = findViewById(R.id.txtNombre);
        apellido = findViewById(R.id.txtApellido);
    }

    //guardar los datos
    public void guardar(View v0){

        String nom,apell,ced;
        Persona p;
        ced = cedula.getText().toString();
        nom = nombre.getText().toString();
        apell = apellido.getText().toString();

        p = new Persona(ced,nom,apell);
        p.guardar();
    }

    public void limpiar(View v){

        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        cedula.requestFocus();
    }


}
