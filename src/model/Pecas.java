/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author onerb
 */
public class Pecas {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the custo
     */
    public float getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }

    /**
     * @return the preco_venda
     */
    public float getPreco_venda() {
        return preco_venda;
    }

    /**
     * @param preco_venda the preco_venda to set
     */
    public void setPreco_venda(float preco_venda) {
        this.preco_venda = preco_venda;
    }
    private int id;
    private String descricao;
    private float custo;
    private float preco_venda;

    public Pecas() {
        id = 0;
        descricao = new String();
        custo = 0;
        preco_venda = 0;       
    }

    public Pecas(int id, String descricao, float custo, float preco_venda) {
        this.id = id;
        this.descricao = descricao;
        this.custo = custo;
        this.preco_venda = preco_venda;
    }
    
    
}
