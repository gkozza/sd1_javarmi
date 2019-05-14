/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhormiclientefornecedor;

/**
 *
 * @author gustavo.santos
 */
public class CarroCliente{
    String nome;
    String tipo;
    int max_passageiros;
    float preco;
    
    public CarroCliente() {}

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
