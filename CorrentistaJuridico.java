
public class CorrentistaJuridico extends Correntista{
	
	private String nomeResponsavel;
	
	public CorrentistaJuridico(String nome, String nomeResponsavel, ContaJuridica conta){
		super(nome, conta);
		
		this.nomeResponsavel = nomeResponsavel;
	}
	
	public void exibeIdentificacao() {
		System.out.println("Eu sou um correntista jurídico: " + getCodigo() + " - " + getNome());
	}
	
	public String getNomeResponsave() {
		return nomeResponsavel;
	}

	public void setNomeResponsave(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	
	
}

