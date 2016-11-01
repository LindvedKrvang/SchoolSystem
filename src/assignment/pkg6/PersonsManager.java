/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import assignment.be.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rasmus
 */
public class PersonsManager 
{
    private List<Person> persons ;
    
    public PersonsManager()
    {
        persons = new ArrayList<>();
    }
    
    public Person getPerson(int id)
    {
        int personToReturn = 0;
        boolean canReturn = false;
        
        for(int i = 0; i < persons.size(); i++)
        {
            if(persons.get(i).getId() == id)
            {
                personToReturn = i;
                canReturn = true;
            }
        }
        if(canReturn)
        {
            return persons.get(personToReturn);
        }
        else
        {
            return null;
        }
    }
    
    public boolean addPerson(Person p)
    {
        boolean sameId = false;
        boolean isAdded = false;
        
        for(Person ps : persons)
        {
            if(ps.getId() == p.getId())
            {
                sameId = true;
            }
        }
        
        if(sameId == false)
        {
            persons.add(p);
            isAdded = true;
        }
        else
        {
            System.out.println("That id is already taken. Choose aother id "
                    + "if you wish to add the person.");
        }
        return isAdded;
    }
    
    public boolean removePerson(int id)
    {
        int toRemove = 0;
        boolean canRemove = false;
        boolean wasRemoved = false;
        
        for(int i = 0; i < persons.size(); i++)
        {
            if(persons.get(i).getId() == id)
            {
                toRemove = i;
                canRemove = true;
            }
        }
        if(canRemove)
        {
            persons.remove(toRemove);
            wasRemoved = true;
        }
        return wasRemoved;
    }
    
    public List<Person> getAllPersons()
    {
        return persons;
    }
    
    public List<Student> getAllStudents()
    {
        List<Student> allStudents = new ArrayList();
        
        for(Person pl : persons)
        {
            if(pl instanceof Student)
            {
                allStudents.add((Student) pl);
            }
        }
        
        return allStudents;
    }
    
    public List<Person> getAllTeachers()
    {
        List<Person> allTeachers = new ArrayList();
        
        for(Person pl : persons)
        {
            if(pl.getId() <= 100 && pl.getId() > 10)
            {
                allTeachers.add(pl);
            }
        }
        return allTeachers;
    }
    
    public void operation()
    {
        
    }
}
