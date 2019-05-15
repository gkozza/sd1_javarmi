/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 *
 * @author gustavo.santos
 */
class ServImpl extends UnicastRemoteObject implements InterfaceServ  {
    
    
    
    
    public ServImpl() throws RemoteException{
    }

    public void getCotacoes(String nome, String origem, String destino ,String tipo_carro, int passageiros, float preco) throws RemoteException {
        InteresseReserva interesse = new InteresseReserva();
        interesse.setNome(nome);
        interesse.setDestino(destino);
        interesse.setOrigem(origem);
        interesse.setPreco(preco);
        interesse.setPassageiros(passageiros);
        interesse.setTipo_carro(tipo_carro);
        GerenciadorReserva gerenciador = new GerenciadorReserva();
        
    
    }

    // TODO voltar a data de inicio e fim
    @Override
    public void setCotacoes(String nome, String tipo, int max_passageiros, float preco, String origem, String destino) throws RemoteException {
        System.out.println("CHAMOU O SET COTACOES");
        CarroCliente c = new CarroCliente();
        c.setNome_cliente_fornecedor(nome);
        c.setTipo(tipo);
        c.setOrigem(origem);
        c.setDestino(destino);
        c.setMax_passageiros(max_passageiros);
        //c.setData_inicio(data_inicio);
        //c.setData_fim(data_fim);
        GerenciadorReserva gerenciador = new GerenciadorReserva();
        gerenciador.setTransfer(c); 
    }
    
    public CarroCliente getCotacao(CarroCliente c){
        CarroCliente carroCliente = new CarroCliente();
        carroCliente = c;
        return carroCliente;
    }

    
    
    
    
    
    
}
