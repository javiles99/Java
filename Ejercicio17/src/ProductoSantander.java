import java.time.LocalDate;

public class ProductoSantander {

	private String numeroTarjeta;
	private LocalDate fechaVencimiento;
	
	public ProductoSantander() {
		this.numeroTarjeta = "ES-" + Math.random() * 10000000;
		this.fechaVencimiento = LocalDate.now().plusYears(5);
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
}
