package view.model;

public class Paciente {
	private int id;
	private String nome;
	private String cpf;
	private String logradouro;
	private String numero;
	private String cep;
	private String bairro;
	private String telRes;
	private String telCel;
	private String email;
	private String sexo;
	private Medico medico;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
	public String getTelRes() {
		return telRes;
	}
	public void setTelRes(String telRes) {
		this.telRes = telRes;
	}
	public String getTelCel() {
		return telCel;
	}
	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", logradouro=" + logradouro + ", numero="
				+ numero + ", cep=" + cep + ", bairro=" + bairro + ", telRes=" + telRes + ", telCel=" + telCel
				+ ", email=" + email + ", sexo=" + sexo + ", medico=" + medico + "]";
	}
	
	
	
	
}
