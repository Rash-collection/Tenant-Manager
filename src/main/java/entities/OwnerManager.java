/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Supposed to be as the name implication, Owner -is-> this app user.</p>
 * <p>So in short, this is to manage different users on the log-in.</p>
 * @author rash4
 */
@annot.Status("A placeholder since (16/03).")
public class OwnerManager {
    private final Map<Long, Owner> owners = new HashMap<>();
    private long counter = 0;
    
    @annot.Notes("when the database is there, beware of repeated numbers.")
    public Owner createOwner(Person person) {
        Owner o = new Owner(person);
        owners.put(o.getOwnerId(), o);
        return o;
    }
    
    public Owner getOwnerById(long id) {
        return owners.get(id);
    }
    
    public Owner[] allOwners() {
        return owners.values().toArray(Owner[]::new);
    }
}