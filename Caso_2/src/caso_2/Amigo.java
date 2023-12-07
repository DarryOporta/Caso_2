package caso_2;
/**
 *
 * @author Darry OV
 */
public class Amigo {
    
    public String nombre;
    public double montDebe;
    public double montCobrar;

    public Amigo(String nombre) {
        this.nombre = nombre;
        this.montDebe = 0.0;
        this.montCobrar = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontDebe() {
        return montDebe;
    }

    public void setMontDebe(double montDebe) {
        this.montDebe = montDebe;
    }

    public double getMontCobrar() {
        return montCobrar;
    }

    public void setMontCobrar(double montCobrar) {
        this.montCobrar = montCobrar;
    }
    
    
}
