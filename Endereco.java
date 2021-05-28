package projetoIntegrador;

public class Endereco {
	
	private String logradouro;
	private int num;
	private String complemento;
	private String cep;
	private String bairro;
	private String estado;
	
	public Endereco(String logradouro, int num, String complemento, String cep, String bairro, String estado) {
		super();
		this.logradouro = logradouro;
		this.num = num;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return " logradouro: " + logradouro + ", num: " + num + ", complemento: " + complemento + ", cep: " + cep
				+ ", bairro: " + bairro + ", estado: " + estado;
	}
	
	

	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}

}
