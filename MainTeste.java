package projetoIntegrador;

public class MainTeste {

	public static void main(String[] args) {
		
		var endereco1 = new Endereco("caiosjvioa", 2523, "rrghhsdh", "6415465156", "vila madalena", "sao paulo");
		var empresa1 = new CadastrarEmpresa("Locomos", "1351321231", "contact@locomos.com", "31-95884456", endereco1);
		System.out.println(empresa1);
		empresa1.validarCadastro();

		System.out.println();
		
		var endereco2 = new Endereco("...", 431, "...", "30253-620", "Santa Cruz", "MG");
		var posto1 = new CadastroPosto("Shell", "contato@postoshell.com", "31-45886625", "26511215", "...", "...", endereco2);
		System.out.println(posto1);	
		posto1.validarCadastro();
		System.out.println();
	
		var cliente1 = new PessoaFisica("Marcos Silva", "018.485.895.48", "Marquinreidelas@gmail.com", "31-965884426");
		System.out.println(cliente1);
		
		cliente1.validarCadastro();
		System.out.println();
		
		System.out.println(cliente1.inserirComentario(null));
	}
}
