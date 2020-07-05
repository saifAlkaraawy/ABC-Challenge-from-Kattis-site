package com.alkaraawy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in );
        System.out.println("enter the squnce String");
        String ABC= input.nextLine();
        System.out.println("enter the three number");
        int n1= input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();

        int max=0;
        int medium=0;
        int small=0;

        if (n1 >n2 && n1 > n3) {

            max=n1;
            if( n2>n3){
                medium =n2;
                small=n3;
            }
            else
                medium=n3;
                small=n2;

        }
        if (n2>n1 && n2>n3){
            max=n2;
            if(n1>n3) {
                medium = n1;
                small = n3;
            }
            else {
                medium = n3;
                small = n1;
            }
        }
        if (n3>n1 &&n3>n2){
            max=n3;
            if (n1>n2){
                medium=n1;
                small=n2;

            }
            else{
                medium=n2;
                small=n1;}

        }
        for (int i=0; i<=2;i++){
            if(ABC.charAt(i)=='C'){
                System.out.print(max+" ");
            }
            if(ABC.charAt(i)=='B'){
                System.out.print(medium+ " ");
            }
            if(ABC.charAt(i)=='A'){
                System.out.print(small);
            }

        }
    }


}
