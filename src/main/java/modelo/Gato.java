/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author oscar
 */
public class Gato extends Mascotas implements IMascotas{

    public boolean isLibreToxoplasmosis() {
        return libreToxoplasmosis;
    }

    public void setLibreToxoplasmosis(boolean libreToxoplasmosis) {
        this.libreToxoplasmosis = libreToxoplasmosis;
    }
    private boolean libreToxoplasmosis;

    public Gato() {
    }

    public Gato(boolean libreToxoplasmosis, String nombre, int edad, String raza, String color) {
        super(nombre, edad, raza, color);
        this.libreToxoplasmosis = libreToxoplasmosis;
    }
    
    public String datos (){
        boolean conf=isLibreToxoplasmosis();
        String mes;
        if(conf==true){
            mes="libre de toxoplasmosis.";
        }else{
            mes="con toxoplasmosis.";
        }
        return "La mascota se llama "+getNombre()+", es de raza "+getRaza()+ ", es de color " +getColor() + ", tiene "+getEdad()+" años,  \n"+"está "+mes;
    }

    @Override
    public void calcularTotal() {
        
    }
    
}
