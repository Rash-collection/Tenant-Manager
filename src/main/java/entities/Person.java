/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

import java.util.List;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * Minimal person info such as name and ID when the ID is to differentiate 
 * between persons with the same name.
 * </p>
 * @see     Name
 * @author rash4
 */
public record Person (PersonName NAME, Instant ID) implements Comparable<Person>{
    final static java.util.Map<Instant, Person> PEOPLE;
    private final static Object CHAIN;
    /**
     * <p>The main(conical) constructor of this {@code record}.</p>
     * <p>Better use the one-param-constructor {@link #Person(java.lang.String)}</p>
     * @param NAME  the name object
     * @param ID    the Instant object as a Unique value (usually null)
     * because it gets the {@link java.time.Instant#now()} value inside the constructor.
     */
    @SuppressWarnings("LeakingThisInConstructor")
    public Person{
        if(NAME == null) throw new IllegalArgumentException("Invalid Name object.");
        // this is better
        if(ID == null) ID = Instant.now();
        if(PEOPLE.putIfAbsent(ID, this) != null)
            throw new IllegalArgumentException(
                    "ID (key) is already occupied in the PEOPLE-list.");
    }
    public Person(String name){
        this(new PersonName(name), null);
    }
    @Override public int compareTo(Person o) {
        return this.ID.compareTo(o.ID);
    }
    /**
     * <p>Get a person by their unique ID.</p>
      * @param id unique ID to get from the static list.
      * @return person object from the private list that saves all persons.
      * @see PEOPLE
     */
    public static Person getById(Instant id) {
        return PEOPLE.get(id);
    }
    public static Person personByName(String name){
        final var persons = personsByName(name);
        return persons.length == 0 ? null : persons[0];
    }
    public static Person[] personsByName(String name){
        if(name == null || name.isBlank())return new Person[0];
        final List<Person> list = new ArrayList<>();
        for(Person person : PEOPLE.values()){
            if(person.NAME.equals(name))
                list.add(person);
        }
        return list.stream()
                .sorted(java.util.Comparator.reverseOrder())
                .toArray(Person[]::new);
    }
    static{
        CHAIN = new Object();
        // concurrent (it doesn't need synch-block)
        PEOPLE = new ConcurrentHashMap<>();
    }
}