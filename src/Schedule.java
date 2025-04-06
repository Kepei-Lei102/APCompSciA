import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<String> subjects;
    String[][] classTable;

    public Schedule(){
        subjects = new ArrayList<>();
        classTable = new String[5][9];
    }

    /**
     *
     * @param classes the 2D array classes is 5 by 9
     */
    public void addClass(String[][] classes){
        for (int i = 0; i < classes.length; i ++) {
            for (int j = 0; j < classes[0].length; j ++) {
                classTable[i][j] = classes[i][j];
            }
        }
    }
}
