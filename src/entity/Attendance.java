/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;


/**
 *
 * @author ABDUL MOIZ
 */
public class Attendance {
   private String date;
   private  String time;
   private  ArrayList<Student> std;
   private Course course;
   private Section sec;
    public Attendance() {
         std = new ArrayList();
    }

    public Section getSec() {
        return sec;
    }

    public void setSec(Section sec) {
        this.sec = sec;
    }

    public Attendance(Course course) {
        this.course = course;
    }

    
    public Attendance(ArrayList<Student> std, Course course,Section Atendace) {
        this.std = std;
        this.course = course;
        this.sec = Atendace;
    }

    public Attendance(String date, String time, ArrayList<Student> std, Course course, Section Atendace) {
        this.date = date;
        this.time = time;
        this.std = std;
        this.course = course;
        this.sec = Atendace;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Student> getStd() {
        return std;
    }

    public void setStd(Student std) {
        this.std.add(std);
        University.erorr("Added Succesfully");
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

  

    
   
    
}
