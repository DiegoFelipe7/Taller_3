/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Class.Lists;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface IMusic {
    
    public ArrayList<Lists> toSearch(String genre);  
    
    public ArrayList<Lists> toSearch(int year);
    
    public ArrayList<Lists> order(String order);
}
