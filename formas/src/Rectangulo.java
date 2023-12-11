/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Rectangulo extends Forma {
    private double base;
    private double altura;
    
    public Rectangulo(String nombre, double base, double altura ) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return base * altura;
    }
    
}
