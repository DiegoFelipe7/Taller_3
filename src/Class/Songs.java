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
* 1.0.0,2022-02-13, La clase corresponde a la versión 1.0.1 del sistema,
* la misma a hasta el momento no a recibido ningun refactorings ]
* cm se realizo cambios en los atributos de la clase,los cuales pasaron de ser
* publicos a privados
* @author [Diego felipe , diegofelipem99@gmailcom.]
* 
* @since [1.0.0]
*
*/
public abstract class Songs {
    /*
    *declaracion de los atributos de clase
    */
    private String title;
    private int identifier;
    private LocalDate date;
    private double duration;
    private String genre;
    private String cover;
    private String description;
    

     /**

     * Constructor con los atributos de la clase

     * @param title hace referencia al título de la canción que se agregará.
     * @param identifier hace referencia al identificador unico de cada canción.
     * @param date hace referencia a la fecha de lanzamiento de la canción.
     * @param duration hace refencia a la duración de la canción en segundos.
     * @param genre hace referencia al género de la canción.
     * @param cover hace referencia a la portada de la canción.
     * @param description hace referencia a una descripción de la canción.

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
        return "Song " + getIdentifier() + "\n" + "Title = " + getTitle() + "\n" + 
                "Date = " + getDate() + "\n" + "Duration = " + getDuration() + "\n" + 
                "Genre = " + getGenre() + "\n" + "Cover = " + getCover() + "\n" + 
                "Description = " + getDescription() + "\n";
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