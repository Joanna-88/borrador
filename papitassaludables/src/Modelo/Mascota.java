/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Mascota {
  int id;
  String dueño;
  String direccion;
  String telefono;
    ArrayList<Atención>atenciones;

    public Mascota(int id, String dueño, String direccion, String telefono) {
        this.id = id;
        this.dueño = dueño;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", due\u00f1o=" + dueño + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
}
