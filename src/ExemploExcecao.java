import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        try {

            valor = NumberFormat.getInstance().parse("1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
}

    /*  Site para estudos
    1 - https://www.w3schools.com/java/java_try_catch.asp"
    2 - https://www.oracle.com/br/technical-resources/article/java/erros-java-exceptions.html */