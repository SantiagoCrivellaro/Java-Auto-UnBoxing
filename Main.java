import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();

        // Autoboxing ( de int a Integer)
        numeros.add(10); // se convierte automaticamente en Integer.valueOf(10)

        // Unboxing ( de Integer a int)

        int num = numeros.get(0); // Se convierte automaticamente de Integer a int

        System.out.println("Numero :" + num); // Muestra : 10

        
    }
}