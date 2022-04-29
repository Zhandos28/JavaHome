package com.university.h2;

public class Ex_2 {
    public static void main(String[] args) {
        Person person = new Person("Zhandos", "Kaskelen",
                "4646134654", "zhandos@gmail.com");

        Student student = new Student("Aidar", "Altyn Auyl", "5149993333",
                "aidar@gmail.com", Student.FRESHMAN);

        Employee employee = new Employee("Merey", "Almaty", "6189999999",
                "merey@mail.com", 910, 60000);

        Faculty faculty = new Faculty("Askhat", "Altyn Orda", "4133333333",
                "askhat@gmail.com", 101, 50000, "2pm to 6pm", "Assistant");

        Staff staff = new Staff("Yelzhan", "Alatau", "2030000000",
                "yelzhan@aol.com", 12, 65000, "Executive Assistant");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
