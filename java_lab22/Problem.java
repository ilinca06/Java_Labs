/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_lab22;

/**
 *
 * Descrie instanta problemei(harta)
 * Contine toate locatiile si drumurile 
 */
public class Problem {
    //stocam datele in 2 arrays
    private Location[] locations;
    private Road[] roads;
    //contoare pentru locatii si drumuri
    private int countLocations;
    private int countRoads;
    public Problem()
    {
        this.locations=new Location[100];
        this.roads=new Road[100];
        this.countLocations=0;
        this.countRoads=0;
    }
    /**
     * Adaugam o noua problema in instanta problemei
     * Prevenim adaugarea duplicatelor folosind override equals()
     */
    public void addLocation(Location location)
    {
        //verificam daca locatia se afla deja in array
        int i;
        for(i=0; i<countLocations; i++)
        {
            if(locations[i].equals(location))
            {
                System.out.println("Eroare, locatia " + location.getName() + " exista deja. Nu o adaugam de 2 ori.");
                return; //oprim functia
            }
        }
        //adaugam locatia
        locations[countLocations]=location;
        countLocations++;
    }
    /**
     * Adaugam un nou drum in instanta problemei
     * Prevenim adaugarea duplicatelor folosind override equals()
     */
    public void addRoad(Road road)
    {
        //verificam daca drumul exista deja
        int i;
        for(i=0; i<countRoads; i++)
        {
            if(roads[i].equals(road))
            {
                System.out.println("Eroare, drumul " + road.getStartLocation().getName() + " --- " + road.getEndLocation().getName() + " exista deja.");
                return;
            }
        }
        //adaugam drumul
        roads[countRoads]=road;
        countRoads++;
    }
    //getteri
    public Location[] getLocations()
    {
        return locations;
    }
    public Road[] getRoads()
    {
        return roads;
    }
    public int getCountLocations()
    {
        return countLocations;
    }
    public int getCountRoads()
    {
        return countRoads;
    }
    /**
     * Verificam daca exista cel putin 2 locatii si daca drumurile care se conecteaza au locatii existente
     */
    public boolean isValid()
    {
        //verificam daca avem cel putin 2 locatii
        if(countLocations<2)
        {
            System.out.println("Eroare, nu avem macar 2 locatii!");
            return false;
        }
        //verificam daca drumurile care sunt conectate sunt existente
        int i;
        for(i=0; i<countRoads; i++)
        {
            Location start=roads[i].getStartLocation();
            Location end=roads[i].getEndLocation();
            boolean startVf=false;
            boolean endVf=false;
            //cautam capetele drumului in lista noastra de locatii
            int j;
            for(j=0; j<countLocations; j++)
            {
                if(locations[j].equals(start))
                {
                    startVf=true;
                }
                if(locations[j].equals(end))
                {
                    endVf=true;
                }
            }
            //daca un capat de drum nu exista, problema este invalida
            if(!startVf || !endVf)
            {
                System.out.println("Eroare, un capat de drum nu exista!");
                return false;
            }
        }
        System.out.println("Toate drumurile sunt valide!");
        return true;
    }
    /**
     * Determinam daca putem ajunge din locatia start in locatia end
     */
    public boolean canReach(Location start, Location end)
    {
        //un vector pentru a tine minte pe unde am fost
        boolean[] visited=new boolean[countLocations];
        //gasim locatia de start in array
        int startIndex=-1;
        int i;
        for(i=0; i<countLocations; i++)
        {
            if(locations[i].equals(start))
            {
                startIndex=i;
                break;
            }
        }
        if(startIndex==-1)
        {
            System.out.println("Eroare, locatia de start nu exista!");
            return false;
        }
        //incepem parcurgerea mapii cu DFS
        return exploreMap(startIndex, end, visited);
    }
    /**
     * Metoda pentru a explora mapa cu DFS
     */
    private boolean exploreMap(int currentIndex, Location target, boolean[] visited) {
        Location currentLocation = locations[currentIndex];
        
        //Am ajuns la destinatie
        if (currentLocation.equals(target)) {
            return true;
        }
        
        //Marcam locatia curenta ca fiind VIZITATA
        visited[currentIndex] = true;
        
        //Verificam toate drumurile de pe harta sa vedem daca pleaca de aici
        for (int i = 0; i < countRoads; i++) {
            Road road = roads[i];
            Location nextLocation = null;
            
            //Verificam ambele capete
            if (road.getStartLocation().equals(currentLocation)) {
                nextLocation = road.getEndLocation(); // mergem spre capatul celalalt
            } else if (road.getEndLocation().equals(currentLocation)) {
                nextLocation = road.getStartLocation(); // ne intoarcem de la capatul celalalt
            }
            
            //Daca am gasit un drum care ne duce spre un oras NOU
            if (nextLocation != null) {
                //Gasim indexul orasului nou in array
                int nextIndex = -1;
                for (int j = 0; j < countLocations; j++) {
                    if (locations[j].equals(nextLocation)) {
                        nextIndex = j;
                        break;
                    }
                }
                
                //Daca orasul exista si NU l-am mai vizitat, mergem pe acolo
                if (nextIndex != -1 && !visited[nextIndex]) {
                    //Cautam mai departe folosind acelasi algoritm
                    if (exploreMap(nextIndex, target, visited)) {
                        return true; //Am gasit un traseu
                    }
                }
            }
        }
        
        //Am incercat toate variantele fara rezultat
        return false;
    }
}
