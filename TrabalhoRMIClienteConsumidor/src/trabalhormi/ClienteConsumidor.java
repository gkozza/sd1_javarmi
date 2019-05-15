/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormi;

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
public class ClienteConsumidor {

    public static void main(String[] args) {

        try {
            Registry r = LocateRegistry.getRegistry(6789);
            InterfaceServ obj = (InterfaceServ) r.lookup("ServidorTransfer");
            String nome = JOptionPane.showInputDialog("Digite o seu nome");
            String tipo_carro = JOptionPane.showInputDialog("Digite o tipo do carro");
            int max_pax = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero maximo de passageiros"));
            String origem = JOptionPane.showInputDialog("Informe a Cidade de Origem");
            String destino = JOptionPane.showInputDialog("Informe a Cidade Destino");
            float preco = Float.parseFloat(JOptionPane.showInputDialog("Quanto deseja pagar"));
            obj.getCotacoes(nome, origem, destino, tipo_carro, max_pax, preco);
            } catch (NotBoundException | RemoteException ex) {
            Logger.getLogger(ClienteConsumidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
