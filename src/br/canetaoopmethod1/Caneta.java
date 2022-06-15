/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.canetaoopmethod1;

/**
 *
 * @author Marce
 */
public class Caneta {
    
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String cor, String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = true;
        status();
    }
    
    public void status(){
        System.out.println("Sobre a caneta ");
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    public float getPonta(){
        return this.ponta;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    public String getCor(){
        return this.cor;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    
}
 