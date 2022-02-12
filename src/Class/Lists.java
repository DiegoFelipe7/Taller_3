/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author ASUS
 */
public class Lists 
    extends Songs 
        implements Interface.IMusic ,Comparable<Lists>, Comparator<Lists>  
{
    
    public ArrayList<Lists> arrayList = new ArrayList<>();

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
    
    @Override
    public int musicCounter() {
        return arrayList.size();  
    }  

    @Override
    public String message() {
        return "Song: " + getIdentifier() + " - Título: " + getTitle() + 
                " - Duración: " + getDuration() + " - Fecha: " + getDate();
    }

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

    @Override
    public ArrayList<Lists> toSearch(int year) {
        ArrayList<Lists> search = new ArrayList<>();
        for (Lists lists : arrayList) {
            if(lists.date.getYear() == year){
                search.add(lists);
            }
        }
        return search;        
    }

    @Override
    public ArrayList<Lists> order(String order) {
        double aux;
        ArrayList<Lists> search = new ArrayList<>();
        if(order.equalsIgnoreCase("ASC")){
            for (Lists lists : search) {
                if(lists.getDuration()>lists.getDuration()+1){
                    search.add(lists);
                }
            }
        }
        return search;  
    }

    @Override
    public int compareTo(Lists o) {
        if (duration < o.duration) {
            return -1;
        } else if (duration > o.duration) {
            return 1;
        } else {
            return 0;
        } 
    }

    @Override
    public int compare(Lists o1, Lists o2) {
    if (o1.date.isBefore(o2.date)) {
            return -1;
        } else if (o1.date.isAfter(o2.date)) {
            return 1;
        } else {
            return 0;
        }
    }  
}
