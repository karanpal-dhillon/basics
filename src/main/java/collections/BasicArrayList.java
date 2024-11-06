package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BasicArrayList {
    List<String> colors = new ArrayList<>();

    BasicArrayList(){
       colors.add("red") ;
        colors.add("yellow") ;
        colors.add("orange") ;
        colors.add("green") ;
        colors.add("blue") ;
    }

    public void begin(){
        List<String> moreColors = new ArrayList<>();
        moreColors.add("cyan");
        moreColors.add("purple");
        moreColors.add("white");
//        for(int i = 0; i < colors.size(); i++ ){
//            System.out.println(colors.get(i));
//        }
        print(colors);
        colors.addAll(moreColors);

        colors.remove("red");
        System.out.println("After removing red");
        print(colors);
        colors.removeIf((color) -> color.startsWith("y"));
        System.out.println("After removing color starting with y");
        printUsingIterator(colors);
    }

//    public boolean removeColor(String color){
//        if(color.startsWith("y")) {
//            return true;
//        }
//        return false;
//    }

    public void print(Collection<String> items){
       for(String item: items){
           System.out.println(item);
       }
    }

    public void printUsingIterator(List<String> items){
        Iterator<String> iter = items.iterator();
        while(iter.hasNext()){
            String color = iter.next();
            if(color.startsWith("b")){
                iter.remove();
            }
            System.out.println(color);
        }
    }

    public static void main(String[] args) {
        BasicArrayList self = new BasicArrayList();
        self.begin();
    }
}
