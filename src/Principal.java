import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        int contador = 0;

        for (Integer number: numbers) {

            if (number > 10) {

                contador++;

            }

        }

        System.out.println(contador);

    }

}
