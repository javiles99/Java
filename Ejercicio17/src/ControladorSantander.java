import java.util.List;

public class ControladorSantander 
	{
	private VistaSantander vista;
	
	public ControladorSantander(VistaSantander vista)
	{
		this.vista = vista;
	}
	public void mostrarpanel(List<ModeloSantander> lista)
	{
		vista.Principal(lista);
	}	
}