/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import assignment.be.Person;
import java.util.Scanner;

/**
 *
 * @author Rasmus
 */
public class MainMenu extends Menu
{
    Scanner scan = new Scanner(System.in);
    PersonsManager pm;

    public MainMenu(PersonsManager pm, String header, String... menuItems) 
    {
        super(header, menuItems);
        this.pm = pm;
    }

    @Override
    protected void doAction(int option) 
    {
        switch(option)
        {
            case 1: //Shows all Persons.
            {
                System.out.println("All the Persons at EASV:");
                for (int i = 0; i < pm.getAllPersons().size(); i++)
                {
                    System.out.println(pm.getAllPersons().get(i));
                }
                break;
            }
            case 2: //Shows all Teachers.
            {
                System.out.println("All the Teachers at EASV:");
                for(Person ps : pm.getAllTeachers())
                {
                    System.out.println(ps);
                }
                break;
            }
            case 3: //Shows all Students.
            {
                System.out.println("All the Students at EASV:");
                for(Person ps : pm.getAllStudents())
                {
                    System.out.println(ps);
                }
                break;
            }
            case 4: //Adds a Teacher.
            {
                System.out.print("Enter id: ");
                int id = scan.nextInt();
                System.out.print("Enter name: ");
                String name = scan.next();
                System.out.print("Enter initials: ");
                String initials = scan.next();
                Teacher teacher = new Teacher(id, name, initials);
                if(pm.addPerson(teacher))
                {
                    System.out.println("Teacher: " + id + "; " + name + "; " + initials + 
                        "; has been added to the system.");
                }
                
                break;
            }
            case 5: //Adds a Student.
            {
                System.out.print("Enter id: ");
                int id = scan.nextInt();
                System.out.print("Enter Name: ");
                String name = scan.next();
                System.out.print("Enter Education: ");
                String education = scan.next();
                Student student = new Student(id, name, education);
                if(pm.addPerson(student))
                {
                    System.out.println("Student: " + id + "; " + name + "; " + education + 
                        "; has been added to the system.");
                }                
                break;
            }
            case 6: //Removes a Person.
            {
                System.out.print("Enter id to remove: ");
                int idToRemove = scan.nextInt();
                if(pm.removePerson(idToRemove))
                {
                    System.out.println("The Person was removed");
                }
                else
                {
                    System.out.println("That id does not exist in the system");
                }
                break;
            }
            default:
            {                
                break;
            }
        }              
    }    
}
