package rh;

public class SistemaTriagem {
    public static boolean aprovarParaEntrevista(Candidato c){
        if(c.notaTesteLogica >= 7 && c.sabeJava){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Candidato c1 = new Candidato();

        c1.nome = "Joao Saboia";
        c1.sabeJava = false;
        c1.notaTesteLogica = 2;

        if(aprovarParaEntrevista(c1)){
            System.out.println("Candidato " + c1.nome + " chamado para entrevista!");
        }else{
            System.out.println("Candidato " + c1.nome + " rejeitado para entrevista!");
        }
    }
}
