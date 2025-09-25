import java.util.Scanner;

//1. Sistema de Aterrizaje Asistido (Aterrizaje en Múltiples Pistas)
//Crea un programa para una nave espacial que se aproxima a un planeta con múltiples pistas de
//aterrizaje. El sistema debe pedir al usuario que introduzca el número de pista (int). Si el número
//está entre 1 y 5, el sistema debe informar que el aterrizaje es seguro. Si el número es 0, la operación
//debe cancelarse. Para cualquier otro valor, debe indicar que la pista no es válida y seguir pidiendo
//un número de pista hasta que se introduzca un valor válido o se cancele la operación. Usa un bucle
//do-while y una función que valide el número de pista

//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int pistaUsuario;
//
//        do {
//            System.out.println("Introduza el número de pista: ");
//            pistaUsuario = sc.nextInt();
//
//            if (pistaUsuario >= 1 && pistaUsuario <=5) {
//                System.out.println("Aterrizaje es seguro.");
//            } else if (pistaUsuario == 0){
//                System.out.println("Operación cancelada.");
//                break;
//            } else{
//                System.out.println("Pista no válida.");
//            }
//        }
//
//        while (!esPistaValida(pistaUsuario));
//    }
//
//    public static boolean esPistaValida (int pista){
//        if (pista >= 0 && pista <= 5){
//            return true;
//        }
//        return false;
//
//    }
//}

//2. Control de Nivel de Oxígeno
//Desarrolla una función llamada comprobarNivelOxigeno que reciba un porcentaje de
//oxígeno (int). La función debe imprimir "Nivel óptimo" si el porcentaje está entre 80% y 100%,
//"Nivel bajo, se requiere reabastecimiento" si está entre 40% y 79%, y "Nivel crítico, evacuación de
//la cabina" si es inferior a 40%. En el programa principal, pide al usuario que ingrese el nivel de
//oxígeno y llama a la función para evaluar el estado. Repite el proceso con un bucle for 3 veces
//para simular múltiples lecturas.

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite el número de oxigenio: ");
//
//
//        for (int i = 1; i <= 3; i++) {
//            int porcentajeOxigenio = sc.nextInt();
//            comprobarNivelOxigeno(porcentajeOxigenio);
//        }
//
//    }
//    public static void comprobarNivelOxigeno(int porcentajeOxigenio){
//            if (porcentajeOxigenio >= 80 && porcentajeOxigenio <= 100) {
//                System.out.println("Nivel óptimo");
//            } else if (porcentajeOxigenio >= 40 && porcentajeOxigenio <= 79) {
//                System.out.println("Nivel bajo,se requiere reabastecimiento");
//                } else {
//                    System.out.println("Nivel crítico,evacuación de la cabina.");
//                }
//    }
//}

//3. Simulación de Recolección de Meteoritos
//Imagina que una nave de recolección de meteoritos debe recoger 10 meteoritos. Crea una función
//recolectarMeteoritos que tome como argumento el número de meteoritos a recolectar
//(int). Dentro de la función, usa un bucle for para simular la recolección, imprimiendo un
//mensaje por cada meteorito recogido y mostrando el progreso total (ej: "Meteorito 1 de 10
//recogido. Progreso: 10%"). Al finalizar el bucle, imprime "Misión de recolección completada"

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
public static recolectarMeteoritos (int Meteoritos){
    for(int i=1; i<10; i++){
        System.out.println("Progreso:" + "%");
    }
    System.out.println();
    {

    }

}


