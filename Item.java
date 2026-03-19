/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab51.model;
import java.util.Objects;
/**
 *
 * @author PC
 */
public class Item {
    private String id;
    private String title;
    private String location; //poate fi un path de pe disc sau un URL web
    private String year;
    private String author;

    //constructor
    public Item(String id, String title, String location, String year, String author) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.year = year;
        this.author = author;
    }

    //getteri si setteri 

    public String getId() 
    { 
        return id; 
    }
    public void setId(String id) 
    { 
        this.id = id; 
    }

    public String getTitle() 
    { 
        return title; 
    }
    public void setTitle(String title) 
    { 
        this.title = title; 
    }

    public String getLocation() 
    { 
        return location; 
    }
    public void setLocation(String location) 
    { 
        this.location = location; 
    }

    public String getYear() 
    { 
        return year; 
    }
    public void setYear(String year) 
    { 
        this.year = year; 
    }

    public String getAuthor() 
    { 
        return author; 
    }
    public void setAuthor(String author) 
    { 
        this.author = author; 
    }

    //afisare
    @Override
    public String toString() 
    {
        return "Item: " + "id= " + id +  "   title= " + title + "   location= " + location + "   year= " + year + "   author= " + author;
    }

    //equals() si hashCode() ca sa putem compara doua resurse dupa ID
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
