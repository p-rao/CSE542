/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newuser;

/**
 *
 * @author Priya Rao
 */
public class NewUser {
    private String name = "";
    private String email = "";
    private String password = "";
    private boolean IsPaused = false;
    
    public String getName() {
      return name;
    }

    public void setName(String newName) {
      this.name = newName;
    }
    
    public String getEmail() {
      return email;
    }

    public void setEmail(String emailID) {
      this.email = emailID;
    }
    
    public String getPassword() {
      return password;
    }

    public void setPassword(String newPassword) {
      this.password = newPassword;
    }
    
    public boolean getStatus(){
        return this.IsPaused;
    }
    
    public void setStatus(){
        if (this.IsPaused){
            this.IsPaused = false;
        } 
        else
            this.IsPaused = true;
    }
    
    public NewUser(String newName, String email, String password){
        this.name = newName;
        this.email = email;
        this.password = password;
        this.IsPaused = false;
    }
}
