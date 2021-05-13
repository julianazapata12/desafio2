package dominio;

public class Vendedor extends Directo {
    private long ventasDelMes;
    private long calcularComision;


    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;

    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision(){
        long Comision = super.getSalario();
        if (super.getSalario()<999999){
            Comision = (long)( Comision + Comision * 0.45);
        }
        return Comision;
    }
}
