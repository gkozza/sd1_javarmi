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
            
            CarroCliente c = new CarroCliente();
            String nome_motorista = JOptionPane.showInputDialog("Por favor informe seu nome");
            c.setTipo(nome_motorista);         
            String tipo_carro = JOptionPane.showInputDialog("Digite o tipo do carro");
            c.setTipo(tipo_carro);
            int max_pax = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero maximo de passageiros"));
            c.setMax_passageiros(max_pax);
            float preco = Float.parseFloat(JOptionPane.showInputDialog("Qual o preço"));
            c.setPreco(preco);
            obj.setCotacoes(nome_motorista, tipo_carro, max_pax, preco);

            
        } catch (NotBoundException | RemoteException ex) {
            Logger.getLogger(ClienteFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
