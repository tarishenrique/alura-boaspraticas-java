package br.com.alura.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.http.HttpResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.domain.Abrigo;

class AbrigoServiceTest2 {
	
	private ClientHttpConfiguration client = mock(ClientHttpConfiguration.class);
	private AbrigoService abrigoService = new AbrigoService(client);
	private HttpResponse<String> response = mock(HttpResponse.class);
	private Abrigo abrigo = new Abrigo("Teste", "61981880392", "abrigo_alura@gmail.com");

	@Test
	void testAbrigoService() {
		fail("Not yet implemented");
	}

	@Test
	void testListarAbrigo() throws IOException, InterruptedException {
		abrigo.setId(0L);
        String expectedAbrigosCadastrados = "Abrigos cadastrados:";
        String expectedIdENome = "0 - Teste";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        when(response.body()).thenReturn("[{"+abrigo.toString()+"}]");
        when(client.dispararRequisicaoGet(anyString())).thenReturn(response);

        abrigoService.listarAbrigo();

        String[] lines = baos.toString().split(System.lineSeparator());
        String actualAbrigosCadastrados = lines[0];
        String actualIdENome = lines[1];

        Assertions.assertEquals(expectedAbrigosCadastrados, actualAbrigosCadastrados);
        Assertions.assertEquals(expectedIdENome, actualIdENome);
	}

	@Test
	void testCadastrarAbrigo() {
		fail("Not yet implemented");
	}

}
