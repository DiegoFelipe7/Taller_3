package Class;

import java.time.LocalDate;
/**
* [Esta es la clase abstracta la cual tiene un serie de atributos y metodos que
* posterior mente seran extendidos a otras clases "hijas",el objetivo principal
* de esta clase es ser un modelde sobre el cual se construyen otras clases
*
* ]
*
* @version [ "VS" 1.0.0,2022-02-13
*
* 1.0.0,2022-02-13, La clase corresponde a la versión 1.0.0 del sistema,
* la misma a hasta el momento no a recibido ningun refactorings ]
*
* @author [Diego felipe , diegofelipem99@gmailcom.]
* 
* @since [1.0.0]
*
*/
public abstract class Songs {
    /*
    *declaracion de los atributos de clase
    */
    public String title;
    public LocalDate date;
    public double duration;
    public String genre;
    public String cover;
    public String description;
    private int identifier;

     /**

     * Constructor con los atributos de la clase

     * @param titulo,identificador,fecha,duracion,genero,caratula,descripcion

     */
    public Songs(
            String title, 
            int identifier, 
            LocalDate date, 
            double duration, 
            String genre, 
            String cover, 
            String description) 
    {
        this.title = title;
        this.identifier = identifier;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }//Cierre del constructor

    public Songs() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * [Este metodo convierte un objeto a string, en este caso una canción o
     * un grupo de canciones en string.
     * ]
     *
     * @return un string que muestra la información de una o mas canciones
     * de manera estructurada.
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
     */
    @Override
    public String toString() {
        return "Song " + identifier + "\n" + "Title = " + title + "\n" + 
                "Date = " + date + "\n" + "Duration = " + duration + "\n" + 
                "Genre = " + genre + "\n" + "Cover = " + cover + "\n" + 
                "Description = " + description + "\n";
    }
    
    /**
    * [este metodo abstracto calcula el numero de canciones que hay en una playlist
    *]
    *
    * @throws Exception
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/

    public abstract int musicCounter();
      
      /**
    * [el objetivo de este metodo abstracto es enviar un mensaje con la informacion de
    * alguna cancion 
    *]
    *
    * @return mensaje
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
    public abstract String message();
}