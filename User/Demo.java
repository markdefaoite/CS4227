/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Cart.CoarseSandFactory;
import Cart.Product;

/**
 *
 * @author Mark
 */
public class Demo {
    
    public static void main(String[] args)
    {
        CustomerFactory cf = new CustomerFactory();
        StaffFactory sf = new StaffFactory();
        
        
        Customer stan = (Customer) cf.createUser("Stan");
        Customer kyle = (Customer) cf.createUser("Kyle");
        
        User eric = sf.createUser("Eric");
        User kenny = sf.createUser("Kenny");
        
        System.out.println(stan.getUsername());
        System.out.println(eric.getUsername());
        System.out.println(kyle.getUsername());
        System.out.println(kenny.getUsername());
        
        
        CoarseSandFactory csf = new CoarseSandFactory();
        
        Product coarseSand = csf.createProduct("coarse sand", 200);
        Product cSand = csf.createProduct("yet more coarse sand", 400);
   
        stan.userCart.addProduct(coarseSand);
        System.out.println("##### 0 #####");
        System.out.println(stan.userCart.getProduct(0).getName());
        
        System.out.println(stan.userCart.getPrice());
        System.out.println(kyle.userCart.getPrice());
        
        kyle.userCart.addProduct(cSand);
        System.out.println("##### 1 #####");
        System.out.println(kyle.userCart.getProduct(0).getName());
         
        
        System.out.println(stan.userCart.getPrice());
        System.out.println(kyle.userCart.getPrice());
        
    }
    
}
