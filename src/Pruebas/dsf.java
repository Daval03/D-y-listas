package Pruebas;
import java.io.*;

public class dsf {
	public static void main(String [] arg) throws FileNotFoundException {
		Generador_Diccionario ejem = new Generador_Diccionario();
		
		ejem.XD();
		//String a="hola";
		//System.out.print(ejem.method(a));
		//ejem.HL();//se meten el txt a la lista
		
		//System.out.print(ejem.Datos.Buscar_dato("hola"));
		
		//ejem.listaDiccionario();//meto el txt en la lista
		
		//System.out.print(ejem.Datos.tamaño);
		//Lista<String> xd= new Lista<String>();
		//xd.addlist("hola");
		//xd.addlist("je");
		//System.out.print(xd.Buscar_dato("hola"));
		
		//ejem.Datos.addfirst("holla");
		//ejem.Datos.printL();
		
		System.out.print(ejem.Datos.Buscar_dato("mundo"));
	}
}
