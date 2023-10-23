import java.util.Arrays;

public class largestAltitude {
    public static void main(String[] args) {
        int[] gain = new int[]{-5,1,5,0,-7};
        int[] target = new int[gain.length + 1];
        target[0] = 0;

        for(int i = 1; i < gain.length + 1; i++){
            target[i] = gain[i-1] + target[i-1];
        }

        Arrays.sort(target);

        System.out.println("Answer:- " + target[gain.length]);

    }
}







class Solution {
    public int largestAltitude(int[] gain) {
        // int[] target = new int[gain.length + 1];
        // target[0] = 0;

        int currentAlt = 0;
        int maxAlt = 0;

        for(int i = 0; i < gain.length; i++){
            // target[i] = gain[i-1] + target[i-1];
            currentAlt += gain[i];
            maxAlt = Math.max(currentAlt, maxAlt);
        }

        // Arrays.sort(target);

        return maxAlt;
    }
}
