/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 * @author rash4
 */
public class Owner {
private static long OwnersCounter = 0;
    private static final Map<Long, Owner> OWNERS = new HashMap<>();
    @SuppressWarnings("LeakingThisInConstructor")
    public Owner(Person person) {
        if (person == null) 
            throw new IllegalArgumentException("Person cannot be null");
        this.person = person;
        // assign unique tenant ID
        this.OwnerId = ++OwnersCounter;
        // register in TENANTS map
        OWNERS.put(this.OwnerId, this);
    }
    public Person getPerson() {return person;}
    public long getOwnerId() {return OwnerId;}
    @Override public String toString() {
        return "Owner{" + "person=" + person + ", ownerId=" + OwnerId + '}';
    }
    public static Owner getTenantById(long id) {
        return OWNERS.get(id);
    }
    public static Tenant[] allTenants() {
        return OWNERS.values().toArray(Tenant[]::new);
    }
    
    // The actual person
    final Person person;
    private final long OwnerId; // optional unique ID for tenants
}