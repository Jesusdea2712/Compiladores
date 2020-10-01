package test;

public class TestCadena {

    public static void main(String[] args) {
        //owofied("I'm gonna ride 'til I can't no more")
        convertirCadena("I'm gonna ride 'til I can't no more");
        convertirCadena("Do you ever feel like a plastic bag");
    }

    public static void convertirCadena(String cadena) {

        char[] letras = cadena.toCharArray();
        var nuevaCadena = "";
        for (var i = 0; i < letras.length; i++) {
            switch (letras[i]) {
                case 'i' -> nuevaCadena += "wi";
                case 'e' -> nuevaCadena += "we";
                default -> nuevaCadena += letras[i];
            }
        }
        
        nuevaCadena += " owo";
        System.out.println(nuevaCadena);
    }

}
