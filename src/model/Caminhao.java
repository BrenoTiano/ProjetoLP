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
public class Caminhao {

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
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
  private int id;   
  private String placa;
  private String modelo;
  private String chassi;

    public Caminhao() {
       id = 0;
       placa = new String();
       modelo = new String();
       chassi = new String();
    }

    public Caminhao(int id, String placa, String modelo, String chassi) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.chassi = chassi;
    }
  
  
}
