/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Product.CoarseSandFactory;
import Product.Product;

/**
 *
 * @author Mark
 */
public class Main {
    
    public static void main(String[] args)
    {
        CustomerFactory cf = new CustomerFactory();
        StaffFactory sf = new StaffFactory();
        
        
        User stan = cf.createUser("Stan");
        User kyle = cf.createUser("Kyle");
        
        User eric = sf.createUser("Eric");
        User kenny = sf.createUser("Kenny");
        
        System.out.println(stan.getUsername());
        System.out.println(eric.getUsername());
        System.out.println(kyle.getUsername());
        System.out.println(kenny.getUsername());
        
        
        CoarseSandFactory csf = new CoarseSandFactory();
        
        Product coarseSand = csf.createProduct("coarse sand", 200);
   
        stan.userCart.addProduct(coarseSand);
        System.out.println(stan.userCart.getString());
        
    }
    
}
