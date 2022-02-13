package Class;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public abstract class Songs {
    
    public String title;
    public LocalDate date;
    public double duration;
    public String genre;
    public String cover;
    public String description;
    private int identifier;

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
    }

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

    @Override
    public String toString() {
        return "Song " + identifier + "\n" + "Title = " + title + "\n" + 
                "Date = " + date + "\n" + "Duration = " + duration + "\n" + 
                "Genre = " + genre + "\n" + "Cover = " + cover + "\n" + 
                "Description = " + description + "\n";
    }

    public abstract int musicCounter();
    
    public abstract String message();
}