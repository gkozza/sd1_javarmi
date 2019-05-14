/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormiclienteconsumidor;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo.santos
 */
public class ClienteConsumidor {

    public static void main(String[] args) {

        try {
            Registry r = LocateRegistry.getRegistry(6789);
            InterfaceServ obj = (InterfaceServ) r.lookup("ServidorTransfer");
            while (true) {
                obj.getCotacoes(null, null, null, 5, 10);
            }
        } catch (NotBoundException | RemoteException ex) {
            Logger.getLogger(ClienteConsumidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
