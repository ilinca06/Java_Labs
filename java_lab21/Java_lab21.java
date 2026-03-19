/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_lab21;

/**
 *
 * @author PC
 */
public class Java_lab21 {
    

    public static void main(String[] args) {
        // 1. Cream cateva obiecte de tip Location
        Location iasi = new Location("Iasi", LocationType.CITY, 10.0, 20.0);
        Location vaslui = new Location("Vaslui", LocationType.CITY, 10.0, 50.0); // Distanta in linie dreapta pe axa Y este 30
        Location aeroport = new Location("Aeroport Iasi", LocationType.AIRPORT, 12.0, 22.0);

        // Afisam locatiile. Java va apela automat metoda noastra superba toString()!
        System.out.println("--- Locatii ---");
        System.out.println(iasi);
        System.out.println(vaslui);
        System.out.println(aeroport);

        // 2. Cream obiecte de tip Road
        // Distanta Euclidiana intre Iasi(10,20) si Vaslui(10,50) este 30.
        // Daca punem lungimea 40 (care e mai mare decat 30), e perfect valid.
        Road autostrada = new Road(RoadType.HIGHWAY, 40.0, 130, iasi, vaslui);
        
        System.out.println("\n--- Drumuri ---");
        System.out.println(autostrada);

        // 3. Momentul adevarului: Testam validarea matematica!
        // Incercam sa facem un drum de doar 10 km, desi distanta pe harta e de 30 km.
        System.out.println("\n--- Testare Validare Drum ---");
        Road drumGresit = new Road(RoadType.COUNTRY, 10.0, 50, iasi, vaslui);
        System.out.println(drumGresit);
    }
    
}
