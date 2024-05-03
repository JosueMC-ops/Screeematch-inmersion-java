/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceptos;

/**
 *
 * @author Usuario 2024
 */
public class Titulo {
     private String nombre;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private int fechaDeLanzamiento;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;
   
    
   public  void muestraFichaTecnica(){
        System.out.println("***Ficha Técnica***");
        System.out.println("Nombre de la Pelicula: "+ nombre);
        System.out.println("Fecha de la Pelicula: "+ fechaDeLanzamiento);
        System.out.println("Duracion de la Pelicula: "+ getTiempoDeDuracionEnMinutos());
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }
   
}
