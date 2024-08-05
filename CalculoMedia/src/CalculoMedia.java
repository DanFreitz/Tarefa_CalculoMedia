/**
 * @author Daniel.Augusto
 *
 */
public class CalculoMedia {

    public static void main(String args[]) {
        CalculoMedia();
        Divisao();
    }

    public static void Divisao() {
        System.out.println("**** Divisao ****");
        int num1 = 40;
        int num2 = 40;

        int num3 = (40 + 40)/4;
        System.out.println(num3);
    }

    private static void CalculoMedia() {

        System.out.println("**** CalculoMedia ****");
        int num1 = 33;
        int num2 = 27;
        boolean  Nota1 = num1 > num2;
        System.out.println("Nota1: " + Nota1);

        boolean Nota2 = num1 == num2;
        System.out.println("Nota2: " + Nota2);

        boolean Nota3 = num1 != num2;
        System.out.println("Nota3: " +Nota3);

        boolean Nota4 = num1 >= num2;
        System.out.println("Nota4: " +Nota4);}
}










