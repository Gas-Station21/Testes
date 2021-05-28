package projetoIntegrador;

public class CadastrarEmpresa implements Cadastro{
	
	private String nomeEmpresa;
	private String cnpj;
	private String email;
	private String telefone;
	private Endereco endereco;
	
	public CadastrarEmpresa(String nomeEmpresa, String cnpj, String email, String telefone, Endereco endereco) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.email = email;
		this.telefone = telefone;
		this.setEndereco(endereco);
	}

	@Override
	public String toString() {
		return " Informações da Empresa: " + nomeEmpresa + ", cnpj=" + cnpj + ", email=" + email + ", telefone="
				+ telefone + endereco;
	}

	@Override
	public boolean validarCadastro() {
		System.out.println("Cadastro efetuado !");
		return false;
	}

	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
