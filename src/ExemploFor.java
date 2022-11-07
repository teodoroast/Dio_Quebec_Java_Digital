public class ExemploFor {
    public static void main(String[] args) {
        //Exemplo 04 For - Arrays (Em Arrays o indice inicia sempre em ZERO)
        System.out.println("Lista para o Super Mercado");

        String listaCompras [] = { "Banana", "Mamão", "Maçã", "Melão", "Laranja", "Alface", "Rúcula", 
        "Espinafre", "Agrião", "Tomates", "Cenouras", "Couve-manteiga", "Batata", "Mandioquinha", "Abóbora", 
        "Vagem", "Chuchu", "Carnes", "Frangos", "Peixes", "Pães", "Queijo", "Presunto", "Peito de peru", "Iogurtes", 
        "Ovos" };

        for (int x=0; x < listaCompras.length; x++){

            System.out.println("Item " + x + ": " + listaCompras [ x ]);
                System.out.println("Lista Compras");
            
            }
    }
}


/******************************************************************************************* 
    Exemplo 01 For 
    public static void main(String[] args) {
            for ( int lista = 1; lista <=27; lista ++){
            System.out.println("Iten número " + lista);
            }
            System.out.println("Lista concluida!");
    }

********************************************************************************************
    Exemplo 02 For - Arrays 
    public static void main(String[] args) {
            String listaCompras [] = { "Banana", "Mamão", "Maçã", "Melão", "Laranja", "Alface", "Rúcula", "Espinafre", 
            "Agrião", "Tomates", "Cenouras", "Couve-manteiga", "Batata", "Mandioquinha", "Abóbora", "Vagem", "Chuchu", 
            "Carnes", "Frangos", "Peixes", "Pães", "Queijo", "Presunto", "Peito de peru", "Iogurtes", "Ovos" };

            for (int x=0; x < listaCompras.length; x++){
                System.out.println("Item número: " + x + " de " + listaCompras [ x ]);
            }
        
    }


********************************************************************************************            
    Exemplo 03 For - Arrays 
    public static void main(String[] args) {

            String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

            for(String aluno : alunos){
                System.out.println("Nome do aluno é: " + aluno); 
        }
    }
        */
            