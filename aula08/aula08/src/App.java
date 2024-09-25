
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno a = new Aluno("Evelyn", "123", new Date("10-23-2005"));

        Aluno a1 = new Aluno();

        Aluno a2 = new Aluno(new Date("23-10-2005"), "123");




    }
}
