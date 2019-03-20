package Pruebas;

public class Nodo<t>{
	
	private t value;
	public Nodo<t> next;
	
	public Nodo(t value) {
		this.value=value;
		next=null;
	}
	public t getValue() {
		return value;
	}
	public Nodo<t> getNext() {
		return next;
	}
	public void setNext(Nodo<t> next) {
		this.next=next;
	}
}

