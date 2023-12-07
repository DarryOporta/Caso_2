package caso_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Darry OV
 */
public class Caso_2 {

    public static void main(String[] args) {

        // Arreglo de amigos 
        Amigo[] amigos = new Amigo[6];

        amigos[0] = new Amigo("Joshua");
        amigos[1] = new Amigo("Greivin");
        amigos[2] = new Amigo("Guillermo");
        amigos[3] = new Amigo("Andres");
        amigos[4] = new Amigo("Tavo");
        amigos[5] = new Amigo("David");

        //Arreglo de movimientos
        int cantMov = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de movimientos extra a dijitar:"));
        Movimiento[] mov = new Movimiento[7 + cantMov];
        
        String dolares = "Dolares";
        
        //Arreglo Ejemplo 1 
        Amigo[] participantesMov1 = {amigos[0], amigos[1], amigos[2], amigos[3], amigos[4], amigos[5]};
        mov[0] = new Movimiento("Desayuno coffePrime", participantesMov1, amigos[2], 120, dolares);
        
        //Arreglo Ejemplo 2 
        Amigo[] participantesmov2 = {amigos[0],amigos[1],amigos[2],amigos[3],amigos[4]};
        mov[1] = new Movimiento("Almuerzo Pig factory", participantesmov2, amigos[2], 200,dolares);
        
        //Arreglo Ejemplo 3 
        Amigo[] participantesmov3 = {amigos[0],amigos[5]};
        mov[1] = new Movimiento("Cena FastFood", participantesmov3, amigos[5], 50,dolares);
        
        //Arreglo Ejemplo 4 
        Amigo[] participantesmov4 = {amigos[2],amigos[3],amigos[1],amigos[4]};
        mov[1] = new Movimiento("Pizza Hut",participantesmov4 ,amigos[4] , 100,dolares);
        
        //Arreglo Ejemplo 5 
        Amigo[] participantesmov5 = {amigos[2]};
        mov[1] = new Movimiento("Quicksilver Store", participantesmov5, amigos[1], 150,dolares);
        //Arreglo Ejemplo 6
        Amigo[] participantesmov6 = {amigos[3]};
        mov[1] = new Movimiento("Apple Store", participantesmov6, amigos[0], 200, dolares);
        
        //Arreglo Ejemplo 7
        Amigo[] participantesmov7 = {amigos[0], amigos[1], amigos[2], amigos[3], amigos[4], amigos[5]};
        mov[1] = new Movimiento("Desayuno chilis", participantesmov7, amigos[1], 150, dolares);
        
        //Arreglo Ejemplo 8
        Amigo[] participantesmov8 = {amigos[0], amigos[1], amigos[2], amigos[3], amigos[4], amigos[5]};
        mov[1] = new Movimiento("Almuerzo Hooters", participantesmov8, amigos[4], 180,dolares);
        
        //
        
        
        //Condicional 
        
        /*if (cantMov > 1) {
            
            
            
        }*/

    }

}
