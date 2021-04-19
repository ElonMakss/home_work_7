package com.company;

import java.util.Random;

public class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        Random random = new Random();
        if(random.nextInt(2) == 0){
            System.out.println("Маг использовал силу огня");
        }else{
            System.out.println("Маг использовал силу воды");
        }
    }
}
