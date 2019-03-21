package Pruebas;
import java.io.*;

public class Generador_Diccionario {
	
	Lista<String> Datos = new Lista<String>();
	
	public void Generador_lista_Diccionario() {
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
		try {
			archivo = new File("C:\\Users\\Aldo Cambronero\\Desktop\\xd.txt");//cambiar segun donde se emplee
			fr= new FileReader(archivo);
			br =  new BufferedReader(fr);
			String linea;
			while ((linea=br.readLine())!=null) {
				linea= eliminador_basura_palabra(linea);//me elimina trash values, para que entre limpio
				Datos.addlist(linea.toLowerCase());//para que se meta a la lista como en minuscula
			}//En mi compu dura como 2 mint
		}catch(Exception e){
	         e.printStackTrace();
	    }finally{
	         try{                    
	            if( null != fr ){//para que el txt siempre se cierre   
	               fr.close();     
	            }                  
	         }catch (Exception num2){ 
	            num2.printStackTrace();
	         }
	      }
	}
	
	public String eliminador_basura_palabra(String str) {
	    if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
	        str = str.substring(0, str.length() - 1);
	    }
	    return str;
	}
}
