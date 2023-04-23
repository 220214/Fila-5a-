package br.mari.FilaString;

	public class Fila {
	No inicio;
	No fim;
	public Fila() {
		inicio =null;
		fim =null;
		
	}
	public boolean isEmpty() {
		if (inicio==null && fim ==null) {
			return true;
		}else {
			return false;
		}
	}
	public void insert (String valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = null;
		if(isEmpty()) {
			inicio =elemento;
			fim = inicio;
		}else if(inicio ==fim && inicio !=null) {
			fim = elemento;
			inicio.proximo = fim;
		}else {
			fim.proximo = elemento;
			fim=elemento;
		}
	}
	public String remove()throws Exception{
		if (isEmpty()) {
			throw new Exception("Fila vazia");
		}
		No auxiliar= inicio;
		if( inicio==fim && inicio!=null) {
			inicio = null;
			fim=null;
		}else {
			inicio =inicio.proximo;
		}
		System.out.println(" Removido: " + auxiliar.toString());
		System.out.println("Novo valor Inicial: " + inicio.dado);
		return auxiliar.dado;
	}
	
	public void list()throws Exception {
		if(isEmpty()){
			throw new Exception("Fila vazia");
		}
		No auxiliar= inicio;
		System.out.println("=======Inicio da Fila========");
		while(auxiliar!=null) {
			
			System.out.println(auxiliar.toString()+ "===>");
			auxiliar=auxiliar.proximo;
		
		}
		System.out.println("Null");
		System.out.println("  ");
		System.out.println("=======Fim da Fila========");
	}
	
	public int size() {
		int cont =0;
		if(isEmpty()){
			No auxiliar= inicio;
				while(auxiliar!=null) {
					cont ++;
				auxiliar =auxiliar.proximo;
				}
		}
			return cont;
	
	}
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		No auxiliar = inicio;
		while(auxiliar!= null) {
			buffer.append("[ ");
			buffer.append(auxiliar.dado);
			buffer.append("  ]");
			buffer.append("[]--> ");
			auxiliar = auxiliar.proximo;
		}
		buffer.append("Null");
		return buffer.toString();
	}
}
