	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.Scanner;
	import org.json.JSONObject;
	
	public class Tiempo {
		public static void main(String [] args)
		{	
			Barcelona();
			BuenosAires();
			Madrid();
			Berlin();
		}
		
		public static Object Barcelona() {
			float tempbarc;
			try {
				URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=41.39&longitude=2.16&hourly=temperature_2m&forecast_days=1");
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
					JSONObject tiempo = new JSONObject(informacion.toString());		
					tempbarc =tiempo.getJSONObject("hourly").getJSONArray("temperature_2m").getFloat(11);
					System.out.println("La temperatura en Barcelona a las 11:00 de la mañana es de " + tempbarc+ " ºC");
					
				if(tempbarc > 10) {
					System.out.println("RECOMENDACION: No te abrigues con algo pesado, no hace mucho frio\n");
				}else {
					System.out.println("ALERTA: Abrigate mucho, hace un frio que pela");
				}	
				}	
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public static Object BuenosAires() {
			
			float tempbaires;	
			try {
				URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=-34.61&longitude=-58.38&hourly=temperature_2m&current_weather=true&forecast_days=1");
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
					JSONObject tiempo = new JSONObject(informacion.toString());
					tempbaires = tiempo.getJSONObject("hourly").getJSONArray("temperature_2m").getFloat(11);
					System.out.println("La temperatura en Buenos Aires a las 11:00 de la mañana es de " + tempbaires+ " ºC");		
					if(tempbaires > 10) {
						System.out.println("RECOMENDACION: No te abrigues con algo pesado, no hace mucho frio\n");
					}else {
						System.out.println("ALERTA: Abrigate mucho, hace un frio que pela");
					}
				}	
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public static Object Madrid() {
			
			float tempmadrid;	
			try {
				URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&hourly=temperature_2m&current_weather=true&forecast_days=1");
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
					JSONObject tiempo = new JSONObject(informacion.toString());
					tempmadrid = tiempo.getJSONObject("hourly").getJSONArray("temperature_2m").getFloat(11);
					System.out.println("La temperatura en Madrid a las 11:00 de la mañana es de " + tempmadrid+ " ºC");		
					if(tempmadrid > 10) {
						System.out.println("RECOMENDACION: No te abrigues con algo pesado, no hace mucho frio\n");
					}else {
						System.out.println("ALERTA: Abrigate mucho, hace un frio que pela");
					}
				}	
			} catch (IOException e) {
				e.printStackTrace();
			}	
			return null;
		}
		
		public static Object Berlin() {
			
			float tempberlin;	
			try {
				URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m&current_weather=true&forecast_days=1");
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
					JSONObject tiempo = new JSONObject(informacion.toString());
					tempberlin = tiempo.getJSONObject("hourly").getJSONArray("temperature_2m").getFloat(11);
					System.out.println("La temperatura en Berlin a las 11:00 de la mañana es de " + tempberlin+ " ºC");		
					if(tempberlin > 10) {
						System.out.println("RECOMENDACION: No te abrigues con algo pesado, no hace mucho frio\n");
					}else {
						System.out.println("ALERTA: Abrigate mucho, hace un frio que pela");
					}
				}	
			} catch (IOException e) {
				e.printStackTrace();
			}	
			return null;
		}
	}
	
	
