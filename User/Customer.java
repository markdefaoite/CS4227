/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Cart.Cart;
import Cart.Icart;
import Cart.Product;

/**
 *
 * @author Mark
 */
public class Customer extends User implements Icart {
    
    public Cart userCart = new Cart();
    
    public Customer(String username){
        this.username = username;
          
    }

    @Override
    public void addProduct(Product p) {
        userCart.addProduct(p);
    }

    @Override
    public void removeProduct(Product p) {
        userCart.removeProduct(p);
    }

    @Override
    public String getString() {
        return userCart.getString();
    }

    @Override
    public double getPrice() {
        return userCart.getPrice();
    }

    @Override
    public Product getProduct(int i) {
        return userCart.getProduct(i);
    }

    @Override
    public int getNumItems() {
        return userCart.getNumItems();
    }
    
}
