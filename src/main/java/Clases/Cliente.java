package Clases;
import java.util.ArrayList;

public class Cliente {
    private String nombreUsuario;
    private double saldo;
    private ArrayList<Pelicula> historialPeliculas;
    private ArrayList<Pelicula> peliculasEnPosesion;

    public Cliente(String nombreUsuario, double saldo) {
        this.nombreUsuario = nombreUsuario;
        this.saldo = saldo;
        historialPeliculas = new ArrayList();


    }

    //getter
    public String getNombreUsuario()
    {
        return nombreUsuario;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public Pelicula getHistorialPelicula(short index) {
        return historialPeliculas.get(index);
    }

    public Pelicula getPeliculasenPosesion(short index)
    {
        return peliculasEnPosesion.get(index);
    }

    //setter
    public void setNombreUsuario(String nombre){
        nombreUsuario = nombre;
    }

    public void setSaldo(int monto)
    {
        saldo += monto;
    }

}