package pacote1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import pacote1.constantes.StatusAluno;

public class main1 {

	public static void main(String[] args) {
		
		//feito alguns try catch finally junto ao exception.getClass().getName()

		String login = JOptionPane.showInputDialog("Informe o Login: ");
		String senha = JOptionPane.showInputDialog("Informe o Senha: ");
		
		/*Poderia ser tbm -> PermitirAcesso secretario = new Secretario();*/

		if(new Secretario().autenticar(login, senha)) {	
			
		List<Aluno> alunos = new ArrayList<Aluno>();

		/*
		 * Lista que dentro dela tem-se uma chave que identifica uma sequencia de
		 * valores
		 */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		for (int qtd = 1; qtd <= 3; qtd++) {

			String nome = JOptionPane.showInputDialog("Nome Aluno:");
//		String idade = JOptionPane.showInputDialog("Idade:");
//		String dataNascimento = JOptionPane.showInputDialog("Data Nascimento:");
//		String registroGeral = JOptionPane.showInputDialog("RG:");
//		String numeroCPF = JOptionPane.showInputDialog("CPF:");
//		String nomeMae = JOptionPane.showInputDialog("Nome da mãe:");
//		String nomePai= JOptionPane.showInputDialog("Nome do pai:");
//		String dataMatricula = JOptionPane.showInputDialog("Data da matrícula:");
//		String nomeEscola = JOptionPane.showInputDialog("Nome da escola:");
//		String serieMatriculado = JOptionPane.showInputDialog("Serie matriculada:");
//
//		Aluno aluno1 = new Aluno();
//		aluno1.setNome(nome);
//		aluno1.setIdade(Integer.valueOf(idade));
//		aluno1.setDataNascimento(dataNascimento);
//		aluno1.setRegistroGeral(registroGeral);
//		aluno1.setNumeroCPF(numeroCPF);
//		aluno1.setRegistroGeral(registroGeral);
//		aluno1.setNomeMae(nomeMae);
//		aluno1.setNomePai(nomePai);
//		aluno1.setDataMatricula(dataMatricula);
//		aluno1.setNomeEscola(nomeEscola);
//		aluno1.setSerieMatriculado(serieMatriculado);

			Aluno aluno2 = new Aluno();
			aluno2.setNome(nome);
			aluno2.setIdade(20);
			aluno2.setDataNascimento("15/12/1999");
			aluno2.setRegistroGeral("18181818");
			aluno2.setNumeroCPF("51375381");
			aluno2.setNomeMae("Jeanne");
			aluno2.setNomePai("Montenegro");
			aluno2.setDataMatricula("01/01/2020");
			aluno2.setNomeEscola("unipe");
			aluno2.setSerieMatriculado("P6");

			for (int i = 1; i <= 1; i++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + i + " :");
				String NotaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + i + " :");

				Disciplina d = new Disciplina();
				d.setDisciplina(nomeDisciplina);
				d.setNota(Double.valueOf(NotaDisciplina));

				aluno2.getDisciplinas().add(d);
			}

			int sair;
			do {

				int opt = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

				if (opt == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover ?");
					aluno2.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
					sair = 0;
				} else {
					sair = 1;
				}
			} while (sair == 0);

			alunos.add(aluno2);
			
		}

		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {

			if (aluno.getAlunoAprovacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovacao().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			} else if (aluno.getAlunoAprovacao().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}

		}

		System.out.println("---------- Lista de Aprovados ----------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome = " + aluno.getNome() + "/ Resultado = " + aluno.getAlunoAprovacao()
					+ "/ com média de = " + aluno.getMediaNota());
		}
		System.out.println("---------- Lista de Reprovados ----------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome = " + aluno.getNome() + "/ Resultado = " + aluno.getAlunoAprovacao()
					+ "/ com média de = " + aluno.getMediaNota());
		}

		System.out.println("---------- Lista de Recuperação ----------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome = " + aluno.getNome() + "/ Resultado = " + aluno.getAlunoAprovacao()
					+ "/ com média de = " + aluno.getMediaNota());
		}

		
	
		
	}else {
			JOptionPane.showMessageDialog(null, "Acesso Negado");
		}
}
}
