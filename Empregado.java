/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author 324149304
 */
public class Empregado {
    private String nome;
    private int idade;
    private double salario;
    private String name;
    
    public String getNome(){
        return this.nome;
        
    }
    public int getIdade(){
    return this.idade;
    }
    
    public double getSalario(){
    return this.salario;
    }
    
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public void setIdade(int idade){
      this.idade = idade;
      }
   
public void setSalario(double salario){
    this.salario=salario;
}

public Empregado(String nome,int idade,double salario){
    this.nome=nome;
    this.salario=salario;
    this.idade=idade;
}
public void promover(){
    if(this.idade>18){
        aumentarSalario(25);
        System.out.println("O Empregado " +this.nome+ " foi promovido");
    }else {
        System.out.println("O Empregado " +this.nome+ " nao possui idade suficiente");
    } 
}
public void aumentarSalario(double percentual){
    
    this.salario += salario*(percentual)/100;
}
     public void demitir(int motivo) {
        switch (motivo) {
            case 1: 
                System.out.println("O "+ this.name +" foi demitido por justa causa");
            case 2:
                double multa = 40 * this.salario / 100;
                System.out.println("O empregado deverá pagar " + multa + " de multa");
                break;
            case 3:
                if (this.salario > 1000 && this.salario < 2000) {
                    this.salario = 1500;
                } else if (this.salario > 2001 && this.salario < 3000) {
                    this.salario = 2500;
                } else if (this.salario > 3001 && this.salario < 4000) {
                    this.salario = 3500;
                } else {
                    this.salario = 4000;
                }   break;
            default:
                System.out.println("O empregado deverá cumprir aviso prévio");
                break;
        }
    }
    
    public void fazerAniversario() {
        this.idade++;
    }
}

