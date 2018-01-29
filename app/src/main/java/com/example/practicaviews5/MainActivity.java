package com.example.practicaviews5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView android,confirmacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = (TextView)findViewById(R.id.textoandroid);
        confirmacion = (TextView)findViewById(R.id.textocomprobar);






    }

    public void bajoandroid(View view){

        android.setText("android");

    }

    public  void confirmacionmastexto(View view){

       String Confirmaciondefinitiva = android.getText().toString();
        confirmacion.setText("has seleccionado "+Confirmaciondefinitiva);
    }









}//fin

