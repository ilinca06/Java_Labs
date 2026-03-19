/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_lab41;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author PC
 */
public class Java_lab41 {

    public static void main(String[] args) {
        //cream 10 intersectii folosind stream 
        List<Intersection> nodes=IntStream.rangeClosed(0, 9).mapToObj(i -> new Intersection("v" + i)).collect(Collectors.toList());
        System.out.println("Intersectiile generate automat: " + nodes);
        
        //cream o lista inlantuita si adaugam strazi
        List<Street> streets=new LinkedList<>();
        streets.add(new Street("s1", 2.5, nodes.get(0), nodes.get(1)));
        streets.add(new Street("s2", 1.2, nodes.get(0), nodes.get(2)));
        streets.add(new Street("s3", 3.0, nodes.get(1), nodes.get(2)));
        streets.add(new Street("s4", 0.8, nodes.get(2), nodes.get(3)));
        System.out.println("\nStrazile inainte de sortare:\n" + streets);
        
        //sortam strazile crescator in functie de lungimea lor
        streets.sort(Comparator.comparingDouble(Street::getLength));
        System.out.println("Strazile dupa sortare:\n" + streets);
        
        Set<Intersection> intersectionSet=new HashSet<>();
        //adaugam toate cele 10 intersectii in set
        intersectionSet.addAll(nodes);
        System.out.println("\nDimensiunea setului dupa adaugarea celor 10 noduri: " + intersectionSet.size());
        
        //incercam sa adaugam un duplicat
        Intersection duplicat=new Intersection("v0");
        
        boolean isAdded=intersectionSet.add(duplicat);
        System.out.println("S-a putut adauga duplicatul? Raspuns: " + isAdded);
        System.out.println("Dimensiunea setului a ramas la fel? " + intersectionSet.size());
    }
}
