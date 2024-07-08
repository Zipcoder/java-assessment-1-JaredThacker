package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {

        int totalHeight = 0;
        int totalJumps = 0;

        while ((totalHeight + jumpHeight) <= flagHeight){
            totalHeight += jumpHeight;
            totalJumps++;
        }
        while(totalHeight < flagHeight){
            totalHeight++;
            totalJumps++;
        }
        return totalJumps;
    }
}
