/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_lab31;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author PC
 */
public class Java_lab31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cream o lista care accepta orice interfata Profile
        List<Profile> lista = new ArrayList<>();

        //Adaugam amestecat persoane si companii
        lista.add(new Person("Mihai"));
        lista.add(new Company("Samsung"));
        lista.add(new Person("Maria"));
        lista.add(new Company("Google"));

        System.out.println("Lista inainte de sortare:");
        for (Profile p : lista) {
            System.out.println(p.toString());
        }

        //Sortam lista folosind un Comparator
        //Comparatorul compara doua obiecte de tip Profile dupa numele lor
        lista.sort(new Comparator<Profile>() {
            @Override
            public int compare(Profile p1, Profile p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("\nLista dupa sortarea cu Comparator:");
        for (Profile p : lista) {
            System.out.println(p.toString());
        }
    }
    
}
