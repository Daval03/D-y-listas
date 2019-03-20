package Pruebas;

public class Lista<t>{
	
	private Nodo<t> first;
	public int tamaño;
	
	public Lista() {
		this.first=null;
		tamaño=0;
	}
	public void addlist(t e) {
		if (first==null) {
			first=new Nodo<t>(e);
			tamaño++;
		}else {
			Nodo<t> temp=first;
			while (temp.getNext()!=null) {
				temp=temp.getNext();
				}
			tamaño++;
			temp.next=new Nodo<t>(e);
		}
	}
	public void addfirst(t e) {
		Nodo<t> n=new Nodo<t>(e);
		n.next=first;
		first=n;
	}
	public void printL() {
		Nodo<t> res = first;	
		while (res!=null) {
			System.out.print(res.getValue()+"\n");
			res = res.getNext();
		}
	}
	public boolean Buscar_dato(String dato) {
		Nodo<t> temp=first;
		int cont=0;
		
		while (cont<tamaño) {
			if (temp.getValue()== dato){
				return true;
			}else {
				cont++;
				temp=temp.next;
			}
		}
		return false;
	}
	public t SacarPosicion(int referencia) {
		int cont=0;
		Nodo<t> temp=first;
		while (cont<tamaño) {
			if (cont==referencia) {
				return temp.getValue();
			}else {
				cont++;
				temp=temp.next;
			}
		}
		return (t) "No esta el dato";
	}
}
