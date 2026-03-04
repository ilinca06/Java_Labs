/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_lab22;

/**
 *
 * @author PC
 */
public class Java_lab22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Adaugam locatii 
        City iasi = new City("Iasi", 10.0, 20.0, 350000);
        City vaslui = new City("Vaslui", 15.0, 25.0, 50000);
        Airport otopeni = new Airport("Otopeni", 50.0, 60.0, 4);
        GasStation benzinarie = new GasStation("OMV_A2", 30.0, 40.0, 7.5);

        //Adaugam drumuri intre ele
        Road r1 = new Road(RoadType.HIGHWAY, 100, 130, iasi, vaslui);
        Road r2 = new Road(RoadType.EXPRESS, 250, 100, vaslui, otopeni);
        
        //Incercam sa cream un drum duplicat (Acelasi drum, dar scris in sens invers)
        Road r1_duplicate = new Road(RoadType.HIGHWAY, 100, 130, vaslui, iasi);

        //Cream instanta problemei
        Problem harta = new Problem();

        //Adaugam locatiile la problema
        System.out.println("\nAdaugam Locatii");
        harta.addLocation(iasi);
        harta.addLocation(vaslui);
        harta.addLocation(otopeni);
        harta.addLocation(benzinarie);
        
        //Incercam sa bagam Iasul a doua oara
        City iasiClona = new City("Iasi", 10.0, 20.0, 350000);
        harta.addLocation(iasiClona); 

        //Adaugam drumurile la problema
        System.out.println("\nAdaugam Drumuri");
        harta.addRoad(r1);
        harta.addRoad(r2);
        
        //Incercam sa bagam drumul duplicat
        harta.addRoad(r1_duplicate); 

        //Verificam daca harta e valida
        System.out.println("\nVerificare Harta");
        harta.isValid();

        //Testam algoritmul DFS 
        System.out.println("\nTestare Algoritm Traseu");
        
        // Test 1: Iasi -> Otopeni (Ar trebui sa fie TRUE, merge prin Vaslui)
        boolean sePoateAjunge = harta.canReach(iasi, otopeni);
        System.out.println("Exista traseu intre Iasi si Otopeni? " + sePoateAjunge);
        
        // Test 2: Iasi -> Benzinarie (Ar trebui sa fie FALSE, benzinaria nu e legata de nimic)
        boolean traseuBenzinarie = harta.canReach(iasi, benzinarie);
        System.out.println("Exista traseu intre Iasi si Benzinarie? " + traseuBenzinarie);
    }
    
}
