import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<Integer>();

        //Agregar elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);

        System.out.println("numeros.size = " + numeros.size());
        System.out.println("----------------------------------------");

        //Recorrer ArrayList con for
        /*for(int i = 0; i < numeros.size(); i++){
            System.out.println("numeros[" + i + "] = " + numeros.get(i));
        }
        System.out.println("----------------------------------------");

        //Recorrer con for each
        for(Integer valor : numeros){
            System.out.println("valor = " + valor);
        }*/

        //Recorrer con un metodo
        recorrer(numeros);

        //Agregar un elemento en un indice determinado (inserta)
        numeros.add(2,11);
        System.out.println("numeros.size = " + numeros.size());
        recorrer(numeros);

        //Agregar elementos al final
        numeros.add(10);
        numeros.add(1);

        //Modificar un valor de un elemento en un indice determinado
        numeros.set(1,23);
        recorrer(numeros);

        //Eliminar un elemento
        numeros.remove(2);
        System.out.println("numeros.size = " + numeros.size());
        recorrer(numeros);

        //Buscar un elemento
        System.out.println("numeros.indexOf(3) = " + numeros.indexOf(3)); //Primero con 3
        System.out.println("numeros.lastIndexOf(3) = " + numeros.lastIndexOf(3)); //Ultimo con 3
        System.out.println("numeros.indexOf(57) = " + numeros.indexOf(57)); //-1 si no existe

        System.out.println("----------------------------------------");

        //Ordenar
        Collections.sort(numeros);
        recorrer(numeros);

        //Contiene un elemento
        System.out.println("numeros.contains(7) = " + numeros.contains(7)); //si está, true
        System.out.println("numeros.contains(57) = " + numeros.contains(57));//no está, false


        //Está vacío?
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty()); //false si no está vacío
        numeros.clear(); //borramos todos los valores
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty()); //true al estar vacío

        recorreIterator(numeros);





    }

    public static void recorrer(ArrayList<Integer> array){
        for(int i = 0; i < array.size(); i++){
            System.out.println("numeros[" + i + "] = " + array.get(i));
        }
        System.out.println("----------------------------------------");
    }

    public static void recorreIterator(ArrayList<Integer> array){
        System.out.println("---------------ITERATOR-----------------");

        //Iterator
        Iterator<Integer> iter = array.iterator();

        while(iter.hasNext()){
            System.out.println("iter.hasNext() = " + iter.hasNext());
        }
        System.out.println("----------------------------------------");
    }
}
