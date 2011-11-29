
/**
 *  Maintains information about the rooms.
 *
 * @ author Taylor countryman
 * @ version 11-28-2011
 */

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Room
{
    String roomDescription;
    Item item;
    private Map< String, Room> level;

    public Room (String pDescription){
        item = null;
    }
   
    public Room (String pDescription, Item pItem){
        roomDescription = pDescription;
        item = pItem;
    }

    public void addItem(Item i){
        i = item;
    }

    public boolean hasItem(){
        if( item == null)
            return false;
        else
            return true;
    }

    public void addNeighbor(String pDirection, Room r){
        
    }
        
}
