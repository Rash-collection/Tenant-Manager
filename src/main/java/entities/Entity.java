/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 * <p>The Root class of all entity object, no behavior here.</p>
 * @author rash4
 */
public class Entity <T extends Entity<T>>{
    public Entity(){}
    
    /**
     * <p>Self-Cast</p>
     * @return      object of the declared {@code (T)} subclass-type.
     */
    @SuppressWarnings("unchecked")
    protected final T self(){
        return (T)this;
    }
}