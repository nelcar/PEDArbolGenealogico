
package arbolgenealogico;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jossy
 */
public class Nodo implements Serializable{
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
