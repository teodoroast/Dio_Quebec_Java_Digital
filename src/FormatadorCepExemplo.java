public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12228410");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio");
            // Cep deve conter 8 digitos
            
            //e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
        throw new CepInvalidoException();

        return "12.228-410";
    }
}
