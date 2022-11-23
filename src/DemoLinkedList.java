import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<Integer>();

        //Agregar elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(1);
        numeros.add(12);
        recorrer(numeros);

        //Añadir elementos en un indice determinado
        numeros.add(2,23); //Al final sería sin indicar el indice
        recorrer(numeros);

        //Especificos de LinkedList
        numeros.addFirst(56); //Añade al inicio
        numeros.addLast(48); //Añade al final
        recorrer(numeros);

        //Ordenar
        Collections.sort(numeros);
        recorrer(numeros);

        //Eliminar
        numeros.remove(3);
        recorrer(numeros);

        numeros.removeFirst();
        numeros.removeLast();
        recorrer(numeros);

        //Buscar
        System.out.println("numeros.indexOf(5) = " + numeros.indexOf(5));
        System.out.println("numeros.indexOf(80) = " + numeros.indexOf(80));
        System.out.println("numeros.indexOf(5) = " + numeros.indexOf(5));
        System.out.println("numeros.contains(5) = " + numeros.contains(5));
        System.out.println("numeros.contains(50) = " + numeros.contains(50));




    }

    public static void recorrer(LinkedList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println("numeros[" + i + "] = " + list.get(i));
        }
        System.out.println("----------------------------------------");
    }
}
