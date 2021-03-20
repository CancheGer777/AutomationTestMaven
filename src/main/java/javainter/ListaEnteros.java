package javainter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaEnteros {
    public static void main(String[] args) {
        //declarar lista de enteros
        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(100);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(50);
        System.out.println("lista " + listaNumeros);

        Collections.sort(listaNumeros);
        System.out.println("ordenar " + listaNumeros);
        Collections.reverse(listaNumeros);
        System.out.println("reversa" + listaNumeros);
        Collections.sort(listaNumeros, Collections.<Integer>reverseOrder());
        System.out.println("ordena y reversa" + listaNumeros);

        //quitar elementos repetidos de la lista
        Object last = null;
        int numCount = 0;
        Iterator<Integer> i = listaNumeros.iterator();

        while (i.hasNext()) {
            Object temp = i.next();
            if (temp.equals(last)) {
                i.remove();
                numCount++;
            } else {
                last = temp;
            }
        }

        //Obtener número mayor y número menor de la lista

    }
}
