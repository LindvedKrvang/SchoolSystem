/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.be;

/**
 *
 * @author Rasmus
 */
public abstract class Person 
{
    private int id;
    private String name;
    private String email;
    
    /**
     * Set the id and name for the person.
     * @param id
     * @param name 
     */
    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
//        this.email = email;
    }
    /**
     * Returns the id of the person.
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Returns the name of the person.
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the email of the person.
     * @return email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Sets the name of the person.
     * @param name 
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Sets the email of the person.
     * @param email 
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Returns the id, name and email with tabs in between as a String.
     * @return id, name, email as String
     */
    @Override
    public String toString() 
    {
        return id + "\t" + name + "\t" + email + ".";
    }    
}
