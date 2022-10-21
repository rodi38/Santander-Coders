package github.rodrigo;

import java.util.Scanner;

public class ExNumeroDaLetra {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }
    public static void numeroDaLetra4() {
        System.out.println( scanner.next().toUpperCase().charAt(0) -64);
    }
    public static void numeroDaLetra3() {
        char letra = scanner.next().toUpperCase().charAt(0);
        for (int i = 1, contador = 65; i <= 26; i++, contador++) {
            if(letra == contador){
                System.out.println(i);
                break;
            }
        }
    }
    public static void numeroDaLetra2() {
        char letra = scanner.next().toUpperCase().charAt(0);
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alfabeto.length() ; i++) {
            if (letra == alfabeto.charAt(i)){
                System.out.println(i+1);
            }
        }
    }
    public static void numeroDaLetra() {

        String[] alfabeto = new String[]{"A","B","C","D","E","F",
                "G","H","I","J","K","L","M","N","O","P","Q","R","S",
                "T","U","V","W","X","Y","Z"};
        String entrada = scanner.next().toUpperCase();
        int[] alfabetoEmNumeros = new int[alfabeto.length];
        for (int i = 0; i <alfabetoEmNumeros.length ; i++) {
            alfabetoEmNumeros[i] = i+1;
        }
        for (int i = 0; i < alfabeto.length; i++) {
            if(entrada.equals(alfabeto[i])){
                System.out.println(alfabetoEmNumeros[i]);
            }
        }
    }
}
