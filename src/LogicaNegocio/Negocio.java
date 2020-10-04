package LogicaNegocio;

import java.io.FileNotFoundException;
import java.io.IOException;

import AccesoDatos.Datos;

public class Negocio {
	Datos datos;
	Double iMC;
	public Negocio() {
		
	}
	
	public void RecogerDatos(String nombre) throws FileNotFoundException, IOException {
		datos=new Datos();
		datos.consultaFichero(nombre);
		
	}
	
	public double comprobarIMC() {
		iMC=Double.valueOf(datos.getpeso().get(0))/(Double.valueOf(datos.getaltura().get(0))/100);
		return iMC;
	}

}
