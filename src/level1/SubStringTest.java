package level1;

public class SubStringTest {

    public static void main(String[] args) {
        String realFileName = "C:\\\\22222\\\\share\\문서중앙화.mp4";

        if(realFileName.indexOf("\\") > -1 ){
            realFileName = realFileName.substring(realFileName.lastIndexOf("\\") + 1);
        }
        System.out.println(realFileName);
    }
}
