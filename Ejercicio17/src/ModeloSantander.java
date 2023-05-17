import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ModeloSantander{
	
	private String nombre_usuario;
	private String nombre;
	private String apellido;
	private String ciudad;
	private String correo;
	private double salario;
	private LocalDate fecha_nacimiento;
	private String contrasenia;
	private List<ProductoSantander> producto = new ArrayList<>();

	public ModeloSantander(String nombre, String apellido, String ciudad, String correo, double salario,
			LocalDate nacimiento, String contrasenia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.correo = correo;
		this.salario = salario;
		this.fecha_nacimiento = nacimiento;
		this.contrasenia = contrasenia;
		this.producto.add(new ProductoSantander());
	}
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public List<ProductoSantander> getProducto() {
		return producto;
	}

	public void setProducto(List<ProductoSantander> producto) {
		this.producto = producto;
	}
}