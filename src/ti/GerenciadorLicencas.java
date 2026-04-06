package ti;

public class GerenciadorLicencas {
    public static boolean liberarNovaLicenca(LicencaSoftware licenca){
        if(licenca.assentosOcupados < licenca.totalAssentos){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        LicencaSoftware licencaOffice = new LicencaSoftware();

        licencaOffice.nomePrograma = "Pacote Office";
        licencaOffice.assentosOcupados = 10;
        licencaOffice.totalAssentos = 10;

        if(liberarNovaLicenca(licencaOffice)){
            System.out.println("Sucesso Pode instalar o " + licencaOffice.nomePrograma + " para o novo funcionário!");
        }else{
            System.out.println("Alerta: Não há mais assentos para o " + licencaOffice.nomePrograma + " Compre mais licenças!!");
        }

    }
}
