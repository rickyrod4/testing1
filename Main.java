
import java.lang.reflect.Array;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {

        static void myMethod(){
            System.out.println("I have been executed");
        }
        //Array - Used to store multiple values in a single variable
        int nums [] = new int [] {10,62,3,14,55,6};
        System.out.println(Arrays.toString(nums));
        for(int i =0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] < nums[j]){
                    int replace = nums[i];
                    nums[i] = nums[j];
                    nums[j] = replace;
                }
            }
            myMethod();
        }

    }





}
