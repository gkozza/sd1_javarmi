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
public class InteresseReserva {
    private String nome;
    private String origem;
    private String destino;
    private Date data_inicio;
    private Date data_fim;
    private float preco;
    private int passageiros;
    private String tipo_carro;
    
    public InteresseReserva(String nome, String origem, String destino, float preco, int passageiros, String tipo_carro){
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
        this.passageiros = passageiros;
        this.tipo_carro = tipo_carro;
        this.nome = nome;
    }

    InteresseReserva() {
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public String getTipo_carro() {
        return tipo_carro;
    }

    public void setTipo_carro(String tipo_carro) {
        this.tipo_carro = tipo_carro;
    }
    
    
    
    
            
    
}
