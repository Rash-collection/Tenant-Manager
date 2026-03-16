/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

import localUtils.Chainable;

/**
 * <p>The Root class of all entity object, no behavior here.</p>
 * @author rash4
 */
public class Entity <T extends Entity<T>> implements Chainable<T>{
    public Entity(){}
    
    
}