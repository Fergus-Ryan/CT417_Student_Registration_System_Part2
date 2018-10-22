/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softEng.assignment1.fergusR;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author F
 */
public class StudentRegistrationSystem {
    //create students, modules and courses
    private static Student Sa = new Student("testStudentA", 21, LocalDate.of(1997,1,1), 1001);
    private static Student Sb = new Student("testStudentB", 22, LocalDate.of(1996,1,1), 1002);
    private static Student Sc = new Student("testStudentC", 23, LocalDate.of(1995,1,1), 1003);
    private static Student Sd = new Student("testStudentD", 24, LocalDate.of(1994,1,1), 1004);
    
    private static Module Ma = new Module("testModuleA", 2001);
    private static Module Mb = new Module("testModuleB", 2002);
    private static Module Mc = new Module("testModuleC", 2003);
    private static Module Md = new Module("testModuleD", 2004);
    
    private static Course Ca = new Course("testCourseA", LocalDate.of(2018, 9, 1), LocalDate.of(2019, 5, 30));
    private static Course Cb = new Course("testCourseB", LocalDate.of(2018, 8, 31), LocalDate.of(2019, 5, 20));
    private static Course Cc = new Course("testCourseC", LocalDate.of(2018, 9, 10), LocalDate.of(2019, 6, 3));
    private static Course Cd = new Course("testCourseD", LocalDate.of(2018, 9, 5), LocalDate.of(2019, 6, 1));
    
    public static void main(String args[]){
        //adding modules to courses
        Ca.addModule(Ma);
        Ca.addModule(Mb);
        Ca.addModule(Mc);
        
        Cb.addModule(Mb);
        Cb.addModule(Mc);
        Cb.addModule(Md);
        
        Cc.addModule(Ma);
        Cc.addModule(Mc);
        Cc.addModule(Md);
        
        Cd.addModule(Ma);
        Cd.addModule(Mb);
        Cd.addModule(Md);
        
        //add Courses to Modules
        Ma.addCourse(Ca);
        Ma.addCourse(Cc);
        Ma.addCourse(Cd);
        
        Mb.addCourse(Ca);
        Mb.addCourse(Cb);
        Mb.addCourse(Cd);
        
        Mc.addCourse(Ca);
        Mc.addCourse(Cb);
        Mc.addCourse(Cc);
        
        Md.addCourse(Cb);
        Md.addCourse(Cc);
        Md.addCourse(Cd);
        
        //add Students to modules
        Ma.addStudent(Sa);
        Ma.addStudent(Sc);
        Ma.addStudent(Sd);
        
        Mb.addStudent(Sa);
        Mb.addStudent(Sb);
        Mb.addStudent(Sd);
        
        Mc.addStudent(Sa);
        Mc.addStudent(Sb);
        Mc.addStudent(Sc);
        
        Md.addStudent(Sb);
        Md.addStudent(Sc);
        Md.addStudent(Sd);
        
        //assign students modules
        Sa.addModule(Ma);
        Sa.addModule(Mb);
        Sa.addModule(Mc);
        
        Sb.addModule(Mb);
        Sb.addModule(Mc);
        Sb.addModule(Md);
        
        Sc.addModule(Ma);
        Sc.addModule(Mc);
        Sc.addModule(Md);
        
        Sd.addModule(Ma);
        Sd.addModule(Mb);
        Sd.addModule(Md);
        
        //assign students Courses
        Sa.addCourse(Ca);
        Sa.addCourse(Cc);
        Sa.addCourse(Cd);
        
        Sb.addCourse(Ca);
        Sb.addCourse(Cb);
        Sb.addCourse(Cd);
        
        Sc.addCourse(Ca);
        Sc.addCourse(Cb);
        Sc.addCourse(Cc);
        
        Sd.addCourse(Cb);
        Sd.addCourse(Cc);
        Sd.addCourse(Cd);
        
        //add students to courses
        Ca.addStudent(Sa);
        Ca.addStudent(Sb);
        Ca.addStudent(Sc);
        
        Cb.addStudent(Sb);
        Cb.addStudent(Sc);
        Cb.addStudent(Sd);
        
        Cc.addStudent(Sa);
        Cc.addStudent(Sc);
        Cc.addStudent(Sd);
        
        Cd.addStudent(Sa);
        Cd.addStudent(Sb);
        Cd.addStudent(Sd);
        
        //print Courses
        
        System.out.print(Ca + "\n");
        System.out.print(Cb + "\n");
        System.out.print(Cc + "\n");
        System.out.print(Cd + "\n");
        
        //printing Modules
        System.out.print(Ma + "\n");
        System.out.print(Mb + "\n");
        System.out.print(Mc + "\n");
        System.out.print(Md + "\n");

        //printing Students
        System.out.print(Sa + "\n");
        System.out.print(Sb + "\n");
        System.out.print(Sc + "\n");
        System.out.print(Sd + "\n");
    }
}


