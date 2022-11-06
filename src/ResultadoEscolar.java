public class ResultadoEscolar {
    public static void main(String[] args) {
        //Rev-03
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);




    }
}
/******************************************************************      
        Rev-01
        int nota = 8;
        if(nota >= 7)
        System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
        System.out.println("Prova de Recuperação");
        else
        System.out.println("Reprovado"); 

*******************************************************************
        Rev-02
        int nota = 5;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

*******************************************************************
        Rev-03            
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        */