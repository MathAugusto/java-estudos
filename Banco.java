
public class Banco {
	
	public static void main(String[] args) {
		
		CorrentistaFisico corr1 = new CorrentistaFisico("Luiz");
		
		CorrentistaFisico corr2 = new CorrentistaFisico("Luiza");
		
		CorrentistaFisico corr3 = new CorrentistaFisico("Leticia");
		
		CorrentistaJuridico corr4 = new CorrentistaJuridico("Lua", "MICROSOFT");


		
		System.out.println( corr1.getCodigo() + " - " + corr1.getNome());
		
		System.out.println( corr2.getCodigo() + " - " + corr2.getNome());
		
		System.out.println( corr3.getCodigo() + " - " + corr3.getNome());
		
		System.out.println( corr4.getCodigo() + " - " + corr4.getNome() + " - " + corr4.getNomeResponsave());

	}

}
