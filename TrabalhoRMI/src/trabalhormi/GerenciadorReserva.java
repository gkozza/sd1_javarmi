/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormi;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.santos
 */
public class GerenciadorReserva {

    private static final HashMap<String, CarroCliente> transfers = new HashMap<>();
    private static final HashMap<String, InteresseReserva> interesses = new HashMap<>();

    public void setTransfer(CarroCliente c) {
        System.out.println("CHAMOU O SET TRANSFER");
        GerenciadorReserva.transfers.put(c.getNome_cliente_fornecedor(), c);
        interesses.forEach((key, value) -> {
            System.out.println("Entrou no FOREACH");
            System.out.println(value.getNome() + value.getOrigem());
            if ((c.getDestino().equals(value.getDestino())) && (c.getOrigem().equals(value.getOrigem())) && (c.getMax_passageiros() >= value.getPassageiros()) && (c.getTipo().equals(value.getTipo_carro()))) {
                System.out.println("Deu match! ");
                System.out.println("O usuário" + value.getNome() + " está esperando por voce a um preco de " + value.getPreco());
                if (value.getPreco() < c.getPreco()) {
                    System.out.println("Deu match! ");
                    System.out.println("O usuário" + value.getNome() + " está esperando por voce a um preco de " + value.getPreco() + " que é menor do que voce deseja");
                    float preco = Float.parseFloat(JOptionPane.showInputDialog("Negociar preço para"));
                    c.setPreco(preco);
                } else {
                    System.out.println("Deu match! ");
                    System.out.println("O usuário" + value.getNome() + " está esperando por voce a um preco de " + value.getPreco());
                }

                return;
            }
        });

    }

    public void setInteresse(InteresseReserva r) {
        System.out.println("CHAMOU O SET INTERESSE");
        GerenciadorReserva.interesses.put(r.getNome(), r);
        transfers.forEach((key, value) -> {
            if ((r.getDestino().equals(value.getDestino())) && (r.getOrigem().equals(value.getOrigem())) && (r.getPassageiros() <= value.getMax_passageiros()) && (r.getTipo_carro().equals(value.getTipo()))) {
                System.out.println("Deu match! ");
                System.out.println("O transfer" + value.getNome_cliente_fornecedor() + " está esperando por voce a um preco de " + value.getPreco());
                return;
            }
        });
    }

}
