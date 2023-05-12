import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Ingredientes{
	
	public static void main(String[] args) throws IOException {

		int tiempococcion=0;
		int calorias=0;
		
		
		List<String> paella = new ArrayList<String>();
		try {

			String ruta = "C:\\Users\\javiles\\";
			String nombreArchivo = "Comida1.txt";
			String rutaNombresArchivo = ruta + nombreArchivo;

			File archivo = new File(rutaNombresArchivo);
			BufferedReader lector = new BufferedReader(new FileReader(archivo));
			String linea = "";
			while ((linea = lector.readLine()) != null) {
				paella.add(linea);
				
			}
			lector.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String arroz = paella.get(0);
		paella.remove("Nombre de la receta: Paella");
		paella.remove("Ingredientes:");
		System.out.println("Los ingredientes de la paella son: ");
		int i = 1;
		for (String ingrediente : paella) {
			System.out.println(i + ". " + ingrediente);
			i++;
		}	
		calorias = calorias+(i-1)*3;
		tiempococcion= tiempococcion+i-1;
		System.out.println("El tiempo de coccion que necesita la paella son " +tiempococcion+ " minutos.");
		System.out.println("Las calorias de la receeta son " +calorias+ " calorias.");
		
		List<String> tortilla = new ArrayList<String>();
		try {

			String ruta = "C:\\Users\\javiles\\";
			String nombreArchivo = "Comida2.txt";
			String rutaNombresArchivo = ruta + nombreArchivo;

			File archivo = new File(rutaNombresArchivo);
			BufferedReader lector = new BufferedReader(new FileReader(archivo));
			String linea = "";
			while ((linea = lector.readLine()) != null) {
				tortilla.add(linea);
			}
			lector.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		String tort = tortilla.get(0);
		tortilla.remove("Nombre de la receta: Tortilla de patata");
		tortilla.remove("Ingredientes:");
		System.out.println("\n\nLos ingredientes de la tortilla de patatas son:");
		
		int j=1;
		
		for (String ingrediente : tortilla) {
			System.out.println(j + ". " + ingrediente);
			j++;
		}
		int calorias1=0;
		calorias1 = calorias1+(j-1)*3;
		System.out.println("Las calorias de la receeta son " +calorias1+ " calorias.");
		int tiempococcion1=0;
		tiempococcion1= tiempococcion1+j-1;
		System.out.println("El tiempo de coccion que necesita la tortilla de patatas son " +tiempococcion1+ " minutos.");
		
		String iniciocontenidoJenkinsFile = "pipeline {\n" +
				"    agent any\n" +
				"    stages {\n";
		String contenidoJenkinsFile = "";
		String FinalcontenidoJenkinsFile =  "    }\n" +
				"}";
		
		contenidoJenkinsFile ="        stage('"+arroz+"') {\n" +
				"            steps {\n" +
				"                script {\n" +
				"				    echo 'El tiempo de coccion de la paella son " + tiempococcion+" minutos'"+
				"\n                    echo 'Las calorias de la receta son: " +calorias+ " calorias'"+
				"\n                }\n" +
				"            }\n" +
				"        }\n"+
				"        stage('"+tort+"') {\n" +
				"            steps {\n" +
				"                script {\n" +
				"				    echo 'El tiempo de coccion de la torilla son " + tiempococcion1+" minutos'"+
				"\n                    echo 'Las calorias de la receta son " + calorias1+ " calorias'"+
				"\n                }\n" +
				"            }\n" +
				"        }\n";
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