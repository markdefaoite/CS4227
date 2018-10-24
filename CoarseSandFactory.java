/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Mark
 */
public class CoarseSandFactory implements ProductFactory{

    @Override
    public Product createProduct(String name, double price) {
        return new CoarseSand(name, price);
    }
    
}
