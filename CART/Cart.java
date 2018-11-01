/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import STORE.Product;
import java.util.ArrayList;

/**
 *
 * @author Mark
 */
public class Cart implements Icart{
  
    double totalPrice = 0;
    int items = 0;
    public ArrayList<Product> cart;
    
    public Cart()
    {
        this.cart = new ArrayList<>();
        
    }
    
    @Override
    public void addProduct(Product p)
    {
        cart.add(p);
        totalPrice += Double.parseDouble(p.getProdName());
        items++;
    }
    
    @Override
    public void removeProduct(Product p)
    {
        cart.remove(p);
        totalPrice -= Double.parseDouble(p.getProdName());
        items--;
    }

    @Override
    public String getString()
    {
        return cart.toString();
    }

    @Override
    public double getPrice() {
        return totalPrice;
    }

    @Override
    public Product getProduct(int i) {
        return cart.get(i);
    }

    @Override
    public int getNumItems() {
        return items;
    }
    
    public void applyDiscount()
    {
        int type = 0;
        
        DiscountFacade facade = new DiscountFacade();
                
        double discount = facade.discount(this,type );
        
        double temp = totalPrice * discount;
        totalPrice -= temp;
    }
}
