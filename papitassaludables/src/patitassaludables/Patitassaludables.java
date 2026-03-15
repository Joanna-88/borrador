/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patitassaludables;

import Modelo.Mascota;
import Modelo.Veterinario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Patitassaludables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Veterinario>veterinarios=new ArrayList<>();
        Scanner sc=new Scanner(System. in);
        ArrayList<Mascota>mascotas=new ArrayList<>();
        
        int opcion=0;
        while (opcion!=6) {  
        System.out.println("-menu-");
        System.out.println("1.registrar veterinario");
        System.out.println("2.registrar  una materia");
        System.out.println("3.lista veterinario ");
        System.out.println("4.lista mascota");
        System.out.println("5. registrar atención");
        System.out.println("6.salir");
        opcion=sc.nextInt();
        sc.nextLine();
            switch (opcion) {
                case 1:
                    registrarVeterinario(veterinarios, sc);
                    break;
                    
                case 2:
                    
                    registrarmascota(mascotas, sc);
                    break;
                case 3: 
                    listaveterinario(veterinarios);
                    break;
                 
                case 4:
                    listamascota(mascotas);
                    break;
                    
                case 5:
                    
                    
                case 6:
                     
                    
                default:
                    throw new AssertionError();
            }
        }
            
        }
    public static void registrarVeterinario(ArrayList<Veterinario> veterinarios, Scanner sc) {
      
        System.out.println("ingrese su id");
        int id=sc.nextInt();
        System.out.println("ingrese su nombre");
        String nom= sc.next();
        System.out.println("ingrese su  numero de direccion");
        String dir= sc.next();
        System.out.println("ingrese su  correo telefono");
        String tel= sc.next();
        
      
        Veterinario v = new Veterinario(id, nom, dir, tel);
        veterinarios.add(v);
        
        
        
    }
    public static void registrarmascota(ArrayList<Mascota>mascotas,Scanner sc) {
        System.out.println("ingese el id ");
        int id=sc.nextInt();
        System.out.println("ingrese su dueño");
        String nom= sc.next();
        System.out.println(" ingrese direccion ");
        String tel= sc.next();
        System.out.println("ingrese su telefono");
        String gml= sc.next();
        Mascota m = new Mascota(id, nom, tel, gml);
        
    }
    public static void listaveterinario(ArrayList<Veterinario> veterinarios) {
        for (Veterinario v : veterinarios) {
            System.out.println(v);
            
        }
    }
    public static void listamascota(ArrayList<Mascota>mascotas) {
        for (Mascota m : mascotas) {
            System.out.println(m);
        }
    }
    public static void registraratencion() {
        System.out.println();
        
    }
    

}
    

