package Presentación;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import LogicaNegocio.Negocio;

public class Presentacion {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String nombre;
		Scanner tecladoScanner=new Scanner(System.in);
		Negocio negocio=new Negocio();
		
		
		System.out.println("Dime el nombre de la persona: ");
		nombre=tecladoScanner.nextLine();
		
		negocio.RecogerDatos(nombre);
		
		System.out.println("Su masa corporal es: " + negocio.comprobarIMC());

	}

}
