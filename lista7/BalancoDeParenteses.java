package lista7;

import java.util.Stack;

public class BalancoDeParenteses {

	public static void main(String[] args) {
		String parentese = ")(";
		int contParenteses = 0;
		Stack<Character> pilha = new Stack<Character>();
		
		
		for (int i = 0; i < parentese.length(); i++) {
			
			char caracter = parentese.charAt(i);
			if (caracter == '(') {
				pilha.push(caracter);
			} else if (caracter == ')') {
				if(!pilha.isEmpty()) {
					pilha.pop();
					contParenteses++;
				}else 
				
				System.out.println("A valida��o et� errada! ");
			}
			
		} 
		
		System.out.println("Balan�o de Par�nteses = "+contParenteses);

	}

}
