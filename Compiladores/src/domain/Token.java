package domain;

public class Token {
   private Tipos tipo;
   private String valor;
    
   public Tipos getTipo() {
        return tipo;
    }
 
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
 
    public String getValor() {
        return valor;
    }
 
    public void setValor(String valor) {
        this.valor = valor;
    }

    // Diccionario    
    public enum Tipos {
        NUMERO ("[0-9]+"),
        INICIO("Inicio"),
        FIN("Fin"),
        OPERADORES_ARITMETICOS("[+-/*]+"),
        OPERADORES_RELACIONALES("(<=|>=|<|>|<>|==|\\.|,|\\(|\\)|\\{|\\}|\\[|\\]|;)"),
        PALABRAS_RESERVADAS("(if|else|while|for|case|program)"),
        OPERADOR_ASIGNACION("(^=$)"),
        IDENTIFICADOR("[A-Za-z][A-Za-z0-9]{1,15}"),
        CONSTANTES("^(0?[0-9]{1,2}|1[0-9][0-9]|2[0-1][0-6])$");
        
        public final String patron;
        Tipos(String s) {
            this.patron = s;
    }   
        }
}


