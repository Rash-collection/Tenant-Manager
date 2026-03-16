/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 * <p>The rental-unit of the whole residential building.</p>
 * @author rash4
 */
public class Apartment {
    public Apartment(){
        this.stats = ApartmentStats.AVAILABLE; // default
    }
    /**
     * <p>Shallow copy constructor.</p>
     * @param neo The target apartment object to copy core-info.
     */
    public Apartment(Apartment neo){
    }
    
    public ApartmentStats getStats(){return this.stats;}
    public Apartment setStats(ApartmentStats stat){
        this.stats = stat;
        return this;
    }
    public Apartment setLease(Lease lease){
        this.lease = lease;
        return this;
    }
    ApartmentStats stats;
    Lease lease;
}