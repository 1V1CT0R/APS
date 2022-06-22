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
public class Consumo extends Casa{

    public Consumo(double tempoUsoMangueira, double qtdVezesUsoMangueira, double tempoBanho,
            double qtdBanhoDia, double qtdVezesAbrirTorneiraBanh,
            double qtdVezesAbrirTorneiraCoz,double qtdVezesAbrirTorneiraTan,
            double tempoAbrirTorneira, double qtdVezesDescarga,
            double tempoDescarga, double capacidadeLavadora, double qtdLavagemRoupa)
    {
        super(tempoUsoMangueira,qtdVezesUsoMangueira,qtdBanhoDia,tempoBanho,
                qtdVezesAbrirTorneiraBanh,qtdVezesAbrirTorneiraCoz,
                qtdVezesAbrirTorneiraTan,tempoAbrirTorneira,tempoDescarga,
                qtdVezesDescarga,qtdLavagemRoupa,capacidadeLavadora);
    }

    
    
    public String consumoDiarioMedioPessoa(){
        double calculoDoConsumoDeAgua = calculoUsoMangueira()+calcBanho()+ 
        calcGastoTorneiraBanh()+calcGastoTorneiraCoz()+calcGastoTorneiraTan()+
        calcDescarga()+calcLavagemRoupa();
        
        if(calculoDoConsumoDeAgua<=110){
            System.out.println("O consumo de água está ótimo");
        }
        else if(calculoDoConsumoDeAgua>110 && calculoDoConsumoDeAgua<=130){
            System.out.println("O consumo de água está adequado");
        }
        else if(calculoDoConsumoDeAgua>130 && calculoDoConsumoDeAgua<=155){
            System.out.println("O consumo de água está médio");
        }
        else if(calculoDoConsumoDeAgua>155 && calculoDoConsumoDeAgua<=185){
            System.out.println("O consumo de água está alto");
        }
        else{
            System.out.println("O consumo de água está muito alto");
        }
        return "Sendo o consumo diário médio dessa pessoa de %.2f litros de água".formatted(calculoDoConsumoDeAgua);
    
    }
}
