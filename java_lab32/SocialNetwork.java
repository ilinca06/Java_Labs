/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab32;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author PC
 */
public class SocialNetwork {
    //lista care contine toate profilurile de pe retea
    private List<Profile> profiles;
    
    //constructor
    public SocialNetwork()
    {
        this.profiles=new ArrayList<>();
    }
    //metoda prin care adaugam un nou cont pe retea
    public void addProfiles(Profile p)
    {
        this.profiles.add(p);
    }
    //getter pt a afla lista
    public List<Profile> getProfiles()
    {
        return profiles;
    }
    //calculam importanta (nr de ralatii)
    public int computeImportance(Profile target)
    {
        //set pentru relatii unice (fara duplicate)
        Set<Profile> uniqueConnections = new HashSet<>();

        //adaugam persoanele pe care target-ul le are in agenda lui
        if (target instanceof Person) {
        Person p = (Person) target; 
        uniqueConnections.addAll(p.getRelationships().keySet()); 
        }

        //cautam in toata reteaua cine l-a adaugat pe target in agenda lor
        for (Profile p : profiles) {
           if (p instanceof Person) {
               Person otherPerson = (Person) p;
            
              if (otherPerson != target) {
                  //daca il gasim, il punem in Set
                  if (otherPerson.getRelationships().containsKey(target)) {
                      uniqueConnections.add(otherPerson); 
                    }
                }
            }
        }
       return uniqueConnections.size();
    }
}
