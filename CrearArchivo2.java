
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo2 {

	public CrearArchivo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter archivo;
		archivo = new FileWriter("NombreArchivo");
		BufferedWriter archTemp = null;
		archTemp = new BufferedWriter(archivo);
		try (PrintWriter wrArchTemp = new PrintWriter(archTemp)){
			wrArchTemp.print("Hola esta es una prueba");
			wrArchTemp.close();
		}
		archTemp.close();
		archivo.close();
	}
}
