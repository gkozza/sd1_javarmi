/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormiservidor;

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

    @Override
    public void getCotacoes(String itinerario, Date data, String tipo_carro, int passageiros, float preco) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // TODO voltar a data de inicio e fim
    public void setCotacoes(String nome, String tipo, int max_passageiros, float preco, String origem, String destino) throws RemoteException {
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
