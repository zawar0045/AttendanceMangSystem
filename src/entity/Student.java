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
public class Student extends Peron {
    private int s_Id;
    private String Fname;
    private String Psvd;
    private float GPA;
 private String atendace;
    public Student() {
        this(0,"","","",0,"","","");
        
    }

    public String getAtendace() {
        return atendace;
    }

    public void setAtendace(String atendace) {
        this.atendace = atendace;
    }


    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public Student(int s_Id,String fname, String Psvd,String email ,float GPA,String name,String ph_no,String address) {
      super(name,ph_no,address,email);
        this.s_Id = s_Id;
        this.Fname=fname;
        this.Psvd = Psvd;
        this.GPA = GPA;
    }

    public Student(String name, String Psvd) {
      super.setName(name);
        this.Psvd = Psvd;
    }

    public int getS_Id() {
        return s_Id;
    }

    public void setS_Id(int s_Id) {
        this.s_Id = s_Id;
    }

    public String getPsvd() {
        return Psvd;
    }

    public void setPsvd(String Psvd) {
        this.Psvd = Psvd;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    
    
    
}
