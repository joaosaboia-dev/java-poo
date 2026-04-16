package EscritaELeitura;

import java.io.File;

public class DeletarTarefas {

    public static void main(String[] args) {

        File arquivo = new File("minhas_tarefas.txt");

        if (arquivo.exists()) {

            if (arquivo.delete()) {
                System.out.println("💥 O arquivo foi deletado com sucesso!");
            } else {
                System.out.println("❌ O Java encontrou o arquivo, mas o Windows não deixou apagar.");
            }

        } else {
            System.out.println("🤷‍♂️ O arquivo não existe. Talvez você já tenha apagado na mão?");
        }
    }
}