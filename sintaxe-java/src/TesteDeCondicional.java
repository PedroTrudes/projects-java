
public class TesteDeCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicional");
		
		String nome = "Pedro";
		int idade = 16;
		int quantidadeDePessoas = 1;
		// passando uma expressão na variavel
		boolean acompanhado = quantidadeDePessoas >= 2;
		//boolean acompanhado = true;
		
		//&& usado para condicional E 
		// || usado para condivional OU
		if(idade >= 18 || acompanhado) {
			System.out.println("ola você pode entrar");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
