
public class Correntista {
	
	private static int proxCodigo = 1;
	
	private int codigo;
	private String nome;
	
	public Correntista(String nome) {
		codigo = getProxCodigo();
		this.nome = nome;
	}
	
	public static int getProxCodigo(){
		return proxCodigo++;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
