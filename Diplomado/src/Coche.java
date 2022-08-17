
/**
 *
 * @Luiss Montoya
 */
public class Coche {

    private String color;
    private int velocidad;
    private float tamaño;

    public Coche(String color, int velocidad, float tamaño) {
        this.color = color;
        this.velocidad = velocidad;
        this.tamaño = tamaño;
    }

    public void avanzar() {
    }

    public void parar() {
    }

    public void girarIzquierda() {
    }

    public void girarDerecha() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", velocidad=" + velocidad + ", tama\u00f1o=" + tamaño + '}';
    }

   public static void main(String[] args) {
        Coche coche = new Coche("verde", 80, 3.2f);
        Coche coche2 = new Coche("Rojo", 120, 4.1f);
        
        System.out.println(coche);
    }
    
    
}
