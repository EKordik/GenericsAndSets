/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.with.generics;

import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author emmakordik
 */
public class PracticeList {
    public static void main(String[] args) {
//        List<String> beatles = new ArrayList<>();
//        beatles.add("John");
//        beatles.add("Paul");
//        beatles.add("George");
//        
//        String favoriteBeatle = beatles.get(0);
//        
//        beatles.add(1, "Ringo");
//        
//        beatles.remove("George");
//                
//        for(String s: beatles){
//            System.out.println(s);
//        }
//        
//        List<String> postcards = new ArrayList<>();
//        postcards.add("State");
//        postcards.add("UNESCO");
//        postcards.add("World");
//        
//        postcards.add(1, "Map");
//        postcards.set(1, "Country");
//        
//        postcards.sort(null);
//        
//        System.out.println(postcards.indexOf("UNESCO"));
//     
//        
//        List<String> collectiona = postcards.subList(1, 2);
//        
//        for(String s: collectiona){
//            System.out.println(s);
//        }
//        
//        System.out.println("");
//        for(int i = 0; i<postcards.size(); i++){
//            String s = (String)postcards.get(i);
//            System.out.println(s);
//        }
//        
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Smith","John","555-55-5555"));
        employees.add(new Employee("Jones","Bob", "333-33-3333"));
        employees.add(new Employee("Smith","Sally","333-33-3333"));
        
        Set<Employee> noDupes = new HashSet<>(employees);
        employees = new ArrayList(noDupes);
        
        
        for(Employee e: employees){
            System.out.println(e.getLastName());
        }
        
        Employee e1 = employees.get(1);
        Employee e2 = employees.get(2);
        
        if(e1.equals(e2)){
            System.out.println("The Two Employes are equal");
        }else{
            System.out.println("Employes are not the same");
        }
    }
}
