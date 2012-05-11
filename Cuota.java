import java.util.Date;
public class Cuota {
	public double pagoMensual;
	public boolean pagada;
	public Date fechaPago;
	
	public Cuota(double pago){
		pagada = false;
		pagoMensual = pago;	
	}
}