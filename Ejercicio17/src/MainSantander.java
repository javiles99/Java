import java.util.List;
import java.util.ArrayList;


public class MainSantander {
	
	public static void main(String [] args)
	{
		
		VistaSantander vista = new VistaSantander();
		ControladorSantander controlador = new ControladorSantander(vista);
		List<ModeloSantander> lista =new ArrayList<>();
		controlador.mostrarpanel(lista);
	}
}
