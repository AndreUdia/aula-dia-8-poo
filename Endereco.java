public class Endereco {
	String logadouro;
	String numero;
	String cidade;
	String estado;
	String cep;
	
	
	public String toString() {
		String info = "";
		info += "\nLogadouro: " +  this.logadouro;
		info += "\nNumero: " +  this.numero;
		info += "\nCidade: " +  this.cidade;
		info += "\nEstado: " + this.estado;
		info += "\nCEP: " + this.cep;
		return info;
	}
}
