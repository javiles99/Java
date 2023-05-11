import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class Pokemon
{
	
	public static void main(String [] args)
	{
		try 
		{
		URL url = new URL("https://pokeapi.co/api/v2/pokemon/dialga");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect(); //Establece la conexion.
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
			System.out.println(informacion);
			JSONObject data = new JSONObject(informacion.toString());
						
			System.out.println("El peso del pokemon es: " + data.get("weight"));
			System.out.println("El nombre del pokemon es: " + data.get("forms"));
			System.out.println("El pokemon es de tipo: " + data.get("types"));
		}
		}
	
	catch (IOException e) 
	{
		e.printStackTrace();
	}
	}
}
