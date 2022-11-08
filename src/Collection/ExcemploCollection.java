package Collection;

import java.util.ArrayList;
import java.util.List;

public class ExcemploCollection {

public static void main(String[] args) {
    System.out.println("Crie uma lista e adicione as sete notas: ");

    List<Double>  notas = new ArrayList<Double>();
    notas.add(7.0);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5.0);
    notas.add(7.0);
    notas.add(0.0);
    notas.add(3.6);

    System.out.println(notas.toString());

    System.out.println("Exiba a posição da nota 5.0: " + "Linha " + notas.indexOf(5d));
    //notas.index0f é o comando que chama um determinado valor.

    System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
    notas.add(4, 8d); 
    System.out.println(notas);
    // notas.add é o comando que adiciona um valor em uma lista em um determinada posição.

    System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
    notas.set(notas.indexOf(5d), 6.0); 
    System.out.println(notas);
    //notas.set faz a substituição de um valor de uma linha por outro valor nesse caso substituimos 5 por 6.

    System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
    // notas.constains diz se ele é verdadeiro ou falso, nesse caso foi falso.

    System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) 
        System.out.println("Linha " + nota);

    }

}

/*  Material dessa aula GitHub 
    https://github.com/cami-la/curso-dio-intro-collections/blob/master/src/br/com/dio/collection/list/ExemploList.java
*/