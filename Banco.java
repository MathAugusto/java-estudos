import java.util.ArrayList;
import java.util.Iterator;


public class Banco {
	
	public static void main(String args[]) {
		ArrayList<Correntista> listaDeClientes = new ArrayList<Correntista>();
		
		CorrentistaFisico corr1 = new CorrentistaFisico("Luiz", new ContaFisica());
		listaDeClientes.add(corr1);

		CorrentistaFisico corr2 = new CorrentistaFisico("Luiza", new ContaFisica());
		listaDeClientes.add(corr2);
		
		CorrentistaFisico corr3 = new CorrentistaFisico("Leticia", new ContaFisica());
		listaDeClientes.add(corr3);
		
		CorrentistaJuridico corrju4 = new CorrentistaJuridico("MICROSOFT", "Lua", new ContaJuridica());
		listaDeClientes.add(corrju4);
		
		
		Iterator<Correntista> it = listaDeClientes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getNome());
		}
		
		corr1.exibeIdentificacao();
		corr2.exibeIdentificacao();
		corr3.exibeIdentificacao();
		corrju4.exibeIdentificacao();

		try {
			double valorParcela = corr1.getConta().simulaEmprestimo(1000.0, 12);
			System.out.println(valorParcela);

		}
		catch(IllegalArgumentException e) {
			System.out.println("Digite valores válidos");
		}
				
	}

}
