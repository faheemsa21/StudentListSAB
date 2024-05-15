/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author Sabahat
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] students = new Student[5];
    students[0] = new Student("Ann");
    students[1] = new Student("Ed");
    students[2] = new Student("Pat");
    students[3] = new Student("Carl");
    students[4] = new Student("Dean");
    for(Student stud:students){
        System.out.println(stud.getName());
    }
     System.out.println("Hello world");
  }    
}
