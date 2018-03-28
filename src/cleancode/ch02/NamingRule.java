package cleancode.ch02;

import java.util.ArrayList;
import java.util.List;

public class NamingRule {

    final private static int FLAGGED = 4;
    final private static int STATUS_VALUE = 3;

    public static void main(String[] args) {


    }

    public static List<int[]> cellList(List<int[]> flaggedCells, List<int[]> gameBoard) {
        for( int[] cell: gameBoard)
            if(cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
