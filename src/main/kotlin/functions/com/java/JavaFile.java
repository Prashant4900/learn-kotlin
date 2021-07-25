package functions.com.java;

import functions.com.kotlin.KotlinKt;

public class JavaFile {
    public static void main(String args[]){
        double area = KotlinKt.getCircleArea(5.36);
        System.out.println(area);
    }

    public static int getArea(int l,int b){
        return l * b;
    }
}