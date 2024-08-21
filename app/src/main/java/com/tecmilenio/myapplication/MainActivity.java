package com.tecmilenio.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etEscuela;
    private EditText etCarrera;
    private EditText etMateria;
    private Button borrar;
    private Button guardar;
    private TextView txtFront;
    private TextView tvGuardaDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNombre = (EditText) findViewById(R.id.etNombre);
        etEscuela = (EditText) findViewById(R.id.etEscuela);
        etCarrera = (EditText) findViewById(R.id.etCarrera);
        etMateria = (EditText) findViewById(R.id.etMateria);
        borrar = (Button) findViewById(R.id.borrar);
        guardar = (Button) findViewById(R.id.guardar);
        txtFront = (TextView) findViewById(R.id.textView);
        tvGuardaDatos = (TextView) findViewById(R.id.tvGuardaDatos);


        guardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String nombre = etNombre.getText().toString();
                String escuela = etEscuela.getText().toString();
                String carrera = etCarrera.getText().toString();
                String materia = etMateria.getText().toString();

                Logger.getLogger("El nombre es:"+ nombre );
                Logger.getLogger("La escuela es:"+ escuela );
                Logger.getLogger("La carrera es:"+ carrera );
                Logger.getLogger("La materia es:"+ materia );

                tvGuardaDatos.setVisibility(View.VISIBLE);

                System.out.println("");
                txtFront.setText("Nuetras Alma mater "+ escuela +" le da la más cordial bienvenido colega " +nombre+
                        " correspondiente a la carrera de "+carrera+" en la materia de " +materia);
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNombre.setText("");
                etEscuela.setText("");
                etCarrera.setText("");
                etMateria.setText("");
                txtFront.setText("");
            }
        });
    }


}