package EscritaELeitura;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PlanejadorTarefas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeArquivo = "minhas_tarefas.txt";

        System.out.println("--- BEM-VINDO AO PLANEJADOR DE TAREFAS ---");
        System.out.println("Digite as suas atividades para amanhã.");
        System.out.println("Quando terminar, digite 'x' para salvar e sair.\n");

        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            PrintWriter gravador = new PrintWriter(arquivo);

            while (true) {
                System.out.print("Digite uma tarefa (ou 'x' para sair): ");
                String tarefa = scanner.nextLine();

                if (tarefa.equalsIgnoreCase("x")) {
                    break;
                }

                gravador.println(tarefa);
            }

            gravador.close();
            arquivo.close();

            System.out.println("\n✅ Sucesso! Suas tarefas foram salvas no arquivo: " + nomeArquivo);

        } catch (IOException e) {
            System.out.println("Ops! Ocorreu um erro ao tentar criar o arquivo.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
