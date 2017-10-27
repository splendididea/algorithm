package level1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 나누어 떨어지는 숫자 배열 Level 1
 divisible 메소드는 int형 배열 array와 int divisor를 매개변수로 받습니다.
 array의 각 element 중 divisor로 나누어 떨어지는 값만 포함하는 새로운 배열을 만들어서 반환하도록 divisible에 코드를 작성해 보세요.
 예를들어 array가 {5, 9, 7, 10}이고 divisor가 5이면 {5, 10}을 리턴해야 합니다.
 * */
public class Divisible {
    public int[] divsible(int[] numbers, int divisor){
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        int idx = 0;
        // 1. 파라미터 배열 하나씩 조회

        // 2. 파라미터 divisor로 나누었을때 나머지가 0이면 result 담는다
//        int[] resssult = (int[]) Arrays.asList(numbers).stream().filter(ints -> ints%3 == 0).toArray();
        // 나의 풀이
        int[] result = Arrays.stream(numbers)
                            .filter(t -> t%divisor == 0)
                            .sorted()
                            .toArray();

//       for(int i=0;i<numbers.length;i++) {
//            if(numbers[i]%divisor == 0){
//                idx++;
//            }
//        }
        for(int tt : result){
            System.out.println(tt);
        }

//        int[] result = new int[idx];
        return result;
    }

    public static void main(String[] args) {
        Divisible divisible = new Divisible();
        int[] intArray = {3,7,9,6};

        divisible.divsible(intArray , 3);

    }
}
