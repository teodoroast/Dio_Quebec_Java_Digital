public class ExemploFor {
    public static void main(String[] args) {
        //Exemplo 03 For - Arrays (Em Arrays o indice inicia sempre em ZERO)
            String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

            for(String aluno : alunos){
                System.out.println("Nome do aluno é: " + aluno);
            }
    }
}

/******************************************************************************************* 
    Exemplo 01 For 
    public static void main(String[] args) {
            for ( int carneirinhos = 1; carneirinhos <=20; carneirinhos ++){
            System.out.println("Contando Carneirinhos " + carneirinhos);
            }
            System.out.println("Jozinho Dormiu!");
    }

********************************************************************************************
    Exemplo 02 For - Arrays 
    public static void main(String[] args) {
            String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
            for (int x=0; x < alunos.length; x++){
                System.out.println("O aluno do indice x=" + x + " é " + alunos [ x ]);
            }
*/