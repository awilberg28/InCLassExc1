import java.util.HashSet;

public class Exc1{
    // First multiples of 5 and 7 \\
    public int b = 5;
        public int c = 7;
        public int count;

    public Exc1(){
        count = 0;
    }
    public int mult(int a){
        
        while(b < a || c < a){
        if(b < a){
            count += b;
        }
        if(c < a){
            count += c;
        }
        b += 5;
        c += 7;
        }

        return count;
    }

    // Repeated integers in arrays \\
    public boolean check(int[] a){
        HashSet<Integer> Set = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            Set.add(a[i]);
        }
        if(Set.size() < a.length){
            return true;
        }
        
        return false;
    }




    public static void main(String[] args) {
        Exc1 exc = new Exc1();
        int result = exc.mult(20);
        System.out.println("Result: " + result);
        int[] test = {1,2,3,4};
        System.out.println(exc.check(test));
    }

 
}
