package lista7;

import java.util.Stack;

public class DiamanteEAreia {

	public static void main(String[] args) {
		
		String mina = "<<<..<......<<<<....>";
		int contDiamantes = 0;
		Stack<Character> pilha = new Stack<Character>();
		
		
		for (int i = 0; i < mina.length(); i++) {
			
			char caracter = mina.charAt(i);
			if (caracter == '<') {
				pilha.push(caracter);
			} else if (caracter == '>') {
				if(!pilha.isEmpty()) {
					pilha.pop();
					contDiamantes++;
				}
			}
			
		} 
		
		System.out.println("Contador de Diamantes = "+contDiamantes);

	}

}
