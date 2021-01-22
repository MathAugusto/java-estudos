
public class CorrentistaJuridico extends Correntista{
	
	private String nomeResponsavel;
	
	public CorrentistaJuridico(String nome, String nomeResponsavel){
		super(nome);
		this.nomeResponsavel = nomeResponsavel;
	}
	
	public String getNomeResponsave() {
		return nomeResponsavel;
	}

	public void setNomeResponsave(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	
	
}

