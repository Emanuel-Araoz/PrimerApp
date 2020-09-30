package com.example.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private EditText cui;
    private EditText correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Bienvenido", Toast.LENGTH_LONG).show();

        nombre=(EditText) findViewById(R.id.NombreEdit);
        apellido=(EditText) findViewById(R.id.ApellidosEdit);
        cui=(EditText) findViewById(R.id.CuiEdit);
        correo=(EditText) findViewById(R.id.CorreoEdit);
    }

    public void Registro(View view){
        nombre.setText("");
        apellido.setText("");
        cui.setText("");
        correo.setText("");
        Toast.makeText(this,"El alumno ha sido registrado", Toast.LENGTH_LONG).show();
    }
}