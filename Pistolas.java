//Rafael Munhoz Castro

public class Pistolas extends Airsoft{

    private boolean blowback;//true, false
    private String tipoGrip;//ergonômico, padrão


    //métodos construtor
    public Pistolas(){
        blowback = false;
        tipoGrip = "";
    }

    //sobrecarga
    public Pistolas(boolean blowback, String tipoGrip){
        this.blowback = blowback;
        this.tipoGrip = tipoGrip;

    }




    //metodos set
    public void setBlowback(boolean blowback){
        this.blowback = blowback;
    }

    public void setTipoGrip(String tipoGrip){
        this.tipoGrip = tipoGrip;
    }

    //metodos get
    public boolean getBlowback(){
        return blowback;
    }

    public String getTipoGrip(){
        return tipoGrip;
    }
}
