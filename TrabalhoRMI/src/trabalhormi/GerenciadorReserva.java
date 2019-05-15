/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormi;

import java.util.HashMap;

/**
 *
 * @author gustavo.santos
 */
public class GerenciadorReserva {
    private final HashMap<String,CarroCliente> transfers = new HashMap<>();
    
    
    public void setTransfer(CarroCliente c){
        this.transfers.put(c.getNome_cliente_fornecedor(), c);
        System.out.println("É o louco do " + c.getNome_cliente_fornecedor());
    }
    
    
}
