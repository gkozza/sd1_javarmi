/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormi;

import java.util.Date;



/**
 *
 * @author gustavo.santos
 */
public class CarroCliente {
    private String nome_cliente_fornecedor;
    private String tipo;
    private int max_passageiros;
    private float preco;
    private String origem;
    private String destino;
    private Date data_inicio;
    private Date data_fim;

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }
    
    

    public String getNome_cliente_fornecedor() {
        return nome_cliente_fornecedor;
    }

    public void setNome_cliente_fornecedor(String nome_cliente_fornecedor) {
        this.nome_cliente_fornecedor = nome_cliente_fornecedor;
    }
    
    
    public CarroCliente(String nome_cliente_fornecedor, String tipo, int max_passageiros, float preco, String origem, String destino, Date data_inicio, Date data_fim) {
        this.nome_cliente_fornecedor= nome_cliente_fornecedor;
        this.max_passageiros = max_passageiros;
        this.tipo = tipo;
        this.preco = preco;
        this.origem = origem;
        this.destino = destino;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        
        
    }

    public CarroCliente(){
        
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMax_passageiros() {
        return max_passageiros;
    }

    /**
     *
     * @param max_passageiros
     */
    public void setMax_passageiros(int max_passageiros) {
        this.max_passageiros = max_passageiros;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
