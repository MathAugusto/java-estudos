
public class PrimeiroExemplo {
	
	public void exibirMensagem() {
		
		System.out.println("Oi em Java");
	}

	public static void main(String[] args) {
		
		PrimeiroExemplo pe = new PrimeiroExemplo();
		pe.exibirMensagem();
	}
	
    int a = 1;
    int b = 10;
    boolean c = false;
    boolean d = true;
    { if ( c && (b > a) || !d ) {
        System.out.println("Olá Mundo!");
    }
    else {
        System.out.println("Olá Lua!");}
    
    }
}

