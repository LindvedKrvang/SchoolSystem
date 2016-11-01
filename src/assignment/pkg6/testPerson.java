/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import assignment.be.Person;

/**
 *
 * @author Rasmus
 */
public class testPerson 
{
//    List<Person> people = new ArrayList();
    PersonsManager pm = new PersonsManager();
    MainMenu mm = new MainMenu(pm, "Test Menu", "Option 1", "Option 2", "Option 3");
    
    public testPerson()
    {
        //Used for before exercise 5.
//        Person a = new Person(1,"Rasmus");
//        Person b = new Person(2, "Mathias");
//        Person c = new Person(3, "Jacob");
        
        
        Teacher d = new Teacher(11, "Peter", "ps");
        Teacher e = new Teacher(12, "Jeppe", "jm");
        Student f = new Student(101, "Cecillie", "CS");
        Student g = new Student(102, "Simon", "CS");
        
        d.setEmail("email@1.com");
        d.addSubject("Programming");
        d.addSubject("English");
        
        e.setEmail("email@2.com");
        e.addSubject("English");
        e.addSubject("Programming");
        
        GradeInfo someClass = new GradeInfo("SCO", 10);
        GradeInfo someOtherClass = new GradeInfo("SDE", 8);
        f.addGrade(someClass);
        f.addGrade(someOtherClass);
        f.setEmail("email@3.com");
        
        GradeInfo someClass1 = new GradeInfo("SCO", 5);
        GradeInfo someOtherClass1 = new GradeInfo("SDE", 7);
        g.addGrade(someClass1);
        g.addGrade(someOtherClass1);
        g.setEmail("email@4.com");
        
        //Used for before exercise 5.
//        pm.addPerson(a);
//        pm.addPerson(b);
//        pm.addPerson(c);

        pm.addPerson(d);
        pm.addPerson(e);
        pm.addPerson(f);
        pm.addPerson(g);
        
        for (Person allPerson : pm.getAllPersons())
        {
            System.out.println(allPerson);
        }
        
        System.out.println(pm.getAllStudents());
        pm.removePerson(11);
        System.out.println(pm.getAllTeachers());
        System.out.println(pm.getPerson(102));
        
        mm.run();
        
        
        
        //Used for before exercise 4.
//        people.add(a);
//        people.add(b);
//        people.add(c);
//        people.add(d);
//        people.add(e);
//        people.add(f);
//        people.add(g);
//        for(Person person : people)
//        {
//            System.out.println(person.toString());
//        }
    }
}
