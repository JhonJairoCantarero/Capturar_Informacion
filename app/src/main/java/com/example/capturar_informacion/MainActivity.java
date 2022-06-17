package com.example.capturar_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre,txtApellido,txtEdad,txtCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtnombre);
        txtApellido = (EditText) findViewById(R.id.txtapellido);
        txtEdad = (EditText) findViewById(R.id.txtedad);
        txtCorreo = (EditText) findViewById(R.id.txtcorreo);


    }
    //METODO PARA EL BOTON ENVIAR
    public void Enviar(View view){
        Intent i = new Intent(this,Informacion.class);
        i.putExtra("dato", txtNombre.getText().toString());
        i.putExtra("dato2", txtApellido.getText().toString());
        i.putExtra("dato3", txtEdad.getText().toString());
        i.putExtra("dato4", txtCorreo.getText().toString());
        startActivity(i);
    }

    }