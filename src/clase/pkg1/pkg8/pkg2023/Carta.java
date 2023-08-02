/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg1.pkg8.pkg2023;

/**
 *
 * @author User
 */
public class Carta {
    private String palo, numero;

    public Carta() {
    }

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public String getNumero() {
        return numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero+palo+" ";
    }
    
    
    public boolean comparar(Carta a, Carta b){
        if (a.getPalo().equals(b.getPalo()) && a.getNumero().equals(b.getNumero())) {
            return true;
        }
        return false;
    }
}
