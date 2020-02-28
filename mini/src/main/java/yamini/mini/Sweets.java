package yamini.mini;

import java.util.Comparator;

class Sweets{
    String name;
    String type;
    int cost;
    int weight;
    Sweets(String name,String type,int cost,int weight){
        this.name=name;
        this.type=type;
        this.cost=cost;
        this.weight=weight;
    }
}
class Sortbyweight implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.weight - b.weight; 
    } 
}
class Sortbycost implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.cost - b.cost; 
    } 
}
class Sortbytype implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.type.compareTo(b.type); 
    } 
}
