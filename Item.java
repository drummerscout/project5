
/***********************************************************************
 * Maintains inforamtion about items.
 *
 *@ Taylor Countryman
 *@ 11-21-2011
 *
 **********************************************************************/

public class Item {
    String itemName;
    String itemInfo;
    int itemWeight;

    public Item(String pitemName){
        itemName = pitemName;
        itemInfo = null;
        itemWeight = 0;
    }

    public Item(String pitemName, String pitemInfo, int pitemWeight){
        itemName = pitemName;
        itemInfo = pitemInfo;
        itemWeight = pitemWeight;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String pitemName){
        itemName = pitemName;
    }

    public String getItemInfo(){
        return itemInfo;
    }

    public void setItemInfo(String pitemInfo){
        itemInfo = pitemInfo;
    }

    public int getItemWeight(){
        return itemWeight;
    }

    public void setItemWeight(int pitemWeight){
        itemWeight = pitemWeight;
    }
}
