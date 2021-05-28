package projetoIntegrador;

public class CadastroPosto implements Cadastro{
	
	private String nomePosto;
	private String email;
	private String telefone;
	private String cnpj;
	private String coordenadaGeografica;
	private String razaoSocial;
	private Endereco endereco;
	
	public CadastroPosto(String nomePosto, String email, String telefone, String cnpj, String coordenadaGeografica,
			String razaoSocial, Endereco endereco) {
		super();
		this.nomePosto = nomePosto;
		this.email = email;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.coordenadaGeografica = coordenadaGeografica;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
	}
        

	@Override
	public String toString() {
		return "nome do Posto: " + nomePosto + ", email: " + email + ", telefone: " + telefone + ", cnpj: "
				+ cnpj + ", coordenada geografica: " + coordenadaGeografica + ", razao Social: " + razaoSocial
				+ ", endereço: " + endereco;
	}

	@Override
	public boolean validarCadastro() {
		System.out.println("Posto " + this.nomePosto + " cadastrado.");
		return true;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
