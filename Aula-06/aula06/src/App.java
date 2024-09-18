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

        

    }
}
