package Collection;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

//import java.util.stream.Collectors;
//import java.util.Iterator;

public class ExcemploCollection {

public static void main(String[] args) {
        //Lista de notas
        List<Double>  notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(10.0);
        notas.add(6.0);
        notas.add(5.0);
        notas.add(4.0);
        notas.add(10.0);
        notas.add(0.0);
        notas.add(3.0);
        notas.add(10.0);
        notas.add(9.0);

        //System.out.println("Crie uma lista com 10 notas: "); ou //System.out.println(notas.toString()); 

    /*  System.out.println("01 - Exiba a posição da nota 5.0: " + "Linha " + notas.indexOf(5d)); */
        //notas.index0f é o comando que chama um determinado valor.

    /*  System.out.println("02 - Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); 
        System.out.println(notas); */
        // notas.add é o comando que adiciona um valor em uma lista em um determinada posição.

    /*  System.out.println("03 - Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); 
        System.out.println(notas); */
        //notas.set faz a substituição de um valor de uma linha por outro valor nesse caso substituimos 5 por 6.

    /*  System.out.println("04 - Confira se a nota 5.0 está na lista: " + notas.contains(5d)); */
        // notas.constains diz se ele é verdadeiro ou falso, nesse caso foi falso.

     /* System.out.println("05 - Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) 
        System.out.println("Linha " + nota); */
        //  exibe a lista uma em baixo da outra

    /*  System.out.println("06 - Exiba a terceira nota adicionada: " + notas.get(2));  
        System.out.println(notas.toString()); */  
        // esse comando chamou o valor da terceira linha

    /*  System.out.println("07 - Exiba a menor nota: " + "A menor nota é = " + Collections.min(notas)); */
        // esse comando chamou a menor nota da lista

        /* System.out.println("08 - Exiba a menor nota: " + "A maior nota é = " + Collections.max(notas)); */
        // esse comando chamou a maior nota da lista

        
    /* iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("09 - Exiba a soma dos valores: " + soma); 
        */
        // comando que faz a soma das notas Obs: Desativei as linhas: 4 e 6 para poder usar esse comando.

        /* Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next; 
        }
        */
        //System.out.println("Exiba a soma dos valores: " + soma);

        /* System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas); */
        // Obs: Se eu deixar a linha 81 = notas.remove(0); eu estaria removendo o item da linha e não o valor (0) como o exercicio pede.
        // Por isso devemos colocar a letra d no final (0d).

        /* System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7 ) iterator1.remove();
        }
        System.out.println(notas); */
        // Removel o valor 7 da lista

        System.out.println("Apague toda a linha ");
        notas.clear();
        System.out.println(notas);
        System.out.println(" Confira a lista vazia: ");
}
}

/*  Material dessa aula GitHub 
    https://github.com/cami-la/curso-dio-intro-collections/blob/master/src/br/com/dio/collection/list/ExemploList.java
*/