/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_lab32;
import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Tema la java lab 3
 */
public class Java_lab32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cream reteaua sociala
        SocialNetwork network=new SocialNetwork();
        //cream oameni si companii
        Programmer p1=new Programmer("Maria", LocalDate.of(1995, 5, 20), "Java");
        Designer d1=new Designer("Mihai", LocalDate.of(1998, 3, 15), "PhotoShop");
        Person p2=new Person("Ana", LocalDate.of(1990, 10, 10));
        Company c1=new Company("TechCorp", "IT");
        Company c2=new Company("DesignStudio", "Marketing");
        
        //inregistram totul in retea
        network.addProfiles(p1);
        network.addProfiles(d1);
        network.addProfiles(p2);
        network.addProfiles(c1);
        network.addProfiles(c2);
        
        //cream relatii
        p1.addRelationship(c1, "angajat");
        p1.addRelationship(d1, "prieten");
        p1.addRelationship(p2, "coleg");
        d1.addRelationship(c2, "angajat");
        d1.addRelationship(p1, "prieten");
        p2.addRelationship(c1, "angajat");
        
        //extragem lista cu toti participantii
        List<Profile> allProfiles=network.getProfiles();
        
        //sortam lista descrescator
        allProfiles.sort(new Comparator<Profile>(){
            @Override
            public int compare(Profile prof1, Profile prof2)
            {
                //calculam importanta
                int imp1=network.computeImportance(prof1);
                int imp2=network.computeImportance(prof2);
                return Integer.compare(imp2, imp1);
            }
        });
        
        //afisare
        System.out.println("Topul Retelei Sociale");
        for(Profile prof : allProfiles)
        {
            int imp=network.computeImportance(prof);
            System.out.println(prof.toString() + "  Importance: " + imp);
        }
    }
    
}
