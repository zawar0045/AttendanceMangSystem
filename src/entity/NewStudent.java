
package entity;

import java.util.ArrayList;

/**
 *
 * @author ABDUL MOIZ
 */
public class NewStudent {
    public static ArrayList<Student> stud;

   static{
    stud = new ArrayList();
    }
public static void  addstud(Student s1){
    if(s1!=null){
        NewStudent.stud.add(s1);
    }
}
    public static ArrayList<Student> getStud() {
        return stud;
    }

    
    
}
