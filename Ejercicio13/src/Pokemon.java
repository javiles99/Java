import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.json.JSONObject;

public class Pokemon
{
	
	public static void main(String [] args)
	{
		try 
		{
			
		
		URL url = new URL("https://pokeapi.co/api/v2/pokemon/mew");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect();
		int tiempoDeRespuesta = con.getResponseCode();
		if (tiempoDeRespuesta != 200)
		{
			throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);			
		}
		else
		{
			StringBuilder informacion = new StringBuilder();
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext())
			{
				informacion.append(sc.nextLine());
			}
			sc.close();
			
			JSONObject data = new JSONObject(informacion.toString());
			String type = data.getJSONArray("types").getJSONObject(0).getJSONObject("type").get("name").toString();
		
			String ruta = "C:\\Users\\javiles\\eclipse-workspace\\Ejercicio13\\";
			String nombreArchivo = "Pokemon.txt";
			String nombre = ruta+nombreArchivo;
			
			File archivo = new File(nombre); 
		
			if (! archivo.exists()) 
			{
				archivo.createNewFile();
				
			}
			
			FileWriter fw = new FileWriter(archivo,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("El nombre del pokemon es: " + data.remove("name")+"\nEl peso del pokemon es: " + data.get("weight")+ "\nEl pokemon es de tipo: " + type);
			bw.close();
		}
		}
	
	catch (IOException e) 
	{
		e.printStackTrace();
	}
	}
}
