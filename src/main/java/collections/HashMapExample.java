package collections;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapExample {
    Map<String, Integer> employees = new HashMap<>();

    HashMapExample(){
        employees.put("karanpal.dhillon@gmail.com", 1);
        employees.put("johndoe@example.com", 2);
        employees.put("janedoe@example.com", 3);
        employees.put("someemail@gmail.com", 4);
    }


    public Integer getEmp(String key){
        return employees.get(key);
    }

    public void removeEmp(String key){
       employees.remove(key);
    }

    public void begin(){
        int empNo = getEmp("karanpal.dhillon@gmail.com");
        System.out.println(empNo);
        Set<String> keys = employees.keySet();
//        List<String> key = employees.keySet().stream().collect(Collectors.toList());
        Collection<Integer> values =  employees.values();

//        for(String k: keys){
//            System.out.println(k);
//        }
//        for(int v: values){
//            System.out.println(v);
//        }

        for(String k: employees.keySet()){
            System.out.println(k + " -> " +employees.get(k));
        }

    }
    public static void main(String[] args) {
        HashMapExample self = new HashMapExample();
        self.begin();
    }
}
