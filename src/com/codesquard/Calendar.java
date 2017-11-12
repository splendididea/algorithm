package com.codesquard;

import java.time.Month;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        /** 입력받은 월 수의 최대 일수를 구하라 */
        Scanner sc = new Scanner(System.in);
        String input;
        int output,year,month;

        try {
            java.util.Calendar calendar = new GregorianCalendar(Locale.KOREA);
            System.out.println( calendar.getWeekYear() );
            // 1. 현재 년도를 사용할 지 묻는다.
            System.out.println("#### 달별 날짜 노출 프로그램 ####");
            System.out.println("현재 년도를 검색하시겠습니까??? y or n 으로 입력해 주세요");
            input = sc.next();
            if( input != null ) {
                if ("y".equals(input.toLowerCase())) {
                    year = calendar.getWeekYear();
                } else {
                    System.out.println("년도를 입력하세요");
                    year = sc.nextInt();
                }
            } else {
                new Throwable();
            }
            // 2. 아니면 년도를 입력받는다.


        } catch( Exception e ){
            e.printStackTrace();
        } finally {
            sc.close();
        }


    }
}
