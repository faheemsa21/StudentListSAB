/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *generic comment
 */
package studentlist;

/**
 *
 * @author Sabahat
 */
public class Student {

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getAddress() {
        return address;
    }
  
    private String name;
    private String studentID;
    private String address;

    public Student(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
}
