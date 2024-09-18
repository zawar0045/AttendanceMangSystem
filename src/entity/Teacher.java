package entity;

public class Teacher extends Peron {
   
    
   private String t_id;
   private String tpswd;
   
    public Teacher() {
    
        this("","","","","","");
        
    }

    public Teacher(String n,String tpswd) {
        super.setName(n);
        this.tpswd = tpswd;
    }

    public Teacher(String tname,String email,String phno,String address,String t_id,String tpswd) {
        super( tname , phno,address,email);

        this.t_id = t_id;
        this.tpswd = tpswd;
       
    }


    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public String getTpswd() {
        return tpswd;
    }

    public void setTpswd(String pswd) {
        this.tpswd = pswd;
    }
    }
