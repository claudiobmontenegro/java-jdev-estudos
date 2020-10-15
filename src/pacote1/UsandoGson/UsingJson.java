package pacote1.UsandoGson;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.*;

import pacote1.Aluno;

public class UsingJson {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Claudio");

		Gson gson = new Gson();

		String json = gson.toJson(aluno1);

		try {
			// Escreve Json convertido em arquivo chamado "file.json"
			FileWriter writer = new FileWriter("C:\\Users\\claud\\OneDrive\\Área de Trabalho\\Aula_01");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);

	}

}
