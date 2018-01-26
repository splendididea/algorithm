package level2;

public class HarshadNumber {

    public boolean isHarshad(int num){
        int numStrLength = String.valueOf(num).length();
        int sumNum = 0;
        Character[] numChars = new Character[numStrLength];

        /***
         *
         *  다른 사람의 풀이
         *
         *  1. char는 int로 형변환이 된다.
         *
             char[] charArr = String.valueOf(num).toCharArray();
             int divisor = 0;

                for (char c : charArr) {
                    divisor += (int) c - 48;

                 }
                return (num % divisor == 0);
             }

            2. 모던 자바의 사용

             sum = 0;
             Integer.toString(num).chars().forEach(c -> sum += c - '0');
             return num % sum == 0;


            3. "" 도 split이 된다.

             String[] temp = String.valueOf(num).split("");

             int sum = 0;
             for (String s : temp) {
                sum += Integer.parseInt(s);
             }
         *
         * */

        for(int i=0;i<numStrLength;i++) {
            numChars[i] = String.valueOf(num).charAt(i);
            sumNum += Integer.parseInt(  numChars[i].toString());
        }
        return num % sumNum == 0 ? true : false;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(19));
    }
}
