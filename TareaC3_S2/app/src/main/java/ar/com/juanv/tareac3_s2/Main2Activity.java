package ar.com.juanv.tareac3_s2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv_nombre, tv_telefono, tv_fnac, tv_email, tv_descripcion;
    Button editar_datos;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            Bundle parametros = getIntent().getExtras();
            String nombre = parametros.getString("Nombre");
            String fecha_nacimiento = parametros.getString("Fecha Nacimiento");
            String telefono = parametros.getString("Telefono");
            String email = parametros.getString("Email");
            String descripcion = parametros.getString("Descripcion");

            tv_nombre = (TextView) findViewById(R.id.rec_nombre);
            tv_telefono = (TextView) findViewById(R.id.rec_telefono);
            tv_fnac = (TextView) findViewById(R.id.rec_fecha_nac);
            tv_email = (TextView) findViewById(R.id.rec_email);
            tv_descripcion = (TextView) findViewById(R.id.rec_descripcion);
            editar_datos = (Button) findViewById(R.id.editar_datos);

            tv_nombre.setText(nombre);
            tv_telefono.setText(telefono);
            tv_fnac.setText(fecha_nacimiento);
            tv_email.setText(email);
            tv_descripcion.setText(descripcion);

            editar_datos = (Button) findViewById(R.id.editar_datos);
            editar_datos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    onBackPressed();


                }
            });








    }
}
