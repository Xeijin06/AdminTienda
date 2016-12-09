package com.xeijin.admintienda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroScreen extends AppCompatActivity {

    Button btnSesion;
    Button btnRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_screen);

        initInstance();
    }

    private void initInstance() {
        btnSesion = (Button) findViewById(R.id.btn_intro_sesion);
        btnRegistrar = (Button) findViewById(R.id.btn_intro_registrar);

        //Una vez terminada la inicialización de los objetos, se procede a establecer los eventos de lo contrario dará un error de NullPointer
        assign();
    }

    private void assign() {
        //Evento click de Sesión
        btnSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLogin = new Intent(IntroScreen.this, LoginScreen.class);
                startActivity(toLogin);
            }
        });

        //Evento click de registrar
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRegister = new Intent(IntroScreen.this, LoginScreen.class);
                startActivity(toRegister);
            }
        });
    }
}
