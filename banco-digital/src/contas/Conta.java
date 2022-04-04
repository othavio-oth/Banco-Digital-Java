package contas;

import principal.Cliente;

public abstract class Conta {

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente, int agencia) {
		this.cliente = cliente;
		this.agencia = agencia;
	}
	
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	 
	
	public  void sacar(double valor) {
	
		if(valor<=this.saldo) {
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		this.saldo +=valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
}
