package caso_2;

/**
 *
 * @author Darry OV
 */
public class Movimiento {

    private String descripcion;
    private Amigo[] participantes;
    private Amigo quienPago;
    private double montoTotal;
    private String moneda;

    public Movimiento(String descripcion, Amigo[] participantes, Amigo quienPago, int montoTotal, String moneda) {
        this.descripcion = descripcion;
        this.participantes = participantes;
        this.quienPago = quienPago;
        this.montoTotal = montoTotal;
        this.moneda = moneda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Amigo[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Amigo[] participantes) {
        this.participantes = participantes;
    }

    public Amigo getQuienPago() {
        return quienPago;
    }

    public void setQuienPago(Amigo quienPago) {
        this.quienPago = quienPago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    

}
