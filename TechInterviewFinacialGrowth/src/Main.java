import java.util.Arrays;

public class Main {

    public static void main(String[] args){
       int[] testArray = new int[]{-5, -2, 0, 3, 10};
       System.out.println(Arrays.toString(squareAndSort(testArray)));
    }


    public static int[] squareAndSort(int[] growthPercentages){
        int[] newArray = new int[growthPercentages.length];
        for(int i = 0; i < growthPercentages.length; i++){
            newArray[i] = growthPercentages[i] * growthPercentages[i];
        }
        Arrays.sort(newArray);
        return newArray;

    }
}


/*Clarifying Questions, what if there isn't an array? what if its not an int? Should we just round it up?
Time space complexity O N (log) N;
 */
