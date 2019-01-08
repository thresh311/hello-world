package ar.com.juanv.tareac3_s2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button sfecha, toActivity2;
    EditText nombre, fnacimiento,telefono,email,descripcion;
    DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sfecha = (Button) findViewById(R.id.bselect);
        toActivity2 = (Button) findViewById(R.id.bsiguiente);
        nombre = (EditText) findViewById(R.id.etnombre);
        fnacimiento = (EditText) findViewById(R.id.etfecha_nacimiento);
        telefono = (EditText) findViewById(R.id.ettelefono);
        email = (EditText) findViewById(R.id.etemail);
        descripcion = (EditText) findViewById(R.id.etdescripcion);


        toActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                intent1.putExtra("Nombre",nombre.getText().toString());
                intent1.putExtra("Fecha Nacimiento",fnacimiento.getText().toString());
                intent1.putExtra("Telefono",telefono.getText().toString());
                intent1.putExtra("Email",email.getText().toString());
                intent1.putExtra("Descripcion",descripcion.getText().toString());
                startActivity(intent1);


                }
        });

        sfecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();


            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month+1;
                String fechafinal = dayOfMonth+"/"+month+"/"+year;
                fnacimiento.setText(fechafinal);

            }
        };
    }
}
