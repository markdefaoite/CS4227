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
public interface Icart {
    
    ArrayList<Product> cart = new ArrayList<>();
    public void addProduct(Product p);
    public void removeProduct(Product p);
    public String getString();
    
}
