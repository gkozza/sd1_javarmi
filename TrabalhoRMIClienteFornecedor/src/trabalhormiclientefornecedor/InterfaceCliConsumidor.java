/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormiclientefornecedor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author gustavo.santos
 */
public interface InterfaceCliConsumidor extends Remote{
        public void notificaDisponibilidade () throws RemoteException;    

}
