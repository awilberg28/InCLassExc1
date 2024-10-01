import java.util.HashMap;
import java.util.HashSet;
public class SymPairs{

    public HashSet<int[]> SymPairsOutput(int arr[][]){

        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<int[]> output = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            int first = arr[i][0];
            int sec = arr[0][i];

            Integer val = hm.get(sec);
            if(val == first){
                output.add(new int[]{sec,first});
            }

        }


        return output;
    }
    





}