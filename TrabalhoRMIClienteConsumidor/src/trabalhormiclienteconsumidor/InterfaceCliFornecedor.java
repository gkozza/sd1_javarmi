/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormiclienteconsumidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author gustavo.santos
 */
public interface InterfaceCliFornecedor extends Remote{
        public void notificaMatch() throws RemoteException;
        public void negociacao() throws RemoteException;
}
