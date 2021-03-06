package Main;

import Class.Lists;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * [ Esta clase tiene como objetivo iniciar la aplicación en la cual se 
 * podrá realizar la visualización, creación, aplicación de filtros y orden 
 * a una lista de canciones por medio de interacciones con el usuario.
 *
 * ]
 *
 * @version ["VS" 1.0.0,2022-02-14
 *
 * 1.0.0,2022-02-14, La clase corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings ]
 *
 * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
 * 
 * @since [1.0.0]
 *
 */
public class Main {

    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar la visualización, creación, 
     * aplicación de filtros y orden a una lista de canciones por medio de 
     * interacciones con el usuario.
     * ]
     *
     * @param args
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
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
            System.out.println("Bienvenido a la biblioteca de música, ¿Qué "
                    + "quiere hacer? \n Ingrese el número correspondiene a "
                    + "la opción deseada\n 1. Ver la playlist. \n 2. Agregar "
                    + "una canción a la playlist. \n 3. Filtrar canciones de"
                    + " la playlist. \n 4. Ordenar canciones de la playlist."
                    + " \n 5. Salir.");
            String input = "";
            input = keyboard.nextLine();
            option = consoleInputVerificationNumber(input);
            
            switch (option){
                case 1:
                    if (arrayList.isEmpty()){
                        System.out.println("La biblioteca aún no contiene "
                                + "canciones.\n");
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
                       
                        System.out.println("Ingrese, por favor, el título de "
                                + "la canción que desea agregar:");
                        title = keyboard.nextLine();
                        while(title.isEmpty()){
                            System.out.println("Ingrese un título válido.");
                            title = keyboard.nextLine();
                        }
                        
                        System.out.println("Ingrese, por favor, la fecha de "
                                + "lanzamiento de la canción que desea agregar,"
                                + " la estructura debe ser: yyyy-mm-dd.");
                        date = keyboard.nextLine();
                        LocalDate dateConvert = 
                                consoleInputVerificationDate(date);
                        while(dateConvert == null){
                            System.out.println("Ingrese una fecha válida, la "
                                    + "estructura debe ser: yyyy-mm-dd.");
                            date = keyboard.nextLine(); 
                            dateConvert = consoleInputVerificationDate(date);
                        }
                        
                        System.out.println("Ingrese, por favor, el tiempo de"
                                + " duración, en segundos, de la canción "
                                + "que desea agregar:");
                        input = keyboard.nextLine();
                        duration = consoleInputVerificationNumber(input);
                        while(duration == 0){
                            System.out.println("Ingrese una duración válida.");
                            input = keyboard.nextLine(); 
                            duration = consoleInputVerificationNumber(input);
                        }
                        
                        System.out.println("Ingrese, por favor, el género "
                                + "de la canción que desea agregar:");
                        genre = keyboard.nextLine();
                        while(genre.isEmpty()){
                            System.out.println("Ingrese un genero válido.");
                            genre = keyboard.nextLine();
                        }
                        
                        System.out.println("Ingrese, por favor, una corta "
                                + "descripción de la canción que desea "
                                + "agregar:");
                        description = keyboard.nextLine();
                        while(description.isEmpty()){
                            System.out.println("Ingrese una descripción "
                                    + "válido.");
                            description = keyboard.nextLine();
                        }
                        
                        identifier = arrayList.size() + 1;
                        cover = title.replace(" ","") + ".png";
                        list = new Lists(
                                title, identifier, dateConvert, duration,genre,
                                cover, description);
                        arrayList.add(list);
                        list.setArrayList(arrayList);
                        System.out.println("Datos almacenados \n");
                        for (Lists a : arrayList){
                            System.out.println(a.toString());
                        }
                    }  
                    catch (Exception e) {
                        System.out.println("Error : " +e);
                    }
                break;
                    
                case 3:
                    if(arrayList.isEmpty()){
                        System.out.println("La biblioteca aún no contiene "
                                + "canciones para filtar.\n");
                    }else{
                        System.out.println("¿Por qué característica desea "
                                + "filtrar? \n 1. Por género. \n 2. Por año.");
                        input = keyboard.nextLine();
                        option = consoleInputVerificationNumber(input);
                        while(((option != 1) && (option != 2))== true){
                            System.out.println("Ingrese una opción de filtrado"
                                    + " válida.");
                            input = keyboard.nextLine(); 
                            option = consoleInputVerificationNumber(input);
                        }
                        
                        if (option == 1){
                            System.out.println("Ingrese el género por el que "
                                    + "desea filtrar la lista de canciones.");
                            genre = keyboard.nextLine();
                            while(genre.isEmpty()){
                                System.out.println("Ingrese un género válido.");
                                genre = keyboard.nextLine();
                            }

                            ArrayList<Lists> filterByGenre = 
                                    list.toSearch(genre);
                            if (filterByGenre.size() == 0){
                                System.out.println("No existen canciones con"
                                        + " este género. \n");
                            }
                            else{
                                System.out.println("Filtro de Canciones por "
                                        + "género: \n ");
                                for (int i = 0; i <filterByGenre.size(); i++) {
                                    list = filterByGenre.get(i);
                                    System.out.println(list.message());
                                }
                                System.out.println();
                            }
                        }
                        else if (option == 2){
                            System.out.println("Ingrese el año por el que desea"
                                    + " filtrar la lista de canciones.");
                            input = keyboard.nextLine();
                            year = consoleInputVerificationNumber(input);
                            while(year == 0){
                                System.out.println("Ingrese un año válido.");
                                input = keyboard.nextLine(); 
                                year = consoleInputVerificationNumber(input);
                            }
                            

                            ArrayList<Lists> filterByYear = list.toSearch(year);
                            if (filterByYear.size() == 0){
                                System.out.println("No existen canciones con"
                                        + " este año. \n ");
                            }else{
                                System.out.println("Filtro de Canciones por "
                                        + "año: \n ");
                                for (int i = 0; i <filterByYear.size(); i++) {
                                    list = filterByYear.get(i);
                                    System.out.println(list.message());
                                }
                                System.out.println();
                            }
                        }
                        else{
                            break;
                        }
                    }  
                break;
                
                case 4:
                    if(arrayList.isEmpty()){
                        System.out.println("La biblioteca aún no contiene"
                                + " canciones para ordenar.\n");
                    }
                    else{
                        System.out.println("Elija el orden deseado \n"
                                + " 1. Por Duración. \n 2. Por fecha.");
                        input = keyboard.nextLine();
                        option = consoleInputVerificationNumber(input);
                        while(((option != 1) && (option != 2))== true){
                            System.out.println("Ingrese una opción de orden"
                                    + " válida.");
                            input = keyboard.nextLine(); 
                            option = consoleInputVerificationNumber(input);
                        }
                        
                        if (option == 1) {
                            System.out.println("Elija el orden deseado \n"
                                    + " 1. Descendente. \n"
                                    + " 2. Ascendente. \n"
                                    + " 3. Orden inicial de las canciones.");
                            input = keyboard.nextLine();
                            option = consoleInputVerificationNumber(input);
                            while(((option != 1) && (option != 2) 
                                    && (option != 3)) == true)
                            {
                                System.out.println("Ingrese una opción de orden"
                                        + " válida.");
                                input = keyboard.nextLine(); 
                                option = consoleInputVerificationNumber(input);
                            }
                            
                            if(option == 1){
                                Collections.sort(list.getArrayList());
                                for (Lists a: list.getArrayList()) {
                                    System.out.println(a.message());
                                }
                                System.out.println();
                            }
                            else if(option == 2){
                                Collections.sort(list.getArrayList(),
                                        Collections.reverseOrder());
                                for (Lists a: list.getArrayList()) {
                                    System.out.println(a.message());
                                }   
                                System.out.println();
                            }
                            else if(option == 3){
                                list.setArrayList(arrayList);
                                System.out.println("Lista:");
                                for(int i = 0; i < arrayList.size(); i++){
                                    for (Lists a : arrayList){
                                        if (a.getIdentifier() == (i + 1)){
                                            System.out.println(a.message());
                                        }
                                    }   
                                }
                                System.out.println();        
                            }
                            else{
                                break;
                            }
                        }
                        else if (option == 2){
                            System.out.println("Elija el orden deseado \n"
                                    + " 1. Descendente. \n 2. Ascendente. \n"
                                    + " 3. Orden inicial de las canciones.");
                            input = keyboard.nextLine();
                            option = consoleInputVerificationNumber(input);
                            while(((option != 1) && (option != 2) 
                                    && (option != 3)) == true)
                            {
                                System.out.println("Ingrese una opción de orden"
                                        + " válida.");
                                input = keyboard.nextLine(); 
                                option = consoleInputVerificationNumber(input);
                            }
                            
                            if(option == 1){
                                Collections.sort(arrayList, new Lists());
                                for (Lists a : arrayList){
                                    System.out.println(a.message());
                                }
                                System.out.println();
                            }
                            else if(option == 2){
                                Collections.sort(arrayList, new Lists());
                                Collections.reverse(arrayList);
                                for (Lists a : arrayList){
                                    System.out.println(a.message());
                                }  
                                System.out.println();
                            }
                            else if(option == 3){
                                list.setArrayList(arrayList);
                                System.out.println("Lista:");
                                for(int i = 0; i < arrayList.size(); i++){
                                    for (Lists a : arrayList){
                                        if (a.getIdentifier() == (i + 1)){
                                            System.out.println(a.message());
                                        }
                                    }   
                                }
                                System.out.println();        
                            }
                            else{
                                break;
                            }
                        }
                        else{
                            break;
                        }  
                    }
                break;
                
                case 5:
                    flag = false;
                    System.out.println("Biblioteca de música cerrada.");
                break;
                
                default:
                    System.out.println(
                            "La opción seleccionada no existe, por favor,"
                                    + " digite una válida. \n");                    
            }
        }
    }

    /**
     * [El objetivo principal de este método es evaluar si el argumento puede
     * ser convertido a tipo entero, el método se utilizará para validar los
     * datos pasados por el usuario en los casos en los que se requiera que 
     * sean numeros enteros.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar si es un numero entero.
     * @return el método retorna el parametro dado convertido a tipo entero si 
     * es posible, de no ser posible retorna el numero cero.
     *      
     * @since [1.0.0]
     */
    public static int consoleInputVerificationNumber(String input){
        try{
            int choice;
            choice = Integer.parseInt(input);
            return choice;
        }
        catch (Exception e){
            return 0;
        }
    }
    
    /**
     * [El objetivo principal de este método es evaluar si el argumento puede
     * ser convertido a tipo localdate, el método se utilizará para validar los
     * datos pasados por el usuario en los casos en los que se requiera que 
     * sean una fecha en el formato yyyy-mm-dd.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar si es una fecha en el formato yyyy-mm-dd.
     * @return el método retorna el parametro dado convertido a tipo localdate
     * si es posible, de no ser posible retorna nada (null).
     *      
     * @since [1.0.0]
     */
    public static LocalDate consoleInputVerificationDate(String input){
        try{
            LocalDate choice = LocalDate.parse(input);
            return choice;
        }
        catch (Exception e){
            return null;
        }
    }
}
