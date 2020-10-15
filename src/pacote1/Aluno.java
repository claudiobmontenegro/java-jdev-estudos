package pacote1;

import java.util.ArrayList;
import java.util.List;

import pacote1.constantes.StatusAluno;

public class Aluno extends Pessoa {


	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCPF == null) ? 0 : numeroCPF.hashCode());
		result = prime * result + ((registroGeral == null) ? 0 : registroGeral.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (numeroCPF == null) {
			if (other.numeroCPF != null)
				return false;
		} else if (!numeroCPF.equals(other.numeroCPF))
			return false;
		if (registroGeral == null) {
			if (other.registroGeral != null)
				return false;
		} else if (!registroGeral.equals(other.registroGeral))
			return false;
		return true;
	}

	public Double getMediaNota() {

		double total = 0.0;

		for (Disciplina d : disciplinas) {
			total += d.getNota();
		}
		return total / disciplinas.size();
	}

	public String getAlunoAprovacao() {
		double media = this.getMediaNota();

		if (media >= 7.0) {
			return StatusAluno.APROVADO;
		}
		if (media >= 5.0 && media < 7.0) {
			return StatusAluno.RECUPERACAO;
		} else {
			return StatusAluno.REPROVADO;
		}
	}


	

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	@Override
	public double salario() {
		System.out.println("aluno");
		return 0;
	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + ", idade=" + idade + ", dataNascimento="
				+ dataNascimento + ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae="
				+ nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	
	

}
