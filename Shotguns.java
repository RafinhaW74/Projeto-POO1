//Rafael Munhoz Castro

public class Shotguns extends Airsoft{

    private int quantidadeCanos;//1, 2, 3
    private String espalhamento;//grande, médio, pequeno


    //métodos construtor
    public Shotguns(){
        quantidadeCanos = 0;
        espalhamento = "";
    }

    //sobrecarga
    public Shotguns(int quantidadeCanos, String espalhamento){
        this.quantidadeCanos = quantidadeCanos;
        this.espalhamento = espalhamento;

    }

    //metodos set
    public void setQuantidadeCanos(int quantidadeCanos){
        this.quantidadeCanos = quantidadeCanos;
    }

    public void setEspalhamento(String espalhamento){
        this.espalhamento = espalhamento;
    }

    //metodos get
    public int getQuantidadeCanos(){
        return quantidadeCanos;
    }

    public String getEspalhamento(){
        return espalhamento;
    }
}
