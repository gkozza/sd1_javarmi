/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormiclientefornecedor;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.santos
 */
public class ClienteFornecedor {
    
    public static void main(String[] args) {
       
        try {
            Registry r = LocateRegistry.getRegistry(6789);
            InterfaceServ obj = (InterfaceServ) r.lookup("ServidorTransfer");      
            String nome_motorista = JOptionPane.showInputDialog("Por favor informe seu nome");
            String tipo_carro = JOptionPane.showInputDialog("Digite o tipo do carro");
            int max_pax = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero maximo de passageiros"));
            float preco = Float.parseFloat(JOptionPane.showInputDialog("Qual o preço"));
            String origem = JOptionPane.showInputDialog("Informe a Cidade de Origem");
            String destino = JOptionPane.showInputDialog("Informe a Cidade Destino");
            //Date data_inicio = Date.parse(JOptionPane.showInputDialog("Por favor informe seu nome"));
            
            obj.setCotacoes(nome_motorista, tipo_carro, max_pax, preco, origem, destino);
        } catch (NotBoundException | RemoteException ex) {
            Logger.getLogger(ClienteFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
