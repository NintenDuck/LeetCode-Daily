public class VerificacionPalindromos {
    public static void main(String[] args) {
        verificarPalindromos("Anita lava la tina");
        verificarPalindromos("Hola mundo");
    }

    private static void verificarPalindromos( String texto) {
        String[] textoArreglo = texto.split(" ");
        String cadenaCompleta = "";

        try {
            // Juntamos todo en un mismo String
            for (String palabra : textoArreglo) {
                // Hacemos todo lowecase
                cadenaCompleta += palabra.toLowerCase();
            }
            // Volteamos el arreglo
            String cadenaInvertida = new StringBuilder(cadenaCompleta).reverse().toString();
            // Comparamos si es igual
            System.out.println(cadenaCompleta.equals(cadenaInvertida) ?
                    "'" + texto + "'" + " Es palíndromo" :
                    "'" + texto + "'" + " no es un palíndromo");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
