public class SistemaMedidas {
    public static void main(String[] args) {
        //Rev-1
        String sigla = "P";

        if (sigla == "P")
        System.out.println("PEQUENO");

        else if(sigla == "M")
        System.out.println("MÉDIO");

        else if(sigla == "G")
        System.out.println("GRANDE");

        else
        System.out.println("Indefinido");

    }
}

/****************************************************************
        Rev-01      
        String sigla = "P";

        if (sigla == "P")
        System.out.println("PEQUENO");

        else if(sigla == "M")
        System.out.println("MÉDIO");

        else if(sigla == "G")
        System.out.println("GRANDE");

        else
        System.out.println("Indefinido"); 

*****************************************************************
        Rev-02 (Titulo de conhecimento. Linhas ñ enecessárias)
        String sigla = "G";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
        }
            case "M":{
                System.out.println("MÉDIO");
                break;
        }
            case "G":{
                System.out.println("GRANDE");
                break;
        }
        default:
        System.out.println("Indefinido");
        */