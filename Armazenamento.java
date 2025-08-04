//Rafael Munhoz Castro

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Armazenamento {
    
    //lista de objetos
    private List<Cliente> clientes;
    private List<Armeiro> armeiros;
    private List<Oficina> oficinas;
    private List<Shotguns> shotguns;
    private List<Rifles> rifles;
    private List<Pistolas> pistolas;
    private List<Manutencao> manutencoes;
    
    //Instanciado uma vez apenas(Singleton)
    private static Armazenamento armazenamentoUnique;

    //Singleton
    public static Armazenamento geraArmazenamento() {
        if (armazenamentoUnique == null) {
            armazenamentoUnique = new Armazenamento();
        }
        return armazenamentoUnique;
    }

    //método construtor
    private Armazenamento() {
        this.clientes = new ArrayList<>();
        this.armeiros = new ArrayList<>();
        this.oficinas = new ArrayList<>();
        this.shotguns = new ArrayList<>();
        this.rifles = new ArrayList<>();
        this.pistolas = new ArrayList<>();
        this.manutencoes = new ArrayList<>();
    }
    
    
    //Manipulacoes
    
    //cliente:
    
    //consulta
    public Cliente consCliCpf(Cliente cli){
        for(int i = 0; i < clientes.size(); i++){
            if(cli.getCpf().equals(clientes.get(i).getCpf())){
                return clientes.get(i);
            }
        }
        for(int i = 0; i < armeiros.size(); i++){
            if(cli.getCpf().equals(armeiros.get(i).getCpf())){
                return cli;
            }
        }
	return null;
    }
    
    //insere
    public Cliente insCli(Cliente cli){
        try{
            tratCpfIgual(cli);
            clientes.add(cli);
            return cli;
	}
	catch(CodIgualException cie){
            return null;
	}
    }
    
    //exclui
    public Cliente excCli(Cliente cli){
        Cliente cli1 = consCliCpf(cli);
        if(cli1 != null){
            clientes.remove(cli1);
            return null;
        }else{
            return cli;
        }
    }
    
    //atualiza
    public Cliente altCliCpf(Cliente cli, String nome){
        for(int i = 0; i < clientes.size(); i++){
            if(cli.getCpf().equals(clientes.get(i).getCpf())){
                cli = clientes.get(i);
                cli.setNome(nome);
                clientes.set(i, cli);  
                return clientes.get(i);
            }
	}
        return null;
    }
    
    
    //Armeiro
    
    //consulta
    public Armeiro consArmCpf(Armeiro arm){
        for(int i = 0; i < armeiros.size(); i++){
            if(arm.getCpf().equals(armeiros.get(i).getCpf())){
                return armeiros.get(i);
            }
        }
        for(int i = 0; i < clientes.size(); i++){
            if(arm.getCpf().equals(clientes.get(i).getCpf())){
                return arm;
            }
        }
	return null;
    }
    
    //insere
    public Armeiro insArm(Armeiro arm){
        try{
            tratCpfIgual(arm);
            armeiros.add(arm);
            return arm;
	}
	catch(CodIgualException cie){
            return null;
	}
    }
    
    //exclui
    public Armeiro excArm(Armeiro arm){
        Armeiro arm1 = consArmCpf(arm);
        if(arm1 != null){
            armeiros.remove(arm1);
            return null;
        }else{
            return arm;
        }
    }
    
    //atualiza
    public Armeiro altArmCpf(Armeiro arm, String nome){
        for(int i = 0; i < armeiros.size(); i++){
            if(arm.getCpf().equals(armeiros.get(i).getCpf())){
                arm = armeiros.get(i);
                arm.setNome(nome);
                armeiros.set(i, arm);  
                return armeiros.get(i);
            }
	}
        return null;
    }
    
    
    //Oficina
    
    //consulta
    public Oficina consOfiCod(Oficina ofi){
        for(int i = 0; i < oficinas.size(); i++){
            if(ofi.getCod_oficina() == oficinas.get(i).getCod_oficina()){
                return oficinas.get(i);
            }
        }
	return null;
    }
    
    //insere
    public Oficina insOfi(Oficina ofi){
        try{
            tratRegCodIgual(ofi);
            oficinas.add(ofi);
            return ofi;
	}
	catch(CodIgualException cie){
            return null;
	}
    }
    
    //exclui
    public Oficina excOfi(Oficina ofi){
        Oficina ofi1 = consOfiCod(ofi);
        if(ofi1 != null){
            oficinas.remove(ofi1);
            return null;
        }else{
            return ofi;
        }
    }
    
    //atualiza
    public Oficina altOfiCod(Oficina ofi, String rua, int num, int cep){
        for(int i = 0; i < oficinas.size(); i++){
            if(ofi.getCod_oficina() == oficinas.get(i).getCod_oficina()){
                ofi = oficinas.get(i);
                ofi.getEndereco().setRua(rua);
                ofi.getEndereco().setNumero(num);
                ofi.getEndereco().setCep(cep);
                oficinas.set(i, ofi);  
                return oficinas.get(i);
            }
	}
        return null;
    }
    
    
    //Airsofts
    public int tipoAirsoftPeloRegistro(int reg){
        for(int i = 0; i < shotguns.size(); i++){
            if(reg == shotguns.get(i).getRegistro()){
                return 1;
            }
        }
        for(int i = 0; i < rifles.size(); i++){
            if(reg == rifles.get(i).getRegistro()){
                return 2;
            }
        }
        for(int i = 0; i < pistolas.size(); i++){
            if(reg == pistolas.get(i).getRegistro()){
                return 3;
            }
        }
	return 0;
    }
    
    //consulta
    public Shotguns consShotReg(Shotguns shot){
        for(int i = 0; i < shotguns.size(); i++){
            if(shot.getRegistro() == shotguns.get(i).getRegistro()){
                return shotguns.get(i);
            }
        }
        for(int i = 0; i < pistolas.size(); i++){
            if(shot.getRegistro() == pistolas.get(i).getRegistro()){
                return shot;
            }
        }
        for(int i = 0; i < rifles.size(); i++){
            if(shot.getRegistro() == rifles.get(i).getRegistro()){
                return shot;
            }
        }
	return null;
    }
    
    //insere
    public Shotguns insShot(Shotguns shot){
        try{
            tratRegCodIgual(shot);
            shotguns.add(shot);
            return shot;
	}
	catch(CodIgualException cie){
            return null;
	}
    }
    
    //atualiza
    public Shotguns altShot(Shotguns shot, String marca, String mecanismo, String modelo, String espalhamento, int canos){
        for(int i = 0; i < shotguns.size(); i++){
            if(shot.getRegistro() == shotguns.get(i).getRegistro()){
                shot = shotguns.get(i);
                shot.setMarca(marca);
                shot.setMecanismo(mecanismo);
                shot.setModelo(modelo);
                shot.setEspalhamento(espalhamento);
                shot.setQuantidadeCanos(canos);
                shotguns.set(i, shot);  
                return shotguns.get(i);
            }
	}
        return null;
    }
    
    //exclui
    public Shotguns excShot(Shotguns shot){
        Shotguns shot1 = consShotReg(shot);
        if(shot1 != null){
            shotguns.remove(shot1);
            return null;
        }else{
            return shot;
        }
    }
    
    
    //consulta
    public Rifles consRifReg(Rifles rif){
        for(int i = 0; i < shotguns.size(); i++){
            if(rif.getRegistro() == shotguns.get(i).getRegistro()){
                return rif;
            }
        }
        for(int i = 0; i < pistolas.size(); i++){
            if(rif.getRegistro() == pistolas.get(i).getRegistro()){
                return rif;
            }
        }
        for(int i = 0; i < rifles.size(); i++){
            if(rif.getRegistro() == rifles.get(i).getRegistro()){
                return rifles.get(i);
            }
        }
	return null;
    }
    
    //insere
    public Rifles insRif(Rifles rif){
        try{
            tratRegCodIgual(rif);
            rifles.add(rif);
            return rif;
	}
	catch(CodIgualException cie){
            return null;
	}
    }
    
    //atualiza
    public Rifles altRif(Rifles rif, String marca, String mecanismo, String modelo, String classe, String modo){
        for(int i = 0; i < rifles.size(); i++){
            if(rif.getRegistro() == rifles.get(i).getRegistro()){
                rif = rifles.get(i);
                rif.setMarca(marca);
                rif.setMecanismo(mecanismo);
                rif.setModelo(modelo);
                rif.setClasse(classe);
                rif.setModoDeTiro(modo);
                rifles.set(i, rif);  
                return rifles.get(i);
            }
	}
        return null;
    }
        
    //exclui
    public Rifles excRif(Rifles rif){
        Rifles rif1 = consRifReg(rif);
        if(rif1 != null){
            rifles.remove(rif1);
            return null;
        }else{
            return rif;
        }
    }
    
    
    //consulta
    public Pistolas consPistReg(Pistolas pist){
        for(int i = 0; i < shotguns.size(); i++){
            if(pist.getRegistro() == shotguns.get(i).getRegistro()){
                return pist;
            }
        }
        for(int i = 0; i < pistolas.size(); i++){
            if(pist.getRegistro() == pistolas.get(i).getRegistro()){
                return pistolas.get(i);
            }
        }
        for(int i = 0; i < rifles.size(); i++){
            if(pist.getRegistro() == rifles.get(i).getRegistro()){
                return pist;
            }
        }
	return null;
    }
    
    //insere
    public Pistolas insPist(Pistolas pist){
        try{
            tratRegCodIgual(pist);
            pistolas.add(pist);
            return pist;
	}
	catch(CodIgualException cie){
            return null;
	}
    }
    
    //atualiza
    public Pistolas altPist(Pistolas pist, String marca, String mecanismo, String modelo, String grip, boolean blowback){
        for(int i = 0; i < pistolas.size(); i++){
            if(pist.getRegistro() == pistolas.get(i).getRegistro()){
                pist = pistolas.get(i);
                pist.setMarca(marca);
                pist.setMecanismo(mecanismo);
                pist.setModelo(modelo);
                pist.setBlowback(blowback);
                pist.setTipoGrip(grip);
                pistolas.set(i, pist);  
                return pistolas.get(i);
            }
	}
        return null;
    }
        
    //exclui
    public Pistolas excPist(Pistolas pist){
        Pistolas pist1 = consPistReg(pist);
        if(pist1 != null){
            pistolas.remove(pist1);
            return null;
        }else{
            return pist;
        }
    }
      
    
    
    //Manutencao
    
    //consulta
    public Manutencao consManu(Manutencao manu){
        for(int i = 0; i < manutencoes.size(); i++){
            if(manu.getCodManutencao().equals(manutencoes.get(i).getCodManutencao())){
                return manutencoes.get(i);
            }
        }
        return null;
    }
    
    //insere
    public Manutencao insManu(Manutencao manu){
        try{
            tratCodIgual(manu);
            manutencoes.add(manu);
            return manu;
	}
	catch(CodIgualException cie){
            JOptionPane.showMessageDialog(null, "Codigo de manutencao ja existente", "cadastro de manutencao", JOptionPane.ERROR_MESSAGE);
            return null;
	}
    }
     
    //exclui
    public Manutencao excManu(Manutencao manu){
        Manutencao manu1 = consManu(manu);
        if(manu1 != null){
            manutencoes.remove(manu1);
            return null;
        }else{
            return manu;
        }
    }
    
    //atualiza
    public Manutencao altManu(Manutencao manu, Cliente cli, Armeiro arm, Oficina ofi, Shotguns shot){
        for(int i = 0; i < armeiros.size(); i++){
            if(manu.getCodManutencao().equals(manutencoes.get(i).getCodManutencao())){
                manu = manutencoes.get(i);
                manu.setArmeiro(arm);
                manu.setCliente(cli);
                manu.setOficina(ofi);
                
                manu.setShotguns(shot);
                manu.setPistolas(null);
                manu.setRifles(null);
                manutencoes.set(i, manu);  
                return manutencoes.get(i);
            }
	}
        return null;
    }
    //sobrecarregado
    public Manutencao altManu(Manutencao manu, Cliente cli, Armeiro arm, Oficina ofi, Rifles rif){
        for(int i = 0; i < armeiros.size(); i++){
            if(manu.getCodManutencao().equals(manutencoes.get(i).getCodManutencao())){
                manu = manutencoes.get(i);
                manu.setArmeiro(arm);
                manu.setCliente(cli);
                manu.setOficina(ofi);
                
                manu.setShotguns(null);
                manu.setPistolas(null);
                manu.setRifles(rif);
                manutencoes.set(i, manu);  
                return manutencoes.get(i);
                
            }
	}
        return null;
    }
    //sobrecarregado
    public Manutencao altManu(Manutencao manu, Cliente cli, Armeiro arm, Oficina ofi, Pistolas pist){
        for(int i = 0; i < armeiros.size(); i++){
            if(manu.getCodManutencao().equals(manutencoes.get(i).getCodManutencao())){
                manu = manutencoes.get(i);
                manu.setArmeiro(arm);
                manu.setCliente(cli);
                manu.setOficina(ofi);
                
                manu.setShotguns(null);
                manu.setPistolas(pist);
                manu.setRifles(null);
                manutencoes.set(i, manu);  
                return manutencoes.get(i);
                
            }
	}
        return null;
    }
    
    public void altStatus(Manutencao manu, String status){
        boolean flag = false;
        for(int i = 0; i < armeiros.size(); i++){
            if(manu.getCodManutencao().equals(manutencoes.get(i).getCodManutencao())){
                manu = manutencoes.get(i);
                manu.setStatus(status);
                JOptionPane.showMessageDialog(null, "Status alterado com sucesso", "altera status de manutencao", JOptionPane.INFORMATION_MESSAGE);
                flag = true;
            }
	}
        if(!flag){
            JOptionPane.showMessageDialog(null, "Manutencao nao encontrada", "altera status de manutencao", JOptionPane.ERROR_MESSAGE);
        }
    }
    
   
    
    //métodos get
    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Armeiro> getArmeiros() {
        return armeiros;
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

    public List<Shotguns> getShotguns() {
        return shotguns;
    }

    public List<Rifles> getRifles() {
        return rifles;
    }

    public List<Pistolas> getPistolas() {
        return pistolas;
    }

    public List<Manutencao> getManutencoes() {
        return manutencoes;
    }

    
    //tratamentos de excecoes
    
    public int tratNumberException(String tratando){
        int tratado;
        try{
            tratado = Integer.parseInt(tratando);
        }
        catch(NumberFormatException nfe){
            return -1;
        }
        return tratado;
    }
    
    
    public void tratCpfIgual(Cliente cli) throws CodIgualException{
        for(int i = 0; i < clientes.size(); i++){
            if(cli.getCpf().equals(clientes.get(i).getCpf())){
                throw new CodIgualException();
            }
        }
        for(int i = 0; i < armeiros.size(); i++){
            if(cli.getCpf().equals(armeiros.get(i).getCpf())){
                throw new CodIgualException();
            }
        }
    }
    //sobrecarregado
    public void tratCpfIgual(Armeiro arm) throws CodIgualException{
        for(int i = 0; i < clientes.size(); i++){
            if(arm.getCpf().equals(clientes.get(i).getCpf())){
                throw new CodIgualException();
            }
        }
        for(int i = 0; i < armeiros.size(); i++){
            if(arm.getCpf().equals(armeiros.get(i).getCpf())){
                throw new CodIgualException();
            }
        }
    }
    
    public void tratCodIgual(Manutencao manu)throws CodIgualException{
        for(int i = 0; i < manutencoes.size(); i++){
            if(manu.getCodManutencao().equals(manutencoes.get(i).getCodManutencao())){
                throw new CodIgualException();
            }
        }
    }
    
    public void tratRegCodIgual(Oficina ofi)throws CodIgualException{
        for(int i = 0; i < oficinas.size(); i++){
            if(ofi.getCod_oficina() == oficinas.get(i).getCod_oficina()){
                throw new CodIgualException();
            }
        }
    }
    //sobrecarregado
    public void tratRegCodIgual(Shotguns shot)throws CodIgualException{
        for(int i = 0; i < shotguns.size(); i++){
            if(shot.getRegistro()== shotguns.get(i).getRegistro()){
                throw new CodIgualException();
            }
        }
    }
    //sobrecarregado
    public void tratRegCodIgual(Rifles rif)throws CodIgualException{
        for(int i = 0; i < rifles.size(); i++){
            if(rif.getRegistro()== rifles.get(i).getRegistro()){
                throw new CodIgualException();
            }
        }
    }
    //sobrecarregado
    public void tratRegCodIgual(Pistolas pist)throws CodIgualException{
        for(int i = 0; i < pistolas.size(); i++){
            if(pist.getRegistro()== pistolas.get(i).getRegistro()){
                throw new CodIgualException();
            }
        }
    }
    
    
    public void tratStringInvalida(String palavra) throws StringInvalidaException{
        if(palavra.equals("")){
            throw new StringInvalidaException();
        }else if(palavra.charAt(0) == ' '){
            throw new StringInvalidaException();
        }
    }
}





