/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 * <p>Simple {@code record} that wraps String value as a name, with a bit of behavior.</p>
 * @see     Person
 * @author rash4
 */
public record PersonName(String value) implements Comparable<PersonName>{
    public PersonName {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Name cannot be blank");
        value = value.trim();
    }
    @Override public int compareTo(PersonName o){
        return this.value.compareToIgnoreCase(o.value);
    }
    public boolean equals(String name){
        if(name == null || name.isBlank()) return false;
        return this.value.equalsIgnoreCase(name);
    }
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonName name)) return false;
        return value.equalsIgnoreCase(name.value);
    }
    @Override public int hashCode() {
        return value.toLowerCase().hashCode();
    }
    @Override public String toString() {
        return value;
    }
}