/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Mark
 */
public class CustomerFactory implements UserFactory{

    @Override
    public User createUser(String username) {
        return new Customer("c." + username);
    }
    
}
