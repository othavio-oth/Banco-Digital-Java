package principal;

import contas.ContaCorrente;

public class Banco {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Othávio","069.335.613-80");
		
		ContaCorrente conta1 = new ContaCorrente(cliente1, 11011  );
		System.out.println(conta1.getSaldo());
	}
}
