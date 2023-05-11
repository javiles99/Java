import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Spotify extends DatosArtistas implements RecaudacionyProyeccion{
	
	public double RecaudacionMonetaria() {
		double recaudacionmonetaria = CantidadReproducciones * 0.02;
		return recaudacionmonetaria;
	}
	public double ProyeccionFinal() {
		double proyeccionfinal = CantidadReproducciones * 12;
		return proyeccionfinal;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cuantos artistas deseas introducir(Minimo 3 artistas): ");
		int artistas = sc.nextInt();
		
		String contenido ="";
		int i;
		int j;	
		Spotify[] datosartista = new Spotify[artistas];
		
		for(j=0;j < artistas;j++) {
			datosartista[j] = new Spotify();
		}
		
		for(i=0;i < artistas;i++) {

			System.out.println("Artista nummero "+i);
			System.out.println("El nombre del artista es: ");
			datosartista[i].NombreArtista = sc.next();
			System.out.println("El genero del artista es: ");
			datosartista[i].Genero = sc.next();
			System.out.println("La cantidad de reproducciones que ha conseguido el artista ha sido de(Expresalo en millones): ");
			datosartista[i].CantidadReproducciones= sc.nextDouble();
			System.out.println("El pais donde ha sido mas escuchado el artista es: ");
			datosartista[i].Pais= sc.next();
			
			contenido += "\nArtista numero " + i
				    + "\n\tEl nombre del artista es: " + datosartista[i].NombreArtista
				    + "\n\tEl genero del artista es: " + datosartista[i].Genero 
				    + "\n\tLa cantidad de reproducciones que ha conseguido el artista ha sido de: " + datosartista[i].CantidadReproducciones+ " Millones"
				    + "\n\tEl pais donde ha sido mas escuchado el artista es: "+ datosartista[i].Pais
				    + "\n\tLa recaudacion monetaria es de " + datosartista[i].RecaudacionMonetaria()+ " Millones de euros"
				    + "\n\tLa proyeccion final es de " + datosartista[i].ProyeccionFinal()+" Millones de euros\n";
		
			try {
				String ruta = "C:\\Users\\javiles\\eclipse-workspace\\Ejercicio14\\";
				String nombreArchivo = "Artistas_Spotify.txt";
				String nombre = ruta+nombreArchivo;
				File archivo = new File(nombre); 
		
				if (! archivo.exists()) 
				{
					archivo.createNewFile();
					System.out.println("El archivo ha sido creado con exito");
				}
		
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(contenido);
				bw.close();
				}
		

			catch (IOException e) 
			{
				e.printStackTrace();
			}		
		}	
	}
}

