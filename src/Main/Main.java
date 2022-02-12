/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Class.Lists;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag = true;
        double duration;
        ArrayList<Lists> arrayList = new ArrayList<>();
        int option = 0, identifier, year;
        String title, genre, cover, description, date;
        Scanner keyboard = new Scanner(System.in);
        Lists list = new Lists();
        
        while (flag){
            System.out.println("Bienvenido a la biblioteca de música, ¿Qué quiere hacer? \n Ingrese el número correspondiene a la opción deseada\n 1. Ver la playlist. \n 2. Agregar una canción a la playlist. \n 3. Filtrar canciones de la playlist. \n 4. Ordenar canciones de la playlist. \n 5. Salir.");
            String input = "";
            input = keyboard.nextLine();
            option = consoleInputVerificationNumber(input);
            
            switch (option){
                case 1:
                
                case 2:
                    
                case 3:
                    
                case 4:
                    
                case 5:
            }
        }
    }

    public static int consoleInputVerificationNumber (String input){
        try{
            int choice;
            choice = Integer.parseInt(input);
            return choice;
        }
        catch (Exception e){
            return 0;
        }
    }
}
