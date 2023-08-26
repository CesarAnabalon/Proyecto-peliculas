package Clases;

import java.util.ArrayList;

public class Gestor{
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Pelicula> listaPeliculas;

    public Gestor()
    {
        listaClientes = new ArrayList();
        listaPeliculas = new ArrayList();
    }

    //getters
    public Cliente getListaClientes(short index){   
        return listaClientes.get(index);
    }

    public Pelicula getListaPeliculas(short index)
    {
        return listaPeliculas.get(index);
    }

    //setters

    public void setListaPeliculas(Pelicula pelicula)
    {
        listaPeliculas.add(pelicula);
    }

    public void setListaClientes(Cliente cliente)
    {
        listaClientes.add(cliente);
    }

}