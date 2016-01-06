package calculadora;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		calculadora calculadora= new calculadora();// instanciar
		calculadora.saludar();
		Convert valor= new Convert();
		calculadora.sumar(valor.romanToDecimal("XIV"), valor.romanToDecimal("XII"));
		calculadora.saludar(Integer.toString(calculadora.resultado));
		valor.IntegerToRomanNumeral(calculadora.resultado);
	}
}
