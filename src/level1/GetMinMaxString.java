package level1;

import java.util.Arrays;
import java.util.List;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String[] strNumbers = str.split(" ");
        int minNum = 0;
        int maxNum = 0;
        for(int i=0;i<strNumbers.length;i++){
            int number = Integer.parseInt(strNumbers[i]);
            if(number > maxNum || i == 0) {
                maxNum = number;
            }
            if(number < minNum || i == 0) {
                minNum = number;
            }
        }


        /**
         * 다른 사람 풀이
         * String[] tmp = str.split(" ");
         int min, max, n;
         min = max = Integer.parseInt(tmp[0]);
         for (int i = 1; i < tmp.length; i++) {
         n = Integer.parseInt(tmp[i]);
         if(min > n) min = n;
         if(max < n) max = n;
         }

         return min + " " + max;
         *
         * */
        return  minNum + " " + maxNum;
    }

    public static void main(String[] args) {
        String str = "-1 -2 -3 -4 -8";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}