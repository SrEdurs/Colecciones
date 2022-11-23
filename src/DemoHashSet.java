import java.util.HashSet;

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
    }

    public static void recorrer(HashSet<Integer> set){
        for(Integer valor : set){
            System.out.println("valor = " + valor);
        }

        System.out.println("-----------------------");

    }
}
