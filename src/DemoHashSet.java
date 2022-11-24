import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {
    public static void main(String[] args) {

        //El HashSet no admite duplicados
        HashSet<Integer> numeros = new HashSet<Integer>();

        //Agregar elementos
        numeros.add(4);
        numeros.add(5);
        numeros.add(12);
        numeros.add(7);
        numeros.add(9);
        numeros.add(1);

        //Recorrer (Solo se puede con for each) (Los valores siempre salen ordenados)
        recorrer(numeros);

        //Eliminar
        numeros.remove(12);
        recorrer(numeros);

        // Borrar todos
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());

        recorreIterator(numeros);


    }

    public static void recorrer(HashSet<Integer> set){
        for(Integer valor : set){
            System.out.println("valor = " + valor);
        }

        System.out.println("-----------------------");

    }

    public static void recorreIterator(HashSet<Integer> array){
        System.out.println("---------------ITERATOR-----------------");

        //Iterator
        Iterator<Integer> iter = array.iterator();

        while(iter.hasNext()){
            System.out.println("iter.hasNext() = " + iter.hasNext());
        }
        System.out.println("----------------------------------------");
    }
}
