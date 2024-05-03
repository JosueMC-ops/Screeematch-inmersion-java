package aplicacion;
// Trabajo de la Inmersión en Java de Alura Latam 2024/5/1
// Elaborado por: Junior Monge Calderon

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Pelicula Matrix");
        Scanner in = new Scanner(System.in);
        
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                          La mejor pelicula del fin del milenio
                          """;
        double mediaEvalucionesUsuario = 0;
        int j = 0;
        
        System.out.println("Bienvenidos a la Inmersion en Java");
        System.out.println("Pelicula: "+nombre);
        System.out.println("Fecha de lanzamiento: "+ fechaDeLanzamiento);
        System.out.println("La evaluacion de la pelicula: "+ evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        
        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        }else{
            System.out.println("Pelicula Retro que vale la pena ver");
        }
        
        for (int i=0; i<3; i++){
            System.out.println("Ingresa la nota o evaluacion que le daria a Matrix");
            double notaMatrix = in.nextDouble();
            mediaEvalucionesUsuario += notaMatrix;
        }
        
        System.out.println("Con un While ");
        
        while (j<3){ 
            System.out.println("Ingresa la nota o evaluacion que le daria a Matrix");
            double notaMatrix = in.nextDouble();
            mediaEvalucionesUsuario += notaMatrix; 
            j++;
        }
        System.out.println("La media de la pelicula"+ "Matrix calculado por el usuario: "+ mediaEvalucionesUsuario );
    }
    
}
