/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Tenant is the side that signs the lease with the landlord.</p>
 * @see     Person
 * @see     Lease
 * @author rash4
 */
public class Tenant {
    private static long tenantCounter = 0;
    private static final Map<Long, Tenant> TENANTS = new HashMap<>();
    @SuppressWarnings("LeakingThisInConstructor")
    public Tenant(Person person) {
        if (person == null) throw new IllegalArgumentException("Person cannot be null");
        this.person = person;
        // assign unique tenant ID
        this.tenantId = ++tenantCounter;
        // register in TENANTS map
        TENANTS.put(this.tenantId, this);
    }
    public Person getPerson() {return person;}
    public long getTenantId() {return tenantId;}
    @Override public String toString() {
        return "Tenant{" + "person=" + person + ", tenantId=" + tenantId + '}';
    }
    public static Tenant getTenantById(long id) {
        return TENANTS.get(id);
    }
    public static Tenant[] allTenants() {
        return TENANTS.values().toArray(Tenant[]::new);
    }
    
    // The actual person
    final Person person;
    private final long tenantId; // optional unique ID for tenants
}