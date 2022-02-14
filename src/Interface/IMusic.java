package Interface;

import Class.Lists;
import java.util.ArrayList;

/**
 * [ Esta interfaz tiene como objetivo la declaración de los métodos que 
 * van a ser implementados por la clase listas.
 * ]
 *
 * @version ["VS" 1.0.0,2022-02-14
 *
 * 1.0.0,2022-02-14, La interfaz corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings ]
 *
 * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
 * 
 * @since [1.0.0]
 *
 */
public interface IMusic {
    
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
    public ArrayList<Lists> toSearch(String genre);  
    
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
    public ArrayList<Lists> toSearch(int year);
    
}
