/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormiservidor;

import java.rmi.RemoteException;
import java.util.Date;

/**
 *
 * @author gustavo.santos
 */
class ServImpl implements InterfaceServ {
    
    
    
    
    public ServImpl() {
    }

    @Override
    public void getCotacoes(String itinerario, Date data, String tipo_carro, int passageiros, float preco) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCotacoes(String nome, String tipo_carro, int passageiros_max, float preco) throws RemoteException {
        
        
    }
    
    
    
}
