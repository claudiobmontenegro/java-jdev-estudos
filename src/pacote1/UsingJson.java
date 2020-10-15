package pacote1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class UsingJson {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Claudio");
		aluno1.setIdade(20);
		aluno1.setDataNascimento("15/12/1999");
		aluno1.setRegistroGeral("18181818");
		aluno1.setNumeroCPF("51375381");
		aluno1.setNomeMae("Jeanne");
		aluno1.setNomePai("Montenegro");
		aluno1.setDataMatricula("01/01/2020");
		aluno1.setNomeEscola("unipe");
		aluno1.setSerieMatriculado("P6");
		
		
		Gson gson = new Gson();

		// converte objetos Java para JSON e retorna JSON como String
		/*String json = gson.toJson(aluno1);

		try {
			FileWriter writer = new FileWriter("C:\\Users\\claud\\OneDrive\\Área de Trabalho\\Aula_01\\Arquivo.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);
		*/


		// Converte arquivo Json para Objeto
		try {
			Aluno aluno2= gson.fromJson(new FileReader("C:\\Users\\claud\\OneDrive\\Área de Trabalho\\Aula_01\\Arquivo.json"), Aluno.class);
			System.out.println(aluno2);
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
