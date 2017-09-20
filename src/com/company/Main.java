package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //make student and teacher lists
        List<Student> roster = new ArrayList();
        List<Teacher> teacherRoster = new ArrayList();


        //create students and add them to roster
        Student alice = new Student();
        roster.add(alice);
        Student bella = new Student();
        roster.add(bella);
        Student cathy = new Student();
        roster.add(cathy);
        Student dana = new Student();
        roster.add(dana);
        Student elise = new Student();
        roster.add(elise);
        Student fran = new Student();
        roster.add(fran);
        Student gisela = new Student();
        roster.add(gisela);
        Student holly = new Student();
        roster.add(holly);
        Student ida = new Student();
        roster.add(ida);
        Student julie = new Student();
        roster.add(julie);
        Student katie = new Student();
        roster.add(katie);
        Student lisa = new Student();
        roster.add(lisa);
        Student molly = new Student();
        roster.add(molly);
        Student nina = new Student();
        roster.add(nina);
        Student ophelia = new Student();
        roster.add(ophelia);


        //set each student in roster to grade 1
        for(Student stu : roster){
            stu.setGrade(1);
        }
        //set each student to a unique id
        for(int i = 0; i<roster.size(); i++){
            roster.get(i).setId(i);
        }

        //create teachers
        Teacher smith = new Teacher();
        Teacher jones = new Teacher();
        Teacher white = new Teacher();

        //give teachers unique id and add to list
        teacherRoster.add(smith);
        smith.setLastName("Smith");
        smith.setId(1);
        smith.setGrade(1);
        teacherRoster.add(jones);
        jones.setLastName("Jones");
        jones.setId(2);
        jones.setGrade(1);
        teacherRoster.add(white);
        white.setLastName("White");
        white.setId(3);
        white.setGrade(1);

        //create classroom hashmap
        Map<Teacher, Set<Student>> classRoom = new HashMap<>();
        //for each teacher, five students(we know there's only 15)
        for(Teacher tea: teacherRoster){
            Set<Student> aClass = new HashSet<>();
            for(int i = 0; i < 5; i++){
                if(tea.getId() == 1){
                    aClass.add(roster.get(i));
                }
                if(tea.getId()==2){
                    aClass.add(roster.get(i+5));
                }
                if(tea.getId()==3){
                    aClass.add(roster.get(i+10));
                }

                classRoom.put(tea,aClass);

            }
        }

            System.out.println(classRoom.keySet());
            System.out.println(classRoom.values());



    }
}
