package Clases;
public class Pelicula {
    private String titulo;
    private String generos[];
    private int year;
    private int existencias;
    private int precioArriendo;
    private String sinopsis;
    private float rating;
    

    public Pelicula(String titulo, int year, int existencias, int precioArriendo, String sinopsis, float rating){
        this.titulo = titulo;
        this.year = year;
        this.existencias = existencias;
        this.precioArriendo = precioArriendo;
        this.rating = rating;
        this.sinopsis = sinopsis;
        generos = new String[5];
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setNombrePelicula(String nombre){
      this.titulo = nombre;
    }
  public String getGeneros(int index) {
      int i;
      for(i = 0; i< generos.length ;i++){
        if(i == index){
        return generos[i];
        }
      }        
     return "Indice fuera de rango";
  }  

  public int getExistencias(){
    return existencias;
  }

  public void setExistencias(int existencias){
    this.existencias = existencias;
  }
  
  public int getYear(){
    return year;
  }

  public void setYear(int year){
    this.year = year;
  }

  public int getPrecioArriendo(){
    return precioArriendo;
  }

  public void setPrecioArriendo(int precioArriendo){
    this.precioArriendo = precioArriendo;
  }

  public String getSinopsis(){
    return sinopsis;
  }

  public void setSinopsis(String sinopsis){
    this.sinopsis = sinopsis;
  }

  public float getRating(){
    return rating;
  }
  public void setRating(float rating){
    this.rating = rating;
  }


}