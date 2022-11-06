public class PlanoOperadora {
    public static void main(String[] args) {
        /*  Planos:  T = Turbo ; M = Midia ; B = Basico */
        String plano = "T";

        switch (plano) {
            case "T" : {
                System.out.println("5Gb Youtube");
            }
            case "M" : {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B" : {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}


/* Se optar por switch / case, devo me aprofundar um 
pouco mais em conceitos de continuidade, break e default.

******************************************************************

        Rev-01
        String plano = "T";
        switch (plano) {
            case "T" : {
                System.out.println("5Gb Youtube");
            }
            case "M" : {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B" : {
                System.out.println("100 minutos de ligação");

*/