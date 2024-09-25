
import java.util.Date;

public class Aluno {

    private String nome;
    private String matricula;
    // Para usar o Date verifique se ele está importado
    private Date data_nascimento;

    public Aluno(String nome, String matricula, Date data_nascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.data_nascimento = data_nascimento;
    }

    //Construtor Vazio
    public Aluno(){

    }

    //Construtor com dois parâmetros (Texto, Texto)

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    //Construtor com dois parâmetros (Texto, Date)

    public Aluno(String nome, Date data_nascimento){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }

     //Construtor com dois parâmetros (Date, String)


    public Aluno(Date data_nascimento, String matricula){
        this.data_nascimento = data_nascimento;
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
}
