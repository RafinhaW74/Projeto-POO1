//Rafael Munhoz Castro

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafin
 */
public class StringInvalidaException extends Exception{
    public void msgAlerta(){
        JOptionPane.showMessageDialog(null, "O conteúdo digitado não deve começar com espaços ou estar em branco", "mensagem de correcao de string", JOptionPane.ERROR_MESSAGE);
    }
}
