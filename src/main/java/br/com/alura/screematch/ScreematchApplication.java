package br.com.alura.screematch;

import br.com.alura.screematch.model.ConverteDados;
import br.com.alura.screematch.model.DadosSerie;
import br.com.alura.screematch.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreematchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreematchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=game+of+thrones&apikey=c5069e80");
		//System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

		System.out.println(dados);
	}


}
