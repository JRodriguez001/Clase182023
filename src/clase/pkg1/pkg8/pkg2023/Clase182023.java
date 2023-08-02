/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg1.pkg8.pkg2023;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Clase182023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja b = new Baraja();

        Jugador j1 = new Jugador();

        ArrayList<Jugador> jugadores = new ArrayList<>();
        ArrayList<Jugador> ganadores = new ArrayList<>();
        ArrayList<Integer> baraja = new ArrayList<>();

        while (true) {

            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú:\n"
                    + "1 Agregar nuevo Jugador\n"
                    + "2 Barajar\n"
                    + "3 Repartir\n"
                    + "4 Imprimir ganadore\n"
                    + "5 Imprimir el listado de los últimos 5 ganadores\n"
                    + "6 Salir"));

            switch (opcion) {
                case 1:
                    if (jugadores.size() < 10) {
                        j1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del nuevo jugador:"));
                        jugadores.add(j1);

                        JOptionPane.showMessageDialog(null, "Jugador Agregado");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden agregar más jugadores, el límite es 10");
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, b);
                    break;
                case 3:
                    for (int i = 0; i < jugadores.size(); i++) {
                        for (int j = 0; j < 4; j++) {
                            jugadores.get(i).recibirCarta(b.repartir());

                        }
                    }
                    JOptionPane.showMessageDialog(null, jugadores + "\n");

                    break;
                case 4:
                    for (int i = 0; i < jugadores.size(); i++) {

                        baraja.add(jugadores.get(i).CalcularMano());
                    }
                    for (int i = 0; i < baraja.size(); i++) {
                        if (baraja.get(0) > baraja.get(1)) {
                            JOptionPane.showMessageDialog(null, jugadores.get(0) + "Gana");
                        }
                    }
                    break;
                case 5:

                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo.....");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }

}
