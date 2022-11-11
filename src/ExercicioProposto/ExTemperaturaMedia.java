package ExercicioProposto;
//Material de apoio https://github.com/cami-la/curso-dio-intro-collections/blob/master/src/br/com/dio/collection/list/ExercicioProposto01.java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ExTemperaturaMedia {
    public static void main(String[] args) {
        try (// Lista de meses
        Scanner scan = new Scanner(System.in)) {
            List<Double> temperatura = new ArrayList<Double>();
            
            //Adicionando as temperaturas na lista:

            int count = 0;
            while (true) {
                if (count == 6) break;

                System.out.println("Digite a temperatura: ");
                Double temp = scan.nextDouble();
                temperatura.add(temp);
                count++;
            }
            System.out.println("-----------------");
            
            //exibindo todas as temperaturas:
            System.out.print("Todas as temperaturas: ");
            temperatura.forEach(t -> System.out.print(t + " "));

            //calculando e exibindo a média das temperaturas:
            double media = temperatura.stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0d);
            System.out.printf("\nMédia das temperaturas: %.1f\n", media);
        
            //exibindo as temperaturas acima da média
        System.out.print("Temperaturas acima da média: ");
        temperatura.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));

        //exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperatura.iterator();
        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                    }
                }

            count++;
            
            }
        }
    }
}