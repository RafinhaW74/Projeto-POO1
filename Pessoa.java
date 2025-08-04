//Rafael Munhoz Castro

public abstract class Pessoa{

    private String cpf;
    private String nome;

    //métodos contrutor
    public Pessoa(){
        cpf = "";
        nome = "";
    }

    //sobrecarga
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }



    //metodos set
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }



    //metodos get
    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }
}
