package javaapplication13 ;

import java.util.Scanner;

public class JavaApplication13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nim, nama, grade;
        double uts, uas, rata;

        System.out.println("Data Mahasiswa");
        System.out.print("NIM  : ");
        nim = input.nextLine();

        System.out.print("Nama : ");
        nama = input.nextLine();

        System.out.print("Nilai UTS : ");
        uts = input.nextDouble();

        System.out.print("Nilai UAS : ");
        uas = input.nextDouble();

        rata = (uts + uas) / 2;

        if (rata < 50)
            grade = "E";
        else if (rata < 60)
            grade = "D";
        else if (rata < 70)
            grade = "C";
        else if (rata < 80)
            grade = "B";
        else
            grade = "A";

        System.out.println("==============================================================");
        System.out.printf("%-15s %-30s %-10s %-10s %-10s %-10s\n",
                "NIM", "Nama", "UTS", "UAS", "Rata2", "Grade");
        System.out.println("==============================================================");

        System.out.printf("%-15s %-30s %-10.1f %-10.1f %-10.1f %-10s\n",
                nim, nama, uts, uas, rata, grade);

        input.close();
    }
}
