/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 *
 * @author gustavo.santos
 */
public interface InterfaceServ extends Remote{
    public void getCotacoes(String nome,String origem, String destino, String tipo_carro, int passageiros, float preco) throws RemoteException;
    //voltar data inicio e data fim
    public void setCotacoes(String nome, String tipo, int max_passageiros, float preco, String origem, String destino) throws RemoteException;
    
    
}
