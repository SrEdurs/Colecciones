import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> listin = new HashMap<>();

        //Agregar elementos
        listin.put(609609609,"Pepe");
        listin.put(629629629,"Berta");
        listin.put(666666666,"Tito");
        listin.put(655987458,"Juan");
        listin.put(721547845,"Ana");

        //Recorrer (for each con .keySet())
        recorrer(listin);

        //Recorrer (con .forEach)
        recorrer2(listin);

        //Acceder con la clave
        System.out.println(listin.get(609609609));

        //Buscar
        System.out.println("listin.containsKey = " + listin.containsKey(609609609));
        System.out.println("listin.containsValue(\"Juan\") = " + listin.containsValue("Juan"));
        System.out.println("--------------------------");

        //Lista de valores
        System.out.println("listin.values() = " + listin.values());
        System.out.println("--------------------------");


        //Borrar
        listin.remove(609609609);
        recorrer(listin);

        //Reemplazar
        listin.replace(666666666,"Anya");
        recorrer(listin);
        listin.replace(666666666,"Anya","Tito");
        recorrer2(listin);




    }

    public static void recorrer (HashMap<Integer, String> hash){
        for(Integer valor : hash.keySet()){
            System.out.println("hash.get(" + valor + ") = " + hash.get(valor));
        }
        System.out.println("--------------------------");

    }

    public static void recorrer2(HashMap<Integer, String> hash){
        hash.forEach((telefono,nombre) ->{
            System.out.println("Telefono = " + telefono + " Nombre = " + nombre);
        });

        System.out.println("--------------------------");

    }

}
