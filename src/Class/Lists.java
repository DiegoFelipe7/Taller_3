package Class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * [ Esta clase implementa de la clase abstracta y extiende de las interfaces 
 * música, comparable y comparator. Su objetivo es la creación de las canciones, 
 * la lista de estas y sus métodos.
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
public class Lists 
    extends Songs 
        implements Interface.IMusic ,Comparable<Lists>, Comparator<Lists>  
{
    
    public ArrayList<Lists> arrayList = new ArrayList<>();

    /**
     * Constructor de la clase lista, el cual sirve para la creación de 
     * canciones con toda su información.
     * @param title hace referencia al título de la canción que se agregará.
     * @param identifier hace referencia al identificador unico de cada canción.
     * @param date hace referencia a la fecha de lanzamiento de la canción.
     * @param duration hace refencia a la duración de la canción en segundos.
     * @param genre hace referencia al género de la canción.
     * @param cover hace referencia a la portada de la canción.
     * @param description hace referencia a una descripción de la canción.
     */
    public Lists(
            String title, 
            int identifier, 
            LocalDate date, 
            double duration, 
            String genre, 
            String cover, 
            String description) 
    {
        super(title, identifier, date, duration, genre, cover, description);
    }

    public Lists() {
    }

    public ArrayList<Lists> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Lists> arrayList) {
        this.arrayList = arrayList;
    } 
    
    /**
    * [este metodo calcula el numero de canciones que hay en una playlist
    *]
    *
    * @return el tamaño del arreglo
    * @throws Exception
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
    @Override
    public int musicCounter() {
        return arrayList.size();  
    }  
    
      /**
    * [el objetivo de este metodo es enviar un mensaje con la informacion de
    * alguna cancion
    *]
    *
    * @return mensaje
    * @throws Exception
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
    @Override
    public String message() {
        return "Song: " + getIdentifier() + " - Título: " + getTitle() + 
                " - Duración: " + getDuration() + " - Fecha: " + getDate();
    }
    
    /**
    * [El objetivo principal de este metodo es realizar una filtro
    *en un arraylist,en este caso por un genero musical
    * ]
    *
    * @param genre
    * @return ArrayList con todas las canciones que pertenecen a un genero
    * musical.
    * @throws Exception
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
    @Override
    public ArrayList<Lists> toSearch(String genre) {
        ArrayList<Lists> search = new ArrayList<>();
        for (Lists lists : arrayList) {
            if(lists.getGenre().equalsIgnoreCase(genre)){
                search.add(lists);
            }
        }
        return search;
    }

    /**
     * [El objetivo principal de este método es realizar un filtro
     * en un arraylist,en este caso por año de lanzamiento
     * ]
     *
     * @param year Describe el año a partir del cual se realizará el filtro.
     * @return ArrayList con todas las canciones que pertenecen a un mismo
     * año de lanzamiento.
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
     */
    @Override
    public ArrayList<Lists> toSearch(int year) {
        ArrayList<Lists> search = new ArrayList<>();
        for (Lists lists : arrayList) {
            if(lists.getDate().getYear() == year){
                search.add(lists);
            }
        }
        return search;        
    }

    /**
     * [Este metodo es la implementacion de una interfaz la cual tiene como
     * objetivo ordenar las canciones de acuerdo a su duración de la siguiente
     * manera: Descendente, Ascendente, Orden inicial de las canciones.
     * ]
     *
     * @param o Describe la lista de canciones a la cual se quiere aplicar 
     * el ordenamiento
     * @return Un numero entero (1, -1, o 0) que prioriza cada objeto de la 
     * lista para realizar el ordenamiento de la lista.
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
     */
    @Override
    public int compareTo(Lists o) {
        if (getDuration() < o.getDuration()) {
            return -1;
        } else if (getDuration() > o.getDuration()) {
            return 1;
        } else {
            return 0;
        } 
    }
    
    /**
    * [Este metodo es la implementacion de una interfaz la cual tiene como
    * objetivo ordenar las fechas de la siguiente manera:Descendente,Ascendente,
    * Orden inicial de las canciones.]
    *
    * @param Lists 
    * @return int con el orden que se el usuario selecciono
    * 
    * musical.
    * @throws Exception
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
    @Override
    public int compare(Lists o1, Lists o2) {
    if (o1.getDate().isBefore(o2.getDate())) {
            return -1;
        } else if (o1.getDate().isAfter(o2.getDate())) {
            return 1;
        } else {
            return 0;
        }
    }  
}
