//Rafael Munhoz Castro

public class Endereco {

    private String rua;
    private int numero;
    private int cep;

    //metodo construtor
    public Endereco(){
        rua = "";
	numero = 0;
        cep = 0;
    }
    //construtor sobrecarregado
    public Endereco(String rua, int numero, int cep){
        this.rua = rua;
	this.numero = numero;
        this.cep = cep;
    }

    //metodos set
    public void setRua(String rua){
        this.rua = rua;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setCep(int cep){
        this.cep = cep;
    }

    //metodos get
    public String getRua(){
        return rua;
    }

    public int getNumero(){
        return numero;
    }

    public int getCep(){
        return cep;
    }
}
