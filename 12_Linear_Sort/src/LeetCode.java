public class LeetCode {
    public static void main(String[] args) {
        int finalanswer = 0;
        int[] nums = {1,2,34,456,4566};
//        System.out.print(nums.length);
        for(int i=0; i< nums.length; i++){

            int ans = digitCalculation(nums[i]);
            if(ans % 2 == 0){
                System.out.println("i am here");
                finalanswer = finalanswer + 1;
            }
        }
        System.out.println(finalanswer);
    }

    static int digitCalculation(int i){
        int count = 0;
        while(i != 0){
//            System.out.println(i);
            i = i / 10;
            count = count + 1;
        }
        return count;

    }
}
