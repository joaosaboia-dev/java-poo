package ti;

public class GerenciadorTI {
    public static boolean verificarTroca(Notebook n){
        if(n.anosDeUso >=    4){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Notebook meuNotebook = new Notebook();

        meuNotebook.marca = "Lenovo";
        meuNotebook.anosDeUso = 5;

        if(verificarTroca( meuNotebook ) ){
            System.out.println("Atenção: o notebook " + meuNotebook.marca + " precisa ser trocado!");
        }else{
            System.out.println("O ti.Notebook " + meuNotebook.marca + " ainda está na validade!");
        }
    }
}
