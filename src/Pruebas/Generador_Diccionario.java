package Pruebas;
import java.io.*;

import java.util.Scanner;
public class Generador_Diccionario {
	
	Lista<String> Datos = new Lista<String>();
	
	public void listaDiccionario() {
		Scanner sc = new Scanner(System.in);
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    String palabra;
	    
		try {
			archivo = new File("C:\\Users\\Aldo Cambronero\\Desktop\\xd.txt");
			fr= new FileReader(archivo);
			br =  new BufferedReader(fr);
			String linea;

			while ((linea=br.readLine())!=null) {
				palabra=br.readLine();
				System.out.print(palabra= sc.nextLine());
				
				//Datos.addlist(palabra);
			}
		}catch(Exception e){
	         e.printStackTrace();
	    }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception num2){ 
	            num2.printStackTrace();
	         }
	      }
	}
	public void HL() {
		try {
            Scanner input = new Scanner(new File("C:\\Users\\Aldo Cambronero\\Desktop\\xd.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine().toString();
                line=method(line);
                Datos.addlist(line);  
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	public void XD() throws FileNotFoundException{
		Scanner reader = new Scanner(new File("C:\\Users\\Aldo Cambronero\\Desktop\\xd.txt"));
		while (reader.hasNext()){
			String str = reader.next();
			str= method(str);
			Datos.addlist(str);
		}
	}
	public String method(String str) {
	    if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
	        str = str.substring(0, str.length() - 1);
	    }
	    return str;
	}
}
