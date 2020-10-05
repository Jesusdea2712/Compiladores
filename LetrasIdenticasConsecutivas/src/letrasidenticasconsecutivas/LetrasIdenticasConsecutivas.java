package letrasidenticasconsecutivas;

/**
 *
 * @author jesus
 */
public class LetrasIdenticasConsecutivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        letrasRepetidas("loop");
        letrasRepetidas("cooperacion");
    }
    
    public static void letrasRepetidas(String cadena){
        char [] letras = cadena.toCharArray();
        for(int i =0; i < letras.length; i++){
            if( (i+1) < (letras.length-1)){
            if(letras[i] == letras[i+1] ){
                System.out.println(true);
                break;
            }
            }
        }
    }
}
