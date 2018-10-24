/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.ArrayList;

/**
 *
 * @author Mark
 */
public class Cart implements Icart{
  
    //ArrayList<Product> cart = new ArrayList<>();
    
    public Cart()
    {
        
    }
    
    @Override
    public void addProduct(Product p)
    {
        cart.add(p);
    }
    
    @Override
    public void removeProduct(Product p)
    {
        cart.remove(p);
    }

    @Override
    public String getString()
    {
        return cart.toString();
    }
}
