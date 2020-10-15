package pacote1.excecao;

public class ExecaoProcessarNota extends Exception {

	private String erro;

	public ExecaoProcessarNota(String erro) {
		super(erro);
		this.erro = erro;
	}
}
