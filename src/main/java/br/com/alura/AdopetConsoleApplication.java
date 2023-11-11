package br.com.alura;

import java.util.Scanner;

public class AdopetConsoleApplication {
	

    public static void main(String[] args) {
    	CommandExecutor executor = new CommandExecutor();
    	
        System.out.println("##### BOAS VINDAS AO SISTEMA ADOPET CONSOLE #####");
        try {
            int opcaoEscolhida = 0;
            while (opcaoEscolhida != 5) {
            	
            	exibirMenu();

                String textoDigitado = new Scanner(System.in).nextLine();
                opcaoEscolhida = Integer.parseInt(textoDigitado);
                
                switch (opcaoEscolhida) {
                	case 1 -> executor.executeCommand(new AbrigoListarCommand());
                	case 2 -> executor.executeCommand(new AbrigoCadastrarCommand());
                	case 3 -> executor.executeCommand(new PetListarCommand());
                	case 4 -> executor.executeCommand(new PetImportarCommand());
                	case 5 -> System.exit(0);
                	default -> opcaoEscolhida = 0;
                }
            }
            System.out.println("Finalizando o programa...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	private static void exibirMenu() {
        System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
        System.out.println("1 -> Listar abrigos cadastrados");
        System.out.println("2 -> Cadastrar novo abrigo");
        System.out.println("3 -> Listar pets do abrigo");
        System.out.println("4 -> Importar pets do abrigo");
        System.out.println("5 -> Sair");
		
	}
    
	
    
    
    
}
