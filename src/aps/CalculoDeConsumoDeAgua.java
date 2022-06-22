/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class CalculoDeConsumoDeAgua {

    public static void main(String[] args) {
        // Exemplo
        Consumo c1 = new Consumo(0,0,10,3,3,5,2,6,3,4.8,10,3);
        System.out.println(c1.consumoDiarioMedioPessoa());
    }
    
}
/* Referências Bibliográficas
https://site.sabesp.com.br/site/interna/Default.aspx?secaoId=184
https://www.saaesorocaba.com.br/calculadora-de-consumo-de-agua/
*/
