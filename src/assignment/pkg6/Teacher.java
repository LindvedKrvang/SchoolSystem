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
public class Teacher extends Person
{
    private List<String> subjects = new ArrayList();
    private String initials;
    private double salery;
    
    public Teacher(int id, String name, String initials)
    {
        super(id, name);
        this.initials = initials;
    }
    
    public List<String> getSubjects()
    {
        return subjects;
    }
    
    public String getInitials()
    {
        return initials;
    }
    
    public double getSalary()
    {
        return salery;
    }
    
    public void addSubject(String subject)
    {
        subjects.add(subject);
    }
    
    public void setSalary(double salary)
    {
        this.salery = salary;
    }

    @Override
    public String toString() 
    {
        String teacherInfo = "";
        
        teacherInfo = getId() + "\t" + getName() + "\t" + getEmail() + 
                "\t" + getInitials(); // + "\t" + subjects.get(0);
        
        return teacherInfo;
    }
    
    
}
