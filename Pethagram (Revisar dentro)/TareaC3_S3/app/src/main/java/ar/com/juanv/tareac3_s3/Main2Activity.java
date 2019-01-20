package ar.com.juanv.tareac3_s3;

import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Collection;


public class Main2Activity extends AppCompatActivity {


    ArrayList<Mascota> mascotas_favoritas;
    RecyclerView rv_mascotas_favoritas;

    @RequiresApi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        InicializarListaMascotasFavoritas();

        rv_mascotas_favoritas = (RecyclerView) findViewById(R.id.rv_mascotas_favoritas);
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas_favoritas,this);
        rv_mascotas_favoritas.setAdapter(adaptador);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_mascotas_favoritas.setLayoutManager(llm);



    }

    private void InicializarListaMascotasFavoritas() {

        mascotas_favoritas = new ArrayList<Mascota>();
        mascotas_favoritas.add(new Mascota("Flufi",R.drawable.dog_1,"5"));
        mascotas_favoritas.add(new Mascota("Drama",R.drawable.perro1,"8"));
        mascotas_favoritas.add(new Mascota("Da Vinci",R.drawable.dog_1,"2"));
        mascotas_favoritas.add(new Mascota("Love",R.drawable.perro1));
        mascotas_favoritas.add(new Mascota("Boy",R.drawable.dog_1,"7"));



    }


}
