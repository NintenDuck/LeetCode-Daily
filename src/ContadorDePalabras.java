/*
    Problema: Contador de Palabras
    Escribe un programa que solicite al usuario ingresar una cadena de texto
     y luego cuente el número de palabras en esa cadena.
     Considera que las palabras están separadas por espacios.
    Por ejemplo,
    si el usuario ingresa la cadena "Hola mundo, este es un ejercicio",
    el programa debería imprimir el resultado: "Número de palabras: 6".
 */

public class ContadorDePalabras {
    public static void main(String[] args) {
        contarPalabras("Hola mundo, este es un ejercicio");
    }

    private static void contarPalabras(String palabra) {
        Integer cantidadPalabras;

        cantidadPalabras = palabra.split(" ").length;
        
        System.out.println("Cantidad de palabras: " + cantidadPalabras);
    }
}
