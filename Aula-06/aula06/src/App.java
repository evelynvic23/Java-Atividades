public class App {
    public static void main(String[] args) throws Exception {



        utilizando_static();

        // Aqui instanciei a classe Veiculo, para conseguir acessar seus dados, pois não continham o static.

        //Instancia de um objeto
        Veiculo v = new Veiculo();

        //Chamando variáveis públicas
        v.marca = "Ford";
        v.modelo = "KA";

        Veiculo v1 = new Veiculo();

        v1.marca = "Fiat";
        v1.modelo = "Renegade";


        // O final não deixa atribuir outro valor para a variável
        
        final String teste_final;
        teste_final = "Meu primeiro valor";


    }

    // Static

    public static void utilizando_static(){

        //Chamando as variáveis sem instanciar a classe, pois continham o método Static

        Produto.inteiro1 = 10;
        Produto.inteiro2 = 20;

        //Aqui eu consigo mudar sem instanciar novamente a classe

        Produto.inteiro1 = 14;

    }





    public static void conversao(){
        System.out.println("Aula 07 Conversão");

        String st, st2, st3, st4;
        float real, real2;
        int inteiro1, inteiro2;

        //Convertendo String para float

        st = "1.2";

        real = (float) (new Float(st).floatValue());

        System.out.println("String para float: " + real);

        // Convertendo Float para String

        real2 = 1.3f;

        st2 = new Float(real2).toString();

        //ou

        st2 = String.valueOf(real2);
        

        System.out.println("Float para String: " + real2);

        // String para inteiro

        st3 = "15";

        inteiro1 = Integer.parseInt(st3);

        System.out.println("String para Inteiro: " + inteiro1);

        var soma = inteiro1 + 1;

        System.err.println(soma);

        

        // Inteiro para String

        inteiro2 = 25;

        st4 = Integer.toString(inteiro2);

        System.out.println("Inteiro para String: " + st4);


    }


}
