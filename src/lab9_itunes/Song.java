package lab9_itunes;


public class Song {
    private int codigo;
    private String nombre;
    private double precio;
    private int sumaEstrellas =0;
    private int cantidadReviews =0;
    
    public Song(int codigo, String nombre, double precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void addStars(int stars){
        if (stars >= 0 && stars <= 5) {
            sumaEstrellas += stars;
            cantidadReviews++;
        }
    }
    
    public double songRating(){
        if (cantidadReviews == 0) {
            return 0.0;
        }
        return(double) sumaEstrellas/cantidadReviews;
    }
    
    public void print(){
        
    }
    
}
