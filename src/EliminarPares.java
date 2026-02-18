import java.util.*;

public class EliminarPares {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean coninuar = true;


        System.out.println("Introduce los numeros de la lista (usa el 0 para salir)");

        while (coninuar == true) {
            int n = sc.nextInt();
            numeros.add(n);
            if (n == 0) {
                coninuar = false;
            }

            Iterator<Integer> it = numeros.listIterator();
            while (it.hasNext()) {
                int valor = it.next();
                if (valor % 2 == 0) {
                    it.remove();
                }
            }
            System.out.println("lista de numeros impares: " + numeros);
        }
    }
}
