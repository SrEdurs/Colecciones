import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        //Crear un ArrayList String, ordenarlo e imprimirlo

        ArrayList <String> palabras = new ArrayList<String>();

        palabras.add("Eduardo");
        palabras.add("Escritorio");
        palabras.add("Ratón");
        palabras.add("Teclado");
        palabras.add("Monitor");
        palabras.add("Alfombra");
        recorrer(palabras);

        Collections.sort(palabras);
        recorrer(palabras);

    }

    public static void recorrer(ArrayList<String> array){
        for(int i = 0; i < array.size(); i++){
            System.out.println("palabras[" + i + "] = " + array.get(i));
        }
        System.out.println("----------------------------------------");
    }
}
