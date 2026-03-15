/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Acer
 */
public class Veterinario {
  int id;
  String nombre;
  String direcció;
  String telefono;

    public Veterinario(int id, String nombre, String direcció, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direcció = direcció;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Veterinaria{" + "id=" + id + ", nombre=" + nombre + ", direcci\u00f3=" + direcció + ", telefono=" + telefono + '}';
    }
  
}
