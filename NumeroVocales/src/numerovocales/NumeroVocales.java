package numerovocales;

/**
 *
 * @author jesus
 */
public class NumeroVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        contadorVocales("Palm");
        contadorVocales("Murcielago");
    }
    
    public static void contadorVocales(String cadena){
        char [] letras = cadena.toCharArray();
        int contador = 0;
        for(char letra: letras){
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }
        System.out.println("numero de vocales: " + contador);
    }
}
