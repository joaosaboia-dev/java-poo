package EscritaELeitura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerTarefas {

    public static void main(String[] args) {

        File arquivo = new File("minhas_tarefas.txt");

        try {
            Scanner leitor = new Scanner(arquivo);

            System.out.println("--- SUAS TAREFAS PARA AMANHÃ ---");

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();

                System.out.println("- " + linha);
            }

            leitor.close();
            System.out.println("--------------------------------");

        } catch (FileNotFoundException e) {
            System.out.println("❌ Ops! Não encontrei o arquivo 'minhas_tarefas.txt'. Você já criou ele?");
        }
    }
}