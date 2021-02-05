
public class ContaJuridica implements Conta {

	private double saldo = 0.0;
	
	public void extrato() {
		System.out.println("Saldo da conta física: " + saldo);
		
	}

	public void deposito(double valor) {
		saldo += valor;
		System.out.println("Valor depositado na conta: " + valor);
		
	}

	public void saque(double valor) {
		if(valor <= saldo) {
		saldo -= valor;
		System.out.println("Valor sacado: " + valor);
		}
		else {
			System.out.println("Saldo insuficente");
		}
	}

}
