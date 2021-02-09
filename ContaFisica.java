
public class ContaFisica implements Conta {

	private double saldo = 0.0;
	
	public static final double I = 0.03;

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
	
	public double simulaEmprestimo(double cf, int n) throws IllegalArgumentException {
		
		if(cf <= 0.0 || n <= 0) {
			throw new IllegalArgumentException();		
		}
		else {
			return I/(1-1/Math.pow(1+I, n))*cf;
		}
				
	}
	
}