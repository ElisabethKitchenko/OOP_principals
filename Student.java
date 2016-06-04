//Реализовать класс Student, который содержит поля для хранения фамилии, имени, отчества, даты рождения, домашнего адреса, телефонного номера.
// Также за каждым студентом закреплены 3 массива оценок – зачёты, курсовые работы, экзамены. Обязательные методы: 2-3 версии конструктора с параметрами,
// геттеры и сеттеры для всех полей, показ всех данных о студенте.

import java.util.Arrays;
import java.util.Date;

public class Student {

    String name;
    String surname;
    Date dateOfBirth;
    String homeAddress;
    String phoneNumber;

    Student [] test = new Student[10];
    Student [] termPaper = new Student[10];
    Student [] exams = new Student[10];

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", homeAddress='" + homeAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", test=" + Arrays.toString(test) +
                ", termPaper=" + Arrays.toString(termPaper) +
                ", exams=" + Arrays.toString(exams) +
                '}';
    }

    public Student(String name, String surname, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String name, String surname, Date dateOfBirth, String homeAddress, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    public Student(String name, String surname, Date dateOfBirth, String homeAddress, String phoneNumber, Student[] test, Student[] termPaper, Student[] exams) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.test = test;
        this.termPaper = termPaper;
        this.exams = exams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Student[] getTest() {
        return test;
    }

    public void setTest(Student[] test) {
        this.test = test;
    }

    public Student[] getTermPaper() {
        return termPaper;
    }

    public void setTermPaper(Student[] termPaper) {
        this.termPaper = termPaper;
    }

    public Student[] getExams() {
        return exams;
    }

    public void setExams(Student[] exams) {
        this.exams = exams;
    }
}

