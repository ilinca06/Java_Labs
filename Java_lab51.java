/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_lab51;
import com.mycompany.java_lab51.model.Catalog;
import com.mycompany.java_lab51.model.Item;
import com.mycompany.java_lab51.exceptions.InvalidResourceException;

/**
 *
 * @author PC
 */
public class Java_lab51 {

    public static void main(String[] args) {
        //cream obiectul care reprezinta repository-ul (catalogul)
        Catalog catalog = new Catalog();

        try {
            //cream resursele 
            Item item1 = new Item("knuth67", "The Art of Computer Programming", 
                    "https://www3.cs.stonybrook.edu/~skiena/392/knuth/tacp.ps", "1967", "Donald E. Knuth");
            
            Item item2 = new Item("jvm25", "The Java Virtual Machine Specification", 
                    "https://docs.oracle.com/javase/specs/jvms/se25/html/index.html", "2025", "Tim Lindholm & others");

            //adaugam resursele in repository
            catalog.add(item1);
            catalog.add(item2);

            // afisam ce avem in catalog pana acum
            System.out.println("\nContinutul catalogului:");
            catalog.getItems().forEach(System.out::println);

            //incercam sa deschidem o resursa (se va deschide in browser)
            System.out.println("\nSe deschide resursa...");
            catalog.open(item2);

            //testam exceptia custom: incercam sa adaugam ceva invalid (fara locatie)
            
        } 
        catch (InvalidResourceException e) 
        {
            //prindem eroarea custom daca ceva a mers prost la adaugare
            System.err.println("Eroare de validare: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            //prindem orice alta eroare neasteptata
            System.err.println("A aparut o problema neprevazuta: " + e.getMessage());
        }
    }
}
