package com.calificacionnotasprgomovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Editext;
    Button Boton;
    TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Editext = (EditText)findViewById(R.id.editext);
        resul = (TextView)findViewById(R.id.resultado);
        Boton = (Button)findViewById(R.id.btn);
        Boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int numero = Integer.parseInt(Editext.getText().toString());

        if(numero < 70) {
            resul.setText("F");
        }else if(numero >=70 && numero<80){
            resul.setText("C");
        }else if(numero >=80 && numero<90){
            resul.setText("B");
        }else if(numero >=90){
            resul.setText("A");
        }
    }
}