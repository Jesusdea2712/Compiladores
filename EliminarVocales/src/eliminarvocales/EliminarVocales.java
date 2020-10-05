package eliminarvocales;

/**
 *
 * @author jesus
 */
public class EliminarVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        eliminarVocales("hola mundo");
    }
    
    public static void eliminarVocales(String cadena){
        char [] letras = cadena.toCharArray();
        String cadenaNueva = "";
        for(int i = 0; i<letras.length; i++){
            if(letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u'){
                continue;
            }
            cadenaNueva += String.valueOf(letras[i]);
        }
        System.out.println(cadenaNueva);
    }
}
