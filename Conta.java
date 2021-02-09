
public interface Conta {
	
	public void extrato();
	
	public void deposito(double valor);
	
	public void saque(double valor);
	
	public double simulaEmprestimo(double cf, int n);
	
	
}
