package calculadora;

public class calculadora {
	
	
	public int resultado;
	
	void saludar(){
		System.out.println("hello,calculator");
	}
	
	void saludar(String a ){
		System.out.println(a);
	}
	
	int sumar (int numero1, int numero2){
		resultado = numero1 + numero2;
		return resultado;
	}
	
}
