package javainter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaStrings {
    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Persona 1");
        listaNombres.add("Persona 2");
        listaNombres.add("Persona 3");
        listaNombres.add("Persona 4");
        listaNombres.add("Persona 5");
        listaNombres.add("Persona 5");
        listaNombres.add("Persona 5");
        listaNombres.add("Persona 5");
        System.out.println(listaNombres);

        Collections.reverse(listaNombres);
        System.out.println(listaNombres);

        List<String> nombreSinRepetir = listaNombres.stream().distinct().collect(Collectors.toList());

        System.out.println(nombreSinRepetir);
    }
}
