package ar.com.juanv.tareac3_s3;

public class Mascota {

    private String nombre;
    private int foto;
    private String likes_base;


    public Mascota(String nombre, int foto){

        this.nombre = nombre;
        this.foto = foto;
        this.likes_base = "0";



    }


    public Mascota(String nombre, int foto, String likes_base){

        this.nombre = nombre;
        this.foto = foto;
        this.likes_base = likes_base;



    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getLikes_base() {
        return likes_base;
    }

    public void setLikes_base(String likes_base) {
        this.likes_base = likes_base;
    }
}
