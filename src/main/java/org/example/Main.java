package org.example;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java/Nested : For/while loop. Break/continue in for/while loop. Java Arrays

        // ერთი და იგივე ტექსტის დასაბეჭდათ, განმეორებადი ციკლები :

        /*for (int i =0; i < 10; i++ ){      // ჯერ შემოვიტანეთ ველი- ინტ ტიპის რომელიც =0 შემდეგ მივანიჭეთ პირობა <10
            System.out.println("Testing");  // ეს როცა შესრულდება გადავა ქვევით და დაბეჭდავს და შემდეგ გაზრდის i++
        } */


        /* for (int i = 0; i <=10; i =i+3){
            System.out.println(i);
        } */


       /* int i;                        // ცვლადი გამოდის გარეთ თუ მინდა რომ ტანის გარეთაც დაბეჭდოს: გაზრდის და 12საც დაბეჭდავს
        for (i = 0; i<= 10; i = i + 2){
            System.out.println(i);
        }
        System.out.println(i); */

      /*  int i = 0;                     //მეორე ვარიანტი
        for (; i <= 10; i = i + 2){
            System.out.println(i);
        }
        System.out.println(i);  */

       /* for (int i = 10; i >=0; i--){        //კლების მიხედვით
            System.out.println(i);
        }   */


        // Nested Loops  For-ში ჩადგმული for ციკლები
        //პირველი for მინდა დატრიალდეს სამჯერ

       /* for (int i = 0; i <= 2; i++) {            //სანა შიდა for არ დასრულდება მეტობა/ნაკლებობა არ სრულდება i-ზე
            System.out.println("i = " + i);

        for (int j = 0; j <= 5; j++) {
            System.out.println("   j = " + j);
        }
    } */

        // მინდა დატრიალდეს მაგრამ თი შეხვდა 5ის ჯერადი მინდა გაჩერდეს

        /*for (int i= 0; i<=10; i ++) {
            if (i % 5 == 0 && i != 0) break;

            System.out.println(i);
        } */

       /* for (int i = 0; i <=10; i++){          // როცა მინდა იმ ერთის გამოტოვება და მერე ისევ გაგრძელება
            if (i != 0 && i % 5 == 0) continue;
            System.out.println(i);

        }*/


        //String -  For loop

       /* String s = "Software Testing";
        for (int i = 0; i < s.length(); i++){      //მკაცრი ნაკლებობა აუცილებელია
            System.out.println(s.charAt(i));
        }  */


        // While Loop

       /* for (int i = 0; i <5; i++){    // For
            System.out.println(i);
        } */

      /*  int i = 0;            // For-ის მსგავსია უბრალოდ ცალკე იწერება ინიციალიაცია- ცვლადის მინიჭება, პირობა და იტერაცია:გაზრდა/შემცირება
        while (i < 5) {
            System.out.println(i);
            i++;
        }  */


        // break/ continue in While loop

       /* int i = 0;
        while (i < 5){
            if (i == 3)break;
            System.out.println(i);
            i++;
        } */

      /*  int i =0;
        while (i <5){                    // continue გაბრინებს ისევ ზევით და აღარ აგრძელებს სამის მერე ამიტომ ++ უნდა ჩავუწეროთ ზევითან continue-ს
            if (i == 3){
                i++;
            continue;
            }
            System.out.println(i);
            i++;
        } */


     /*   int i = 0;
        int j = 7;
        while (i < 5 && j >= 4){
            System.out.println(i + j);
            i++;
            j = j - 2;
        } */

       /* int j = 3;
        for (int i = 0; i < 10 && j <= 5; i++){
            System.out.println(i + j);
            j ++;
        } */


      /* String s = "i love testing";

        int i = 0;
        while (i < s.length()) {
            System.out.println(s.charAt(i));
            i ++;
        } */

        // როცა ვიცით რამდენჯერ გვინდა დატრიალდეს ვიყენებთ For loops, როცა არ ვიცით While loops.(მაგრამ ორივეს გამოყენება შეიძლება)

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყანე სასურველი რიცხვი, თუ შეიყვან 0-ს, პროცესი დასრულდება");
         int number = scanner.nextInt();

         while (number != 0){
             System.out.println("თქვენ შეიყვანეთ " + number);
            number = scanner.nextInt();
         }
        System.out.println("ციკლი დასრულდა , რადგან თქვენ შეიყვანე 0 ");  */


        // Array მასივი
       /* int [] intArray = {5, 0, 3, 1, -7};    //int ტიპის მასივი: მინდა რომ დამიბეჭდოს რომელიმე ციფრი მაშნ უნდა გადავცე იმ ინკრემენტის მდებარეობა
        System.out.println(intArray[2]); */

        // ინდექსის ათვლა იწყება 0-დან, ხოლო სიგრძის 1-დან!

       /* int [] intArray = {5,0, 3, 1, -7};      // დავთვალოთ სიგრძე(რაოდენობა)
        System.out.println(intArray.length);  */

        /* int [] intArray = {5,0, 3, 1, -7};
        for (int i = 0; i < intArray.length; i++){      // For-ით გადაურბინა მასივს( გამოყენებადია dropdown ფუნქციის გასატესტად)
            System.out.println(intArray[i]);
        }  */


        /*String [] stringarray = {"lela", "levani", "mariami", "iosebi"};
        System.out.println(stringarray[3]); */    // გადავეცი მესამე ელემენტი  და დამიბეჭდა

      /*  String[] stringArray = {"lela", "levani", "mariami", "iosebi"};
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }  */

        /*String[] stringArray = {"lela", "levani", "mariami", "iosebi"};     //იგივე ოღონდ while-ის გამოყენებით
        int i = 0;
        while (i <stringArray.length){
            System.out.println(stringArray[i]);
            i++;
        }  */

        /*String[] stringArray = {"lela", "levani", "mariami", "iosebi"};
        stringArray[1] = "sali";                                   // ჩაანაცვლებს ელემენტს
        System.out.println(stringArray[1]); */

        /*int[] intArray = new int [10];             // შეგვიძლია შევქმნათ მასივი, რომელსაც არ ექნება მნიშვნელობები და default მნიშვნელობები ანუ ტიპები რომ ქონდეს : int/double/string
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        } */

       /* String [] intArray = new String [10];        // string-ით
        for (int i = 0; i < intArray.length; i++) {
        System.out.println(intArray[i]); } */

       /* boolean [] intArray = new boolean [10];        // boolean-ით
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]); }   */
        /*boolean [] b = new boolean [5];                 // boolean-ით კენტები იყოს true
        for (int i = 0; i < b.length; i++) {
            if (i % 2 != 0) b[i] = true;
            System.out.println(b[i]); }  */



        // დავალება :
        // შექმენით მასივი რიცხვითი მნიშვნელობებით და დათვალეთ ამ მასივის ელემენტების ჯამი for -ით
       /* int [] number = {2, 4, 5, 9, 3, 1, -6};
        int sum = 0;
        for (int i = 0; i < number.length; i++ ){
            sum = sum + number[i];
            System.out.println(sum);
        } */

        //შექმენით მასივი რიცხვითი მნიშვნელობებით და თუ მასივში გვაქვს ლუწი რიცხვები,
       // დაბეჭდოს მათი რაოდენობა for -ით და while -ით
        /*int [] number = {4, 5, -6, 8, 4};
        int count = 0;
        for (int i = 0; i < number.length; i ++){
            if (number[i] %2 == 0){
                count ++;
            }
            System.out.println(count);
        } */

       /* int [] number = {4, 5, -6, 8, 4};
        int count = 0;
        int i = 0;
        while (i< number.length){
            if (number[i] % 2 ==0){
                count++;
            }
            i++;
            System.out.println(count);
        } */

       // მასივში არსებული ელემენტების ბოლოდან დაბეჭდვა

        /*int [] array = {3, 4, 5};
        for (int i = array.length -1; i >= 0; i --){
            System.out.println(array[i]);
        } */


    }
}