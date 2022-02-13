package Interface;

import Class.Lists;
import java.util.ArrayList;

/**
 *
 * @author ASUS
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
    
    public ArrayList<Lists> toSearch(int year);
    
}
