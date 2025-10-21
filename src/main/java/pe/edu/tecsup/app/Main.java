package pe.edu.tecsup.app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int suma = obtenerSuma(5);
        System.out.println(suma);

    }
    */

    public static int obtenerSuma(int n) {

        if(n < 0)
        {
            throw new IllegalArgumentException("El numero debe no debe ser negativo.");
        }

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // Nuevo cambio fix 003
}