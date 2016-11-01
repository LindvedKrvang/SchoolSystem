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
public class Student extends Person 
{
    private List<GradeInfo> gradeReport = new ArrayList();
    private String education;
    
    public Student(int id, String name, String education) 
    {
        super(id, name);
        this.education = education;
    }
    
    public List<GradeInfo> getGradeReport()
    {
        return gradeReport;
    }
    
    public String getEducation()
    {
        return education;
    }
    
    public double getAverageGrade()
    {
        double averageGradeSum = 0;
        int numberOfSubjects = 0;
        
        for(GradeInfo gr : gradeReport)
        {
            averageGradeSum += gr.getGrade();
            numberOfSubjects++;
        }
        
        averageGradeSum /= numberOfSubjects;
        
        return averageGradeSum;
    }
    
    public int getGrade(String subject)
    {
        int grade = 0;
        for(int i = 0; i < gradeReport.size(); i++)
        {
            GradeInfo subjectUnderAssement = gradeReport.get(i);
            if(subjectUnderAssement.getSubject().equals(subject))
            {
                grade = subjectUnderAssement.getGrade();
            }
        }
        return grade;
    }
    
    public void addGrade(GradeInfo grade)
    {
        gradeReport.add(grade);
    }

    @Override
    public String toString() 
    {
        return getId() + "\t" + getName() + "\t" + getEmail() + "\t" 
                + getEducation() + "\t" + getAverageGrade();
    }    
}
