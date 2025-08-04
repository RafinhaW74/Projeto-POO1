//Rafael Munhoz Castro

public class Rifles extends Airsoft{

    private String modoDeTiro;//semi, auto

    private String classe;//fuzil de precisão, PDW, DMR


    //métodos construtor
    public Rifles(){
        modoDeTiro = "";
        classe = "";
    }

    //sobrecarga
    public Rifles(String modoDeTiro, String classe){
        this.modoDeTiro = modoDeTiro;
        this.classe = classe;

    }




    //metodos set
    public void setModoDeTiro(String modoDeTiro){
        this.modoDeTiro = modoDeTiro;
    }

    public void setClasse(String classe){
        this.classe = classe;
    }

    //metodos get
    public String getModoDeTiro(){
            return modoDeTiro;
    }

    public String getClasse(){
        return classe;
    }
}
