package lesson8;

import java.util.Date;

public class Course {

    /* Создайте следующую иерархию классов.

Класс Course, поля:
Date startDate
String name
int hoursDuration
String teacherName
Student[] students

Должен содержать конструктов со всеми полями

Класс Student с полями:
String firstName
String lastName
int group
Course[] coursesTaken
int age

У класса должен быть конструктор:
firstName, lastName, group, coursesTaken

Класс CollegeStudent, который является наследником Student
У этого класса есть ряд дополнительных полей
String collegeName
int rating
long id

И два конструктора, один такой же как у Student и один со всеми полями текущего класса

И наконец, класс SpecialStudent, который есть наследником CollegeStudent
У него тоже есть дополнительные поля:
long secretKey
String email

И конструктор со всеми полями (выберите конструктор CollegeStudent с меньшим количеством полей)

 */

    Date startDate;
    String name;
    int hoursDuration;
    String teacherName;
    Student[] students;

    public Course(Date startDate, String name, int hoursDuration, String teacherName, Student[] students) {
        this.startDate = startDate;
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
        this.students = students;
    }


}
