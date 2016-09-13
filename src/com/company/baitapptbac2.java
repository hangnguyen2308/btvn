package com.company;

import java.util.Scanner;

import static java.lang.StrictMath.floor;
import static java.lang.StrictMath.sqrt;

/**
 * Created by hang on 9/13/16.
 */
public class baitapptbac2 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("nhap gia tri a");
        float a = s.nextInt();
        System.out.println("nhap gia tri b");
        float b = s.nextInt();
        System.out.println("nhap gia tri c");
        float c = s.nextInt();
//        System.out.println("delta la " + (b*b-4*a*c));
       double d = (b*b-4*a*c);

        if(d==0){
            System.out.println("phuong tinh co nghiem la "+ (-b/2*a));

        }
        if(d>0) {
            System.out.println("phuong trinh co 2 nghiem");
            System.out.println("nghiem thu nhat la " + ((-b + sqrt(d)) / (2 * a)));
            System.out.println("nghiem thu hai la " + ((-b - sqrt(d)) / (2 * a)));
        }
        if(d<0){
            System.out.println("phuong trinh vo nghiem");}

        }
    }

