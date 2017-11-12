package com.codesquard;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x , y, sum;
            System.out.println("두 수의 합을 구해봅시다.");
            System.out.println("x = ");
            x = sc.nextInt();
            System.out.println("y = ");
            y = sc.nextInt();
            System.out.printf("%d + %d = %d",x,y, x + y );
        } catch(InputMismatchException e){
            System.out.println("숫자를 입력해 주세요");
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
