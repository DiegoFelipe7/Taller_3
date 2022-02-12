/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Class.Lists;
import java.time.LocalDate;
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
                    if (arrayList.isEmpty()){
                        System.out.println("La biblioteca aún no contiene canciones.\n");
                    }else{
                        list.setArrayList(arrayList);
                        System.out.println("Lista:\n");
                        
                        for(int i = 0; i < arrayList.size(); i++){
                            for (Lists a : arrayList){
                                if (a.getIdentifier() == (i + 1)){
                                    System.out.println(a.toString());
                                }
                            }   
                        }
                    }
                break;
                
                case 2:
                    try { 
                       
                        System.out.println("Ingrese, por favor, el título de la canción que desea agregar:");
                        title = keyboard.nextLine();
                        while(title.isEmpty()){
                            System.out.println("Ingrese un título válido.");
                            title = keyboard.nextLine();
                        }
                        
                        System.out.println("Ingrese, por favor, la fecha de lanzamiento de la canción que desea agregar, la estructura debe ser: yyyy-mm-dd.");
                        date = keyboard.nextLine();
                        LocalDate dateConvert = consoleInputVerificationDate(date);
                        
                        while(dateConvert == null){
                            System.out.println("Ingrese una fecha válida, la estructura debe ser: yyyy-mm-dd.");
                            date = keyboard.nextLine(); 
                            dateConvert = consoleInputVerificationDate(date);
                        }
                        
                        System.out.println("Ingrese, por favor, el tiempo de duración, en segundos, de la canción que desea agregar:");
                        input = keyboard.nextLine();
                        duration = consoleInputVerificationNumber(input);
                        
                        while(duration == 0){
                            System.out.println("Ingrese una duración válida.");
                            input = keyboard.nextLine(); 
                            duration = consoleInputVerificationNumber(input);
                        }
                        
                        System.out.println("Ingrese, por favor, el género de la canción que desea agregar:");
                        genre = keyboard.nextLine();
                        while(genre.isEmpty()){
                            System.out.println("Ingrese un genero válido.");
                            genre = keyboard.nextLine();
                        }
                        
                        System.out.println("Ingrese, por favor, una corta descripción de la canción que desea agregar:");
                        description = keyboard.nextLine();
                        while(description.isEmpty()){
                            System.out.println("Ingrese una descripción válido.");
                            description = keyboard.nextLine();
                        }
                        
                        identifier = arrayList.size() + 1;
                        cover = title.replace(" ","") + ".png";
                        
                        list = new Lists(title, identifier, dateConvert, duration, genre, cover, description);
                        arrayList.add(list);
                        list.setArrayList(arrayList);
                        System.out.println("Datos almacenados \n");
                        for (Lists a : arrayList){
                            System.out.println(a.toString());
                        }
                    }  catch (Exception e) {
                        System.out.println("Error : " +e);
                    }
                  break;
                    
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
    
    public static LocalDate consoleInputVerificationDate (String input){
        try{
            LocalDate choice = LocalDate.parse(input);
            return choice;
        }
        catch (Exception e){
            return null;
        }
    }
}
