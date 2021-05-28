package projetoIntegrador;

import java.util.Scanner;

public class PessoaFisica implements Cadastro, Comentario {
	
	private String nomePessoa;
	private String cpf;
	private String email;
	private String telefone;
	
	public PessoaFisica(String nomePessoa, String cpf, String email, String telefone) {
		super();
		this.nomePessoa = nomePessoa;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "nome =" + nomePessoa + ", cpf =" + cpf + ", email =" + email + ", telefone =" + telefone
			            	;
	}
	
	public boolean validarCadastro() {
		System.out.println("Cadastro efetuado !");
		return true;
	}
	
	@Override
	public String inserirComentario(String com) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserir comentario: ");
		com = entrada.nextLine();
		if(com != null) {
			System.out.println();
			System.out.println("comentario postado");
		}
		else {
			return null;
		}
		return com;

	}

	@Override
	public boolean like() {
		
		return true;
	}

}
