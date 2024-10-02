package SOAL;

import java.util.Scanner;

public class driverClass {

    public static void main(String[] args) {
        int salary = 20000;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose One : ");

        System.out.println("1. Student\n2. Teacher ");
        String pilihan = input.nextLine();

        if (pilihan.equals("1")) {
            System.out.println("Student detais : ");
            System.out.println("Name : ");
            String name = input.nextLine();
            System.out.println("major : ");
            String major = input.nextLine();
            System.out.println("Age : ");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("student number : ");
            int studentNumber = input.nextInt();
            input.nextLine();
            System.out.println("score : ");
            int score = input.nextInt();
            student student = new student(name, age, major, studentNumber, score);
            student.print();
        } else if (pilihan.equals("2")) {
            System.out.println("Choose one : ");
            System.out.println("1. Part time \n2. Full time");
            String pilih = input.nextLine();
            if (pilih.equals("1")) {
                System.out.println("Part time details : ");
                System.out.println("Name : ");
                String name = input.nextLine();
                System.out.println("Subject : ");
                String subject = input.nextLine();
                System.out.println("Age : ");
                int age = input.nextInt();
                input.nextLine();
                System.out.println("Hours Worked : ");
                int hoursworked = input.nextInt();
                PartTime pt = new PartTime(hoursworked, name, age, subject);
                pt.print();
            } else if (pilih.equals("2")) {
                System.out.println("Full time details : ");
                System.out.println("Name : ");
                String name = input.nextLine();
                System.out.println("Subject : ");
                String subject = input.nextLine();
                System.out.println("Unit : ");
                String unit = input.nextLine();
                System.out.println("Age : ");
                int age = input.nextInt();
                input.nextLine();
                System.out.println("anualSalary : ");
                int anualsalary = input.nextInt();
                input.nextLine();
                FullTime ft = new FullTime(unit, anualsalary, name, age, subject);
                ft.print();
            }
        }
}
}
