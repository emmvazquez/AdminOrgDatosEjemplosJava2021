import java.io.File;
import java.io.IOException;

public class CrearArchivo {

	public CrearArchivo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File nombre = new File("archivoEjemplo3.txt");

		if(nombre.createNewFile()) {			
			System.out.print("Archivo creado");
		}
		else {
			System.out.print("error");
		}

	}

}
