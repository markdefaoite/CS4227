/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

/**
 *
 * @author Mark
 */
public interface ProductFactory {
    
    Product createProduct(String name, double price);
    
}
