/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author sushmaka
 */
public class PersonHistory {
    
    private ArrayList<Person> personHistory;

    public PersonHistory() {
        
        this.personHistory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }

    
    
    public void deletePerson(Person person){
        personHistory.remove(person);
    }

    public void addPerson(Person person) {
        personHistory.add(person);
    }
    
    public Person searchPerson(String searchValue){
        for(Person person : personHistory){
            if(person.getFirstName().equals(searchValue)){
                return person;
            }else if(person.getLastName().equals(searchValue)){
                return person;
            }else if(person.getWorkAddress().getStreetAddress().equals(searchValue)){
                return person;
            }else if(person.getHomeAddress().getStreetAddress().equals(searchValue)){
                return person;
            }
        }
        return null;
    }

    
    
}
