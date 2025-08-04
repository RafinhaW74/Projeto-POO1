//Rafael Munhoz Castro

public class Oficina{

    private int cod_oficina;

    //criado para o uso de reflexao
    private Endereco ender;

    //métodos construtor
    public Oficina(){
        cod_oficina = 0;
        ender = new Endereco();
    }

    //sobrecarga
    public Oficina(Endereco ender, int numero, int cod_oficina){
        this.cod_oficina = cod_oficina;
        this.ender = ender;
    }


    //metodos set
    public void setCod_oficina(int cod_oficina){
        this.cod_oficina = cod_oficina;
    }

    public void setEndereco(Endereco ender){
        this.ender = ender;
    }

    //metodos get
    public Endereco getEndereco(){
        return ender;
    }

    public int getCod_oficina(){
        return cod_oficina;
    }
}