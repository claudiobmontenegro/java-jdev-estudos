package pacote1;

public class Diretor extends Pessoa{

	private String registroEducacao;
	private int tempoDirecao;
	private String Titulacao;
	
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return Titulacao;
	}
	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", Titulacao="
				+ Titulacao + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
