package aplicacion;
// Trabajo de la Inmersión en Java de Alura Latam 2024/5/1
// Elaborado por: Junior Monge Calderon

import conceptos.Pelicula;
import conceptos.Serie;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Pelicula matrix = new Pelicula();
    Pelicula encanto = new Pelicula();
    Serie friends = new Serie();
    
    matrix.setNombre("Matrix");
    matrix.setFechaDeLanzamiento(1999);
    matrix.setTiempoDeDuracionEnMinutos(128);
    
    encanto.setNombre("encanto");
    encanto.setFechaDeLanzamiento(2007);
    encanto.setTiempoDeDuracionEnMinutos(135);
    
    friends.setNombre("Friends");
    friends.setTemporadas(10);
    friends.setEpisodios(22);
    friends.setDuracionEnMinutosPorEpisodio(30);
    
    matrix.muestraFichaTecnica();
    encanto.muestraFichaTecnica();
    friends.muestraFichaTecnica();
}
}