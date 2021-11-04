import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author Endika Ciordia- 
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;

    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        Alto = 40cm;
        Ancho = 30cm;
        Largo = 50cm;
        Peso = 8kg;
         

    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        Alto = cm;
        Ancho = cm;
        Largo = cm.
        Peso = [2-8];
       Generador = NewGenerador;
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        Alto = 50cm;
        Ancho = 50cm;
        Largo = 70cm;
        Peso = 13kg;

    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double calcularVolumen() {
       V= alto * ancho * largo;
       return 600.000cm3;

    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double calcularPesoVolumetrico() {
        600.000/5000;
       return 1.2kg;

    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        6000.000/1.2;
       return 5000;

    }


    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete obtenerCopia() {
        
       return copias;

    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        Alto,Ancho,Largo; 
       return 3;

    }
    
    // /**
     // * Muestra en pantalla el objeto actual
     // * Este método se incluye como método de prueba
     // * de la clase Paquete
     // */
    // public void print() {
        // System.out.println(this.toString());
    // }

    

// }
