/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author oscar
 */
public class Perro extends Mascotas implements IMascotas{
    private int nivelEntrenamiento;

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public Perro() {
    }
    
    public Perro(int nivelEntrenamiento, String nombre, int edad, String raza, String color) {
        super(nombre, edad, raza, color);
        this.nivelEntrenamiento = nivelEntrenamiento;
    }
    
    

    @Override
    public void calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String datos (){
        return "La mascota se llama "+getNombre()+", es de raza "+getRaza()+ ", es de color " +getColor() + ", tiene "+getEdad()+" años,  \n"+"y tiene un nivel "+getNivelEntrenamiento()+" de entrenamiento.";
    }

}
