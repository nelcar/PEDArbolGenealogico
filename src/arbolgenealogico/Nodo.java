
package arbolgenealogico;

import java.util.ArrayList;

/**
 *
 * @author Jossy
 */
public class Nodo {
    String valor;    
    ArrayList<Nodo> hijos;

    Nodo(String newData) {
      hijos = new ArrayList<>();
      valor = newData;
    } 

    public String getValor() {
        return valor;
    }
    
}
