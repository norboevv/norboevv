package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("x ni kiriting");
//        double x = sc.nextDouble();
//        System.out.print("a ni kiriting");
//        double a = sc.nextDouble();
//        System.out.println("y ni kiriting");
//        double y = sc.nextDouble();
//        System.out.println("b ni kiriting");
//        double b = sc.nextDouble();
//        System.out.println("Natija "+((x*a)-(y*b)));
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Familiyangizni kiriting");
//        String lastname = sc.nextLine();
//        System.out.print("Ismingizni kiriting");
//        String firstname = sc.nextLine();
//        System.out.println("E-mailingizni kiriting");
//        String Email = sc.nextLine();
//        System.out.println("Raqamingizni kiriting");
//        String tel= sc.nextLine();
//        System.out.println("Manzilingizni kiriting");
//        String adress = sc.nextLine();
//        System.out.println("Jinsingizni kiriting");
//        String poll = sc.nextLine();
//
//
//
//        System.out.println("User name ............................." + lastname);
//        System.out.println("User first name ......................." + firstname);
//        System.out.println("User E-mail ..........................." + Email);
//        System.out.println("User .................." + tel);
//        System.out.println("User ...................." + adress);
//        System.out.println("User ................." + poll);
//
//
//        boolean A = true;
//        System.out.println(!A||A);
//        Scanner sc = new Scanner(System.in);
//
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//
//        System.out.println(a>b && b<0 || a<0 && b>0);
//
//        Scanner sc = new Scanner(System.in);
//
//
//        int a = 12;
//        int b = 23;
//        int c = 30;
//        int d = a;
//
//        a = b;
//        b = c;
////        c = d;
//
//        System.out.println(c);
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
////        if (a>=1 && a<=9 && a%2 == 0) {
////            System.out.println("Bir xonali juft son");
////        } else {
//            System.out.println("Bir xonali toq son");
//
//        }
//
//        int b = a%10;
//        int c = (a/10)%10;
//        int d = a/100;
//        if () {
//            System.out.println(b);
//            System.out.println(c);
//            System.out.println(d);
//
//        LocalDate date = LocalDate.now();
//        System.out.println("Bugun " + date);
//
//        LocalDate oldate = LocalDate.of(2009,9,25);
//
//        Period period = Period.between(date, oldate);
//        System.out.println(" Yosh => " +period );
//
//        LocalTime time= LocalTime.now();
//        System.out.println(time);
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Chicago"));
//        System.out.println(zonedDateTime);
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//        System.out.println(" Saidazim " + dateTime.format(dateTimeFormatter));
//
//
//                // Hozirgi vaqtni olish
//                LocalDateTime hozirgiVaqt = LocalDateTime.now();
//
//                // Yangi yilning boshlang'ich vaqti: 1 yanvar, 00:00:00
//                LocalDateTime yangiYilBoshlangich = LocalDateTime.of(hozirgiVaqt.getYear() + 1, 1, 1, 0, 0, 0);
//
//                // Farqni hisoblash
//                long kunlar = ChronoUnit.DAYS.between(hozirgiVaqt, yangiYilBoshlangich);
//                long oylar = ChronoUnit.MONTHS.between(hozirgiVaqt, yangiYilBoshlangich);
//                long soatlar = ChronoUnit.HOURS.between(hozirgiVaqt, yangiYilBoshlangich);
//                long minutlar = ChronoUnit.MINUTES.between(hozirgiVaqt, yangiYilBoshlangich);
//                long sekundlar = ChronoUnit.SECONDS.between(hozirgiVaqt, yangiYilBoshlangich);
//
//                System.out.println("Yangi yilgacha qolgan vaqt:");
//                System.out.println("Kunlar: " + kunlar);
//                System.out.println("Oylar: " + oylar);
//                System.out.println("Soatlar: " + soatlar);
//                System.out.println("Minutlar: " + minutlar);
//                System.out.println("Sekundlar: " + sekundlar);
//
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("x ni kiriting");
//        double x = sc.nextDouble();
//        System.out.print("a ni kiriting");
//        double a = sc.nextDouble();
//        System.out.println("y ni kiriting");
//        double y = sc.nextDouble();
//        System.out.println("b ni kiriting");
//        double b = sc.nextDouble();
//        System.out.println("Natija "+((x*a)-(y*b)));
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Familiyangizni kiriting");
//        String lastname = sc.nextLine();
//        System.out.print("Ismingizni kiriting");
//        String firstname = sc.nextLine();
//        System.out.println("E-mailingizni kiriting");
//        String Email = sc.nextLine();
//        System.out.println("Raqamingizni kiriting");
//        String tel= sc.nextLine();
//        System.out.println("Manzilingizni kiriting");
//        String adress = sc.nextLine();
//        System.out.println("Jinsingizni kiriting");
//        String poll = sc.nextLine();
//
//
//
//        System.out.println("User name ............................." + lastname);
//        System.out.println("User first name ......................." + firstname);
//        System.out.println("User E-mail ..........................." + Email);
//        System.out.println("User .................." + tel);
//        System.out.println("User ...................." + adress);
//        System.out.println("User ................." + poll);
//
//
//        boolean A = true;
//        System.out.println(!A||A);
//        Scanner sc = new Scanner(System.in);
//
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//
//        System.out.println(a>b && b<0 || a<0 && b>0);
//
//        Scanner sc = new Scanner(System.in);
//
//
//        int a = 12;
//        int b = 23;
//        int c = 30;
//        int d = a;
//
//        a = b;
//        b = c;
////        c = d;
//
//        System.out.println(c);
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
////        if (a>=1 && a<=9 && a%2 == 0) {
////            System.out.println("Bir xonali juft son");
////        } else {
//            System.out.println("Bir xonali toq son");
//
//        }
//
//        int b = a%10;
//        int c = (a/10)%10;
//        int d = a/100;
//        if () {
//            System.out.println(b);
//            System.out.println(c);
//            System.out.println(d);
//
//        LocalDate date = LocalDate.now();
//        System.out.println("Bugun " + date);
//
//        LocalDate oldate = LocalDate.of(2013,10,8);
//
//        Period period = Period.between(date, oldate);
//        System.out.println(" Yosh => " +period );
//
//        LocalTime time= LocalTime.now();
//        System.out.println(time);
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Chicago"));
//        System.out.println(zonedDateTime);
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//        System.out.println(" Saidazim " + dateTime.format(dateTimeFormatter));
//
//
//                // Hozirgi vaqtni olish
//                LocalDateTime hozirgiVaqt = LocalDateTime.now();
//
//                // Yangi yilning boshlang'ich vaqti: 1 yanvar, 00:00:00
//                LocalDateTime yangiYilBoshlangich = LocalDateTime.of(hozirgiVaqt.getYear() + 1, 1, 1, 0, 0, 0);
//
////                // Farqni hisoblash
////                long kunlar = ChronoUnit.DAYS.between(hozirgiVaqt, yangiYilBoshlangich);
////                long oylar = ChronoUnit.MONTHS.between(hozirgiVaqt, yangiYilBoshlangich);
////                long soatlar = ChronoUnit.HOURS.between(hozirgiVaqt, yangiYilBoshlangich);
////                long minutlar = ChronoUnit.MINUTES.between(hozirgiVaqt, yangiYilBoshlangich);
//                long sekundlar = ChronoUnit.SECONDS.between(hozirgiVaqt, yangiYilBoshlangich);
//
//                System.out.println("Yangi yilgacha qolgan vaqt:");
//                System.out.println("Kunlar: " + kunlar);
//                System.out.println("Oylar: " + oylar);
//                System.out.println("Soatlar: " + soatlar);
//                System.out.println("Minutlar: " + minutlar);
//                System.out.println("Sekundlar: " + sekundlar);
//
//                int[] arr = new int[10];
//
//                try {
//
//                } catch (Exception e) {
//                    System.out.println(12 / 0);
//                }
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int count = 0;
//
//        if (a > 0) {
//            count++;
//        }
//        if (b > 0) {
//            count++;
//        }
//        if (c > 0) {
//            count++;
//            System.out.println(count);
//
//        File file = new File("C:\\");
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            if (file1.isFile()){
//                System.out.println(file1.getName());
//            }
//        }
//
//        File dFile = new File("");
//        if (dFile.delete()){
//            System.out.println("O'chirildi");
//        } else {
//            System.out.println("Topilmadi");
//
//        String path = args[0];
//        File dir = new File(path);
//        File[] files = dir.listFiles();
//        for (File file : files) {
//            if (file.isFile()) {
//                if (file.delete()) {
//                    System.out.println("o'chirildi " + file.getName());
//                }
//            } else if (file.isDirectory()) {
//            }
//        }
//    }
//
//    public static void recursiveFile(String path) {
//        File file = new File(path);
//        if (file.listFiles() == null) {
//            return;
//        }
//        File[] files = file.listFiles();
//        for (File dFile : files) {
//            if (dFile.isFile()) {
//                dFile.delete();
//            } else {
//                recursiveFile(dFile.getAbsolutePath());
//
//
//                String fileName = "02.02.24";
//                String content = "Mushuk haqida ma'lumotlar...\n";
//
//                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//                Date date = new Date();
//                String currentDate = formatter.format(date);
//
//                try {
//                    File file = new File(fileName);
//                    FileWriter writer = new FileWriter(file);
//                    writer.write(content);
//                    writer.write("Sana: " + currentDate);
//                    writer.close();
//                    System.out.println("Fayl yaratildi: " + file.getName());
//                    System.out.println("Fayl joylashuvi: " + file.getAbsolutePath());
//                } catch (IOException e) {
//                 System.out.println("Fayl yaratishda xatolik yuz berdi: " + e.getMessage());
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (b >a) {
//            System.out.println(a + " kichik");
//        } else if (a>b) {
//            System.out.println(b + " kichik");
//        } else {
//            System.out.println("Sonlar teng");
//
//
//
//        if (a > b) {
//            System.out.println(a);
//            System.out.println(b);
//        }
//        if (b > a){
//            System.out.println(b);
//            System.out.println(a);

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        a = a - b;
//
//        b = b + a;
//
//        a = b - a;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (a > b) {
//            if (a > c) {
//                System.out.println(a);
//
//            } else {
//                System.out.println(c);
//            }
//        } else {
//
//            if (b > c) {
//                System.out.println(b);
//            } else {
//                System.out.println(c);
//            }
        Scanner sc = new Scanner(System.in);
          int i = 1;
          while (i<=20){
              System.out.println(i);
              i++;
          }

        }
    }

