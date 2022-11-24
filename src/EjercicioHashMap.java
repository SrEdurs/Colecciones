import javax.swing.*;
import java.util.HashMap;

public class EjercicioHashMap {
    public static void main(String[] args) {
        //Partiendo de una estructura/lista email -> nombre
        //Crear un método de búsqueda que localice el email a partir del nombre
        //Y otro que localice le nombre a partir del email

        //Leer dato (String)
        String dato = JOptionPane.showInputDialog(null,"Inttroduce un nombre o email:");

        HashMap<String,String> emails = new HashMap<>();

        emails.put("juan@eoi.es","Juan");
        emails.put("alicia@eoi.es","Alicia");
        emails.put("aitor@eoi.es","Aitor");
        emails.put("fran@eoi.es","Aitor");
        emails.put("teresa@eoi.es","Teresa");

        //Si contiene @ es un email -> buscas por mail
        //Si no contiene, buscas por nombre
        buscar(dato,emails);


    }

    public static void buscar(String dato, HashMap<String,String>mail){
        if(dato.contains("@")){ //es un email
            System.out.println("correo = " + dato + " -> nombre = " + mail.get(dato));

        }else{ //es un nombre

            for(String correo : mail.keySet()){
                String nombre = mail.get(correo);

                if(nombre.equals(dato)){
                    System.out.println("nombre = " + nombre + " -> email = " + correo);;
                }
            }

        }
    }
}
