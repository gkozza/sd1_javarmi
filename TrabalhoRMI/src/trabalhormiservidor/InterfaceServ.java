/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormiservidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 *
 * @author gustavo.santos
 */
public interface InterfaceServ extends Remote{
    public void getCotacoes(String itinerario, Date data, String tipo_carro, int passageiros, float preco) throws RemoteException;
    public void setCotacoes(String nome, String tipo_carro, int passageiros_max, float preco) throws RemoteException;
    
}
