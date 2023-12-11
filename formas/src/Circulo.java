/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
 class Circulo extends Forma {
     private doule radio; 
     
     public Circulo(String nombre, duble radio) {
         super(nombre);
         this.radio = radio;
     }
     
     public double calcularArea() {
         return Math.PI * Math.pov( radio, 2);s
     }
    
}
