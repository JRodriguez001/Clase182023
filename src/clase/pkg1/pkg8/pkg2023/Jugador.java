/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg1.pkg8.pkg2023;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Jugador {
    private String nombre;
    private ArrayList<Carta> cartas=new ArrayList();

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    public void recibirCarta(Carta c){
        cartas.add(c);
    }
    
    public int CalcularMano(){
        int tot=0;
        for (Carta carta : cartas) {
            if (carta.getNumero().equals("A")) {
                tot+=1;
            }else if (carta.getNumero().equals("J")) {
                tot+=11;
            }else if (carta.getNumero().equals("Q")) {
                tot+=12;
            }else if (carta.getNumero().equals("k")) {
                tot+=13;
            }else{
                tot+=Integer.parseInt(carta.getNumero());
            }
        }
        return tot;  
    }

    @Override
    public String toString() {
        return nombre+":"+cartas+"\n";
    }
    
    
}
