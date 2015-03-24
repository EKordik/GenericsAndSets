/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.with.generics;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author emmakordik
 */
public class LabForLists {
    public static void main(String[] args) {
        /** 
         * Lab 1
         */
//        List postcards = new ArrayList();
//        postcards.add("Wisconsin State");
//        postcards.add("Country Cards");
//        postcards.add("Maps");
//        
//        for(int i = 0; i<postcards.size(); i++){
//            System.out.println((String)postcards.get(i));
//        }
//        
//        postcards.add("UNESCO");
//        postcards.add("Mounments");
//        
//        for(int i= 0; i<postcards.size(); i++){
//            System.out.println((String)postcards.get(i));
//        }
//        
//        postcards.remove(4);
//        postcards.remove("Wisconsin State");
//        
//        for(int i = 0; i<postcards.size(); i++){
//            System.out.println((String)postcards.get(i));
//        }
        
        /**
         * Lab 2
         */
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Smith", "John", "555-55-5555"));
//        employees.add(new Employee("Jones", "Steve", "444-44-4444"));
//        employees.add(new Employee("Black", "Sally", "333-33-3333"));
//        
//        for(Employee e: employees){
//            System.out.println(e.getFirstName() + " " + e.getLastName() + " " +
//                    e.getSsn());
//        }
       
        /**
         * Lab 3
         */
//        List things = new ArrayList();
//        things.add(new Employee("Doe", "John", "666-66-6666"));
//        things.add(new Employee("Que", "Betty", "777-77-7777"));
//        things.add(new Dog("Fred", 1234));
//        things.add(new Dog("Bruno", 2334));
//        
//        for(int i = 0; i<things.size(); i++){
//            System.out.println(things.get(i).toString());
//        }        
          
        /**
         * Lab 4
         */
         List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Smith","John","555-55-5555"));
        employees.add(new Employee("Jones","Bob", "333-33-3333"));
        employees.add(new Employee("Smith","Sally","333-33-3333"));
        
        Set<Employee> noDupes = new HashSet<>(employees);
        employees = new ArrayList(noDupes);
        
        
        for(Employee e: employees){
            System.out.println(e.getLastName());
        }
    }
}
