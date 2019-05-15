/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormiservidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo.santos
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            InterfaceServ servidor = new ServImpl();
            Registry r = LocateRegistry.createRegistry(6789);
            r.rebind("ServidorTransfer", servidor);
            System.out.println("Server Transfre is ON");
        } catch (RemoteException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
