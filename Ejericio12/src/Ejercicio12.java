import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio12 extends Poblacion implements Poblacion_Final {
	
	public Ejercicio12(String ciudad, int poblacionciudad) {
		
		this.Ciudad = ciudad;
		this.PoblacionCiudad = poblacionciudad;
	}

	public double calcularPoblacion(double poblacionfinal) {
		poblacionfinal = PoblacionCiudad *0.8;
		return poblacionfinal;
	}
	
	public static void main(String[] args)
	{
		Ejercicio12[] poblacion = new Ejercicio12[5];
		poblacion[0] = new Ejercicio12("'Barcelona'", 100000);
		poblacion[1] = new Ejercicio12("'Madrid'", 1000000);
		poblacion[2] = new Ejercicio12("'Malaga'", 50000);
		poblacion[3] = new Ejercicio12("'Sevilla'", 80000);
		poblacion[4] = new Ejercicio12("'Murcia'",40000);
		
		String iniciocontenidoJenkinsFile = "pipeline {\n" +
											"    agent any\n" +
											"    stages {\n";
		String contenidoJenkinsFile = "";
		String FinalcontenidoJenkinsFile =  "    }\n" +
											"}";
		
		int i=0;
		while(i<poblacion.length) {
		contenidoJenkinsFile +="        stage("+poblacion[i].Ciudad+") {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "				    echo 'La poblacion parcial de la ciudad es: '" + poblacion[i].PoblacionCiudad+
                        "\n                    echo 'Por lo tanto la poblacion final es: '" + poblacion[i].calcularPoblacion(i)+
                        "\n                }\n" +
                        "            }\n" +
                        "        }\n";
                       	i++;				  	
		}
		String TotalcontenidoJenkinsFile = iniciocontenidoJenkinsFile + contenidoJenkinsFile +FinalcontenidoJenkinsFile;
		try (
			PrintWriter writer = new PrintWriter(new FileWriter("Jenkinsfile")))
		{
			writer.write(TotalcontenidoJenkinsFile);
			System.out.println("Se genero el Jenkinsfile");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}