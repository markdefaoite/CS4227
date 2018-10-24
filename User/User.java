/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Product.Cart;
import Product.Icart;
import Product.Product;

/**
 *
 * @author Mark
 */
public abstract class User implements Icart {
    Cart userCart = new Cart();
    String username;
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    @Override
    public void addProduct(Product p)
    {
        userCart.addProduct(p);
    }
    
    @Override
    public void removeProduct(Product p)
    {
        userCart.removeProduct(p);
    }
    
    
    @Override
    public String getString()
    {
        return userCart.getString();
    }
    
}
