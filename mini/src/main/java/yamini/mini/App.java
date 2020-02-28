 package yamini.mini;

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
 public class App
 {
     public static void main( String[] args )
     {
         List<Sweets> gift = new ArrayList<>();
         Sweets choco1=new chocolate("dark Choclate","100%", 2,20);
         gift.add(choco1);
         Sweets choco2=new chocolate("white Choclate","90%", 1,10);
         gift.add(choco2);
         Sweets choco3=new candy("Caramel","80%", 2,10);
         gift.add(choco3);
         Sweets choco4=new candy("Milk","20%", 8,20);
         gift.add(choco4);
         Sweets choco5=new Jellybeans("Crunchy","30%",5,20);
         gift.add(choco5);
         Sweets choco6=new candy("Toffey","60%",2,5);
         gift.add(choco6);
         Sweets choco7=new candy("Bars","70%",3,7);
         gift.add(choco7);
         Sweets choco8=new candy("Nuts","45%",6,4);
         gift.add(choco8);
         List<Sweets> chocolate=new ArrayList<>();
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof chocolate){
                 chocolate.add(gift.get(i));
             }
         }
         System.out.println("Chocolates sorted by their weights");
         Collections.sort(chocolate,new Sortbyweight());
         for(int i=0;i<chocolate.size();i++){
             System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+chocolate.get(i).weight+"gms");
         }
         System.out.println();
         System.out.println("Chocolates sorted by their cost");
         Collections.sort(chocolate,new Sortbycost());
         for(int i=0;i<chocolate.size();i++){
         System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+chocolate.get(i).weight+"gms");
         }
         System.out.println();
         Collections.sort(chocolate,new Sortbytype());
         System.out.println("Chocolates sorted by their content %");
         for(int i=0;i<chocolate.size();i++){
         System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+chocolate.get(i).weight+"gms");
         }
         int net_weight=0;
         for(int i=0;i<gift.size();i++){
             net_weight+=gift.get(i).weight;
         }
         System.out.println();
         System.out.println("Total weight of gift "+net_weight+"gm");
         int count_candies=0;
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof candy){
                 count_candies++;
             }
         }
         System.out.println();
         System.out.println("No of Candies is "+count_candies);
         System.out.println("");
         System.out.println("candies between range of the cost in between 2 to 5\n");
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof candy){
                 if(gift.get(i).cost<=5 && gift.get(i).cost>=2) {
                 System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weigth of Candy is "+gift.get(i).weight+"gms");
                 }
             }
         }
         System.out.println("");
         System.out.println("candies between range of the weigth in between 2 to 9\n");
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof candy){
                 if(gift.get(i).weight<=5 && gift.get(i).weight>=2) {
                 System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weigth of Candy is "+gift.get(i).weight+"gms");
                 }
             }
         }
        
     }
 }