/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.megaferia;

import core.person.Gerente;

/**
 *
 * @author merizaldej
 */
public class Editorial {
    
    private String nit;
    private String nombre;
    private String direccion;
    private Gerente gerente;

    public Editorial(String nit, String nombre, String direccion, Gerente gerente) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
    }
    
    
}
