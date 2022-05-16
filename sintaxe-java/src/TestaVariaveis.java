
public class TestaVariaveis {
	
	public static void main(String[] args) {
		System.out.println("Ola mundo!");
		//Criando variaveis
		String nome;
		int anoAtual;
		int anoNascimento;
		int idade;
		
		// Atribuindo valores nas variaveis 
		nome = "Pedro";
		anoAtual = 2022;
		anoNascimento = 2000;
		
		//fazendo calculos com as variaveis
		idade = anoAtual - anoNascimento;
		
		
		
		System.out.println("Ola " + nome );
		System.out.println("Idade: " + idade + "Anos");
	}
}
