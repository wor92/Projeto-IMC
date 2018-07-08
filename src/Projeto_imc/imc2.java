/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_imc;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author wellt
 */
public class imc2 {
    
    public static void main(String[]args){
        
        try {
            
            JOptionPane.showMessageDialog(null, "Testando a conexao");
            Connection con = new ConnectionFactory().conecta();
            JOptionPane.showMessageDialog(null, "Esta conectado");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro" + e);
            
        }
        
        
        
    }
    
}
