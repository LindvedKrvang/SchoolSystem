/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

/**
 *
 * @author Rasmus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//        testPerson tp = new testPerson();
        PersonsManager pm = new PersonsManager();
        MainMenu mm = new MainMenu(pm, "Persons at EASV", "1 Get all Persons", 
                "2 Get all Teachers", "3 Get all Students", "4 Add a Teacher", 
                "5 Add a Student", "6 Remove a Person", "0 Terminate the Program");
        
        mm.run();
    }
    
}
