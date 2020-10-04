package AccesoDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Datos {

	List<String> altura;
	List<String> peso;
	
	
	public Datos() {
		altura=  new ArrayList<String>();
		peso=new ArrayList<String>();
	}
	
	public void consultaFichero(String nombre) throws FileNotFoundException, IOException {
        String linea;
        File fichero = new File("C:\\Users\\serzu\\eclipse-workspace\\Ejercicio2 Capa\\DatosPersonales.txt");

        BufferedReader lector = new BufferedReader(new FileReader(fichero));

        while ((linea = lector.readLine()) != null) {
            if (linea.contains(nombre)) {
            	descomponerPeso(linea);
            	descomponerAltura(linea);
            }
        }
    }

    public void descomponerPeso(String linea) {
        String[] arrayPeso = linea.split("-");
        peso.add(arrayPeso[1]);
        
    }
    
    public void descomponerAltura(String linea) {
        String[] arrayAltura= linea.split("-");
        altura.add(arrayAltura[2]);
    }

    public List<String> getaltura() {
        return altura;
    }
    
    public List<String> getpeso() {
        return peso;
    }
}
