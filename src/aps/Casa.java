/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aps;

/**
 *
 * @author Victor
 */
/* 
    As variáveis qtdLavagemRoupa, qtdVezesAbrirTorneiraTan e tempoUsoMangueira 
tem que receber os valores em média de 1 semana de uso, sendo o tempo em minuto.
As variáveis tempoAbrirTorneira e tempoDescarga tem que ser dadas em segundo/vezDeUso
A variável tempoBanho tem que receber os valores em min/vezDeUso.
As outras variáveis de quantidade tem que receber o valor em 1 dia de uso.
A variável capacidadeLavadora tem que receber o valor em kg.
*/
public class Casa{
    private double tempoUsoMangueira;
    private double qtdVezesUsoMangueira;
    private double qtdBanhoDia;
    private double tempoBanho;
    private double qtdVezesAbrirTorneiraBanh;
    private double qtdVezesAbrirTorneiraCoz;
    private double qtdVezesAbrirTorneiraTan;
    private double tempoAbrirTorneira;
    private double qtdVezesDescarga;
    private double tempoDescarga;
    private double qtdLavagemRoupa;
    private double capacidadeLavadora;
    
    public Casa(double tempoUsoMangueira, double qtdVezesUsoMangueira, double tempoBanho, double qtdBanhoDia, double qtdVezesAbrirTorneiraBanh, double qtdVezesAbrirTorneiraCoz, double qtdVezesAbrirTorneiraTan, double tempoAbrirTorneira, double qtdVezesDescarga, double tempoDescarga, double capacidadeLavadora, double qtdLavagemRoupa){
        this.tempoUsoMangueira = tempoUsoMangueira;
        this.qtdVezesUsoMangueira = qtdVezesUsoMangueira;
        this.qtdBanhoDia = qtdBanhoDia;
        this.tempoBanho = tempoBanho;
        this.qtdVezesAbrirTorneiraBanh = qtdVezesAbrirTorneiraBanh;
        this.qtdVezesAbrirTorneiraCoz = qtdVezesAbrirTorneiraCoz;
        this.qtdVezesAbrirTorneiraTan = qtdVezesAbrirTorneiraTan;
        this.tempoAbrirTorneira = tempoAbrirTorneira;
        this.tempoDescarga = tempoDescarga;
        this.qtdVezesDescarga = qtdVezesDescarga;
        this.qtdLavagemRoupa = qtdLavagemRoupa;
        this.capacidadeLavadora = capacidadeLavadora;
    }
    
    public double getTempoUsoMangueira(){
        return this.tempoUsoMangueira;
    }
    
    public void setTempoUsoMangueira(double tempoUsoMangueira){
        this.tempoUsoMangueira = tempoUsoMangueira;
    }
    
    public double getQtdVezesUsoMangueira(){
        return this.qtdVezesUsoMangueira;
    }
    
    public void setQtdVezesUsoMangueira(double qtdVezesUsoMangueira){
        this.qtdVezesUsoMangueira = qtdVezesUsoMangueira;
    }
    
    public double calculoUsoMangueira(){
        double usoMangueira = this.getTempoUsoMangueira()*this.getQtdVezesUsoMangueira()*186/10/7;
        return usoMangueira;
    }
    
    public double getQtdLavagemRoupa(){
        return this.qtdLavagemRoupa;
    }

    public void setQtdLavagemRoupa(double qtdLavagemRoupa) {
        this.qtdLavagemRoupa = qtdLavagemRoupa;
    }

    public double getCapacidadeLavadora(){
        return this.capacidadeLavadora;
    }

    public void setCapacidadeLavadora(double capacidadeLavadora){
        this.capacidadeLavadora = capacidadeLavadora;
    }
    
    public double calcLavagemRoupa(){
        double lavadora = this.getQtdLavagemRoupa()*this.getCapacidadeLavadora()*135/5/7;
        return lavadora;
    }
    
    public double getQtdBanhoDia() {
        return this.qtdBanhoDia;
    }
    
    public void setQtdBanhodia(double qtdBanhoDia) {
        this.qtdBanhoDia = qtdBanhoDia;
    }

    public double getTempoBanhoMin() {
        return this.tempoBanho;
    }

    public void setTempoBanhoMin(double tempoBanho) {
        this.tempoBanho = tempoBanho;
    }
    
    public double calcBanho(){
        double banho = this.getTempoBanhoMin()*this.getQtdBanhoDia()*90/15;
        return banho;
    }
    
    public double getQtdVezesAbrirTorneiraBanh(){
        return this.qtdVezesAbrirTorneiraBanh;
    }
    
    public void setQtdVezesAbrirTorneiraBanh(double qtdVezesAbrirTorneira){
        this.qtdVezesAbrirTorneiraBanh = qtdVezesAbrirTorneira;
    }
    
    public double calcGastoTorneiraBanh(){
        double banheiro = this.getQtdVezesAbrirTorneiraBanh()*this.getTempoAbrirTorneira()*12/5/60;
        return banheiro;
    }
    
    public double getQtdVezesAbrirTorneiraCoz(){
        return this.qtdVezesAbrirTorneiraCoz;
    }
    
    public void setQtdVezesAbrirTorneiraCoz(double qtdVezesAbrirTorneiraCoz){
        this.qtdVezesAbrirTorneiraCoz = qtdVezesAbrirTorneiraCoz;
    }
    
    public double calcGastoTorneiraCoz(){
        double cozinha = this.getQtdVezesAbrirTorneiraCoz()*this.getTempoAbrirTorneira()*117/15/60;
        return cozinha;
    }
    
    public double getQtdVezesAbrirTorneiraTan(){
        return this.qtdVezesAbrirTorneiraTan;
    }
    
    public void setQtdVezesAbrirTorneiraTan(double qtdVezesAbrirTorneiraTan){
        this.qtdVezesAbrirTorneiraTan = qtdVezesAbrirTorneiraTan;
    }
    
    public double calcGastoTorneiraTan(){
        double tanque = this.getQtdVezesAbrirTorneiraTan()*this.getTempoAbrirTorneira()*279/15/60;
        return tanque;
    }
    
    public double getTempoAbrirTorneira(){
        return this.tempoAbrirTorneira;
    }
    
    public void setTempoAbrirTorneira(double tempoAbrirTorneira){
        this.tempoAbrirTorneira = tempoAbrirTorneira;
    }
    
    public double getQtdVezesDescarga(){
        return this.qtdVezesDescarga;
    }
    
    public void setQtdVezesDescarga(double qtdVezesDescarga){
        this.qtdVezesDescarga = qtdVezesDescarga;
    }
    
    public double getTempoDescarga(){
        return this.tempoDescarga;
    }
    
    public void setTempoDescarga(double tempoDescarga){
        this.tempoDescarga = tempoDescarga;
    }
    
    public double calcDescarga(){
        double descarga = this.getTempoDescarga()*this.getQtdVezesDescarga()*12/6;
        return descarga;
    }
}
