
public class VariaveisFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 3100.00;
		System.out.println("Meu salario é: " + salario);
		
		// o resultado teria que ser flutuante mas como as 
		//variaveis são inteiras então não da double
		int divisao = 5 / 2;
		System.out.println(divisao);
		
		// agora ele mostra o double
		double outraDivisao = 5.0 / 2;
		System.out.println(outraDivisao);
		
		// ele mostra um erro pois a variavel foi criada depois do print
		//System.out.println(valor);
		//int valor = 10;
	}
}
