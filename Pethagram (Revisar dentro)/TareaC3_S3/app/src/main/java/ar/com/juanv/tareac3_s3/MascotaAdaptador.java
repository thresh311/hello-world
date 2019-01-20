package ar.com.juanv.tareac3_s3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;




    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity) {

        this.mascotas = mascotas;
        this.activity = activity;
    }




    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder mascotaViewHolder, int position) {

        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.img_mascotaCV.setImageResource(mascota.getFoto());
        mascotaViewHolder.nombre_mascotaCV.setText(mascota.getNombre());
        mascotaViewHolder.likesCV.setText(mascota.getLikes_base());
        mascotaViewHolder.img_mascotaCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Intent intent = new Intent(activity,Main2Activity.class);
                activity.startActivity(intent);*/

            }

        });

        mascotaViewHolder.imgbtn_likeCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int likes_actuales = Integer.parseInt(mascota.getLikes_base().toString());
                likes_actuales = likes_actuales+1;
                String suma_hecha = Integer.toString(likes_actuales);
                mascotaViewHolder.likesCV.setText(suma_hecha);

            }
        });


    }



    @Override
    public int getItemCount() {
        return mascotas.size();
    }




    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_mascotaCV;
        private TextView nombre_mascotaCV;
        private TextView likesCV;
        private ImageButton imgbtn_likeCV;







        public MascotaViewHolder(@NonNull View itemView) {

            super(itemView);


            img_mascotaCV = (ImageView) itemView.findViewById(R.id.imgMascota);
            nombre_mascotaCV = (TextView) itemView.findViewById(R.id.tv_Nombre);
            likesCV = (TextView) itemView.findViewById(R.id.likes);
            imgbtn_likeCV = (ImageButton) itemView.findViewById(R.id.btnimg_like_hueso);



        }
    }

}
