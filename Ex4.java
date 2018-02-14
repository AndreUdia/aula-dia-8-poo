import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.println(nome.toUpperCase());
		
		System.out.println("----------------------------------------");
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "André Vasconcelos Souto";
		System.out.println(pessoa.toString());
		
		System.out.println("----------------------------------------");
		
		Endereco endereco = new Endereco();
		endereco.cep = "38.402.188";
		endereco.cidade = "Uberlandia";
		endereco.estado = "Minas Gerais";
		endereco.logadouro = "Alameda Ecológica";
		endereco.numero = "120";
		
		System.out.println(endereco.toString());
		
		System.out.println("----------------------------------------");
		
		Circulo circulo = new Circulo();
		circulo.raio = 5.00;
		System.out.println(circulo.retornaArea());
		System.out.println(circulo.retornaCircunferencia(100.00));
	}

}
