package ar.com.juanv.tareac3_s3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    ArrayList<Mascota> mascotas;
    private RecyclerView mascotas_lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);


        mascotas_lista = (RecyclerView) findViewById(R.id.rv_mascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);


        /*GridLayoutManager glm = new GridLayoutManager(this, 2);*/
        mascotas_lista.setLayoutManager(llm);

        InicializarListaMascotas();
        InicializarAdaptador();





    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_search_favorites:
                Intent intent = new Intent(this,Main2Activity.class);

                this.startActivity(intent);

                break;

            case R.id.settings_menu:

                break;

        }

        return super.onOptionsItemSelected(item);
    }

    public void IniciaIntent(){

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);



    }

    public void InicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        mascotas_lista.setAdapter(adaptador);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_star,menu);
        return true;
    }

    public void InicializarListaMascotas() {

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Flufi",R.drawable.dog_1,"5"));
        mascotas.add(new Mascota("Drama",R.drawable.perro1,"8"));
        mascotas.add(new Mascota("Da Vinci",R.drawable.dog_1,"2"));
        mascotas.add(new Mascota("Love",R.drawable.perro1));
        mascotas.add(new Mascota("Boy",R.drawable.dog_1,"7"));
        mascotas.add(new Mascota("Fama",R.drawable.perro1,"10"));



    }
}
