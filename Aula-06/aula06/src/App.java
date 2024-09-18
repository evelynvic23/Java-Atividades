public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 07 Conversão");

        String st, st2;
        float real, real2;
        int inteiro1, inteiro2;


        //Convertendo String para float

        st = "1.2";

        real = (float) (new Float(st).floatValue());

        System.out.println("String para float: " + real);

        // Convertendo Float para String

        real2 = 1.3f;

        st2 = new Float(real2).toString();

        System.out.println("Float para String: " + real2);



        

    }
}
