//Rafael Munhoz Castro

public abstract class Airsoft{

    private String modelo; //Exemplo: MKII PDW

    private String mecanismo;//Exemplo: AEG

    private String marca;//Exemplo: Krytac

    private int registro;//Exemplo: 245047649


    //métodos construtor
    public Airsoft(){
        modelo = "";
        mecanismo = "";
        marca = "";
        registro = 0;
    }

    //sobrecarga
    public Airsoft(String modelo, String mecanismo, String marca, int registro, String status){
        this.modelo = modelo;
        this.mecanismo = mecanismo;
        this.marca = marca;
        this.registro = registro;
    }




    //metodos set
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setMecanismo(String mecanismo){
        this.mecanismo = mecanismo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setRegistro(int registro){
        this.registro = registro;
    }


    //metodos get
    public String getModelo(){
        return modelo;
    }

    public String getMecanismo(){
        return mecanismo;
    }

    public String getMarca(){
        return marca;
    }

    public int getRegistro(){
        return registro;
    }

}
