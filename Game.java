import java.util.PriorityQueue;

public class Game {

    public int[] numbergame(int[] nums){
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int[] res = new int[nums.length]; 

        for(int num : nums){

            queue.add(num);
        }

        int index = 0;
        while(!queue.isEmpty()){
            int A = queue.remove();
            int B = queue.remove();
            res[index] = B;
            res[index+1] = A;

            index+=2;
        }



        return res;
    }
    
}
