/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab32;
import java.util.ArrayList;
import java.util.List;

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
    //metoda prin acre adaugam un nou cont pe retea
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
        int importance=0;
        //daca profilul este o persoana, numaram pe cine are ea in agenda
        if(target instanceof Person)
        {
            //transformam in persoana ca sa ii vedm agenda
            Person p=(Person) target;
            importance += p.getRelationships().size();
        }
        //trebuie sa numaram si cati alti oameni au adaugat acest target la agenda lor
        for(Profile p : profiles)
        {
            if(p instanceof Person)
            {
                Person otherPerson=(Person) p;
                //ne asiguram ca nu ne numaram pe noi insine
                if(otherPerson!=target)
                {
                    //daca in agenda altui om se afla si target-ul, crestem importanta
                    if(otherPerson.getRelationships().containsKey(target))
                    {
                        importance++;
                    }
                }
            }
        }
     return importance;   
    }
}
