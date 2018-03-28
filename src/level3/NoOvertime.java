package level3;

import java.util.Arrays;

public class NoOvertime {

    public int noOvertime(int no, int[] works) {
        int result = 0;
        int maxIdx = 0;
        while(no > 0){
            for(int i=0;i<works.length;i++){
                if(works[i] >= works[maxIdx]) {
                    maxIdx = i;
                }
            }
            works[maxIdx] = works[maxIdx] - 1;
            no--;
        }

        for(int work : works){
            result += (int)Math.pow(work,2);
        }
        return result;
    }
    public static void main(String[] args) {
        NoOvertime c = new NoOvertime();
        int []test = {4,3,3};
        System.out.println(c.noOvertime(4,test));
    }
}
