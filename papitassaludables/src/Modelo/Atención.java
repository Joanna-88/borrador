/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Acer
 */
public class Atención {
  Veterinario veterinarios;
  String descripción;
  String date;

    public Atención(Veterinario veterinarios, String descripción, String date) {
        this.veterinarios = veterinarios;
        this.descripción = descripción;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Atenci\u00f3n{" + "veterinarios=" + veterinarios + ", descripci\u00f3n=" + descripción + ", date=" + date + '}';
    }
  
  
}
