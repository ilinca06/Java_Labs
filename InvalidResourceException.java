/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab51.exceptions;

/**
 *
 * @author PC
 */

//extindem clasa Exception pentru a o transforma intr-o eroare oficiala de Java
public class InvalidResourceException extends Exception {
   //constructor care primeste un mesaj de eroare
    public InvalidResourceException(String message)
    {
        super(message); 
    } 
}
