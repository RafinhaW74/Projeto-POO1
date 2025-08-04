//Rafael Munhoz Castro

public class Manutencao {

    private Cliente cliente;

    private Armeiro armeiro;

    private Oficina oficina;

    private Shotguns shotguns;

    private Rifles rifles;

    private Pistolas pistolas;

    private String status;

    private String codManutencao;

    //métodos construtor
    public Manutencao() {
        cliente = null;
        armeiro = null;
        oficina = null;
        shotguns = null;
        rifles = null;
        pistolas = null;
        status = "";
        codManutencao = "";
    }

    //sobrecarga
    public Manutencao(Cliente cliente, Armeiro armeiro, Oficina oficina, Shotguns shotguns, Rifles rifles, Pistolas pistolas, String status, String codManutencao) {
        this.cliente = cliente;
        this.armeiro = armeiro;
        this.oficina = oficina;
        this.shotguns = shotguns;
        this.rifles = rifles;
        this.pistolas = pistolas;
        this.status = status;
        this.codManutencao = codManutencao;
    }


    //métodos set
    void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    void setArmeiro(Armeiro armeiro) {
        this.armeiro = armeiro;
    }

    void setOficina(Oficina oficina){
        this.oficina = oficina;
    }

    void setShotguns(Shotguns shotguns){
        this.shotguns = shotguns;
    }

    void setRifles(Rifles rifles){
        this.rifles = rifles;
    }

    void setPistolas(Pistolas pistolas){
        this.pistolas = pistolas;
    }

    void setStatus(String status){
        this.status = status;
    }

    void setCodManutencao(String codManutencao){
        this.codManutencao = codManutencao;
    }

    //métodos get
    Cliente getCliente() {
        return cliente;
    }

    Armeiro getArmeiro() {
        return armeiro;
    }

    Oficina getOficina(){
        return oficina;
    }

    Shotguns getShotguns(){
        return shotguns;
    }

    Rifles getRifles(){
        return rifles;
    }

    Pistolas getPistolas(){
        return pistolas;
    }

    String getStatus(){
		return status;
	}

    String getCodManutencao(){
        return codManutencao;
    }
}