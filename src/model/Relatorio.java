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
public class Relatorio {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public String getDiario() {
        return diario;
    }

    public void setDiarios(String diario) {
        this.diario = diario;
    }


    private int id;
    private Usuario usuario;
    private Caminhao caminhao;
    private String diario;

    public Relatorio(int id, Usuario usuario, Caminhao caminhao, String diario) {
        this.id = id;
        this.usuario = usuario;
        this.caminhao = caminhao;
        this.diario = diario;
    }

    public Relatorio() {
        id = 0;
        usuario = new Usuario();
        caminhao = new Caminhao();
        diario = new String();
    }

    
}
