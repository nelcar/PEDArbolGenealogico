package arbolgenealogico;

import java.io.File;
import java.util.ArrayList;

public class Arbol {
    private Nodo raiz;
 
     public Arbol() {
        raiz = null;
    }
    public Nodo buscarRecursivo(String data) {
        return (buscarRecursivo(raiz, data));
    }
    Nodo resultado = null;
    private Nodo buscarRecursivo(Nodo node, String valorBuscado) {
        if (node == null) {
            resultado = null;
        }
        if (valorBuscado.equalsIgnoreCase(node.valor)) {
            resultado = node;
        }
        for (Nodo tmp : node.hijos) {
            buscarRecursivo(tmp, valorBuscado);
        }
        return resultado;
    }
    public void insertarNodo(String valor, String padre) {
        raiz = insertarNodo(raiz, valor, padre);
    }
    private Nodo insertarNodo(Nodo nodo, String valor, String padre) {
        if (nodo == null) {
            nodo = new Nodo(valor);
        } else {
            Nodo nodoPadre = buscarRecursivo(padre);
            if (nodoPadre != null) {
                nodoPadre.hijos.add(new Nodo(valor));
            } else {
                nodo.hijos.add(new Nodo(valor));
            }
        }
        return nodo;
    }
    public int buscarNodo(String valorNodo) {
        int pos = nodosVisitados.indexOf(valorNodo);

        return pos;
    }
    static int contadorNodos = 0;
    static int contadorNulos = 0;
    static ArrayList<String> nodosVisitados = new ArrayList<>();
    private void encontrarNodos(Nodo nodo, Arbol arbol) {
        if (nodo != null) {
            String nulo = "null";
            nodosVisitados.add(nodo.valor);
            contadorNodos++;
            for (Nodo tmp : nodo.hijos) {
                if (tmp == null) {
                    nulo = "null" + contadorNulos;
                    contadorNulos++;
                }
                encontrarNodos(tmp, arbol);
            }
        }
    }
    
    static int nuevoContadorNulos = 0;
    public void asignarPadreHijo(Nodo nodo, Arbol arbol) {
        if (nodo != null) {
            for (Nodo tmp : nodo.hijos) {
                if (tmp != null) {
                    System.out.printf("%-10s", nodosVisitados.get(buscarNodo(nodo.valor)));
                    System.out.printf("%10s","->");
                    System.out.printf("%15s%n", nodosVisitados.get(buscarNodo(tmp.valor)));
                    } else {
                }
                asignarPadreHijo(tmp, arbol);
            }
            
           
        }
    }
    public void graficarArbol(Arbol arbol) {
        System.out.println("Entre sin problemas Al imprimir");
        encontrarNodos(raiz, arbol);
        asignarPadreHijo(raiz, arbol);
    }
}
