/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg1.pkg8.pkg2023;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class Baraja {
    private ArrayList<Carta> Cartas=new ArrayList();

    public Baraja() {
        String[]palos={"corazon","pica","trebol","diamante"};
        String[] numeros = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String palo : palos) {
            for (String numero : numeros) {
                Cartas.add(new Carta(palo, numero));
            }
        }
        barajar();
    }

    public ArrayList<Carta> getCartas() {
        return Cartas;
    }
    
    public void barajar(){
        Collections.shuffle(Cartas);
    }
    
    public Carta repartir(){
        Carta ref=Cartas.get(0);
        Cartas.remove(0);
        return ref;
    }

    @Override
    public String toString() {
        return Cartas.toString();
    }
    
    
    
}
