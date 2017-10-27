package level1;

import java.util.Arrays;

public class FindKim {

    public String findKim(String[] names) {

        // 모던 자바 풀이
        int x = Arrays.asList(names).indexOf("Kim");

        /*
        나의 풀이
        for( String name : names) {
            x++;
            if( name.equals("Kim")){
                break;
            }
        }*/
        return "김서방은 " + x + "번째 있다.";
    }
    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queens" , "James","Kim" };
        System.out.println(kim.findKim(names));
    }
}
