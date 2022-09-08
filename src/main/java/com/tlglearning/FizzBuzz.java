package com.tlglearning;

import java.util.EnumSet;
import java.util.Set;
public enum FizzBuzz {

    FIZZ, BUZZ;
//    public static final String FIZZBUZZ_RESULT = "FizzBuzz";

    public static Set<FizzBuzz> valueOf(int num) {
      Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
      if (num % 3 == 0) {
        result.add(FIZZ);            //Print Fizz if its true
      }
      if (num % 5 == 0) {                 //Print Buzz with no space after Fizz if there is one
        result.add(BUZZ);
      }

        return result;
    }



//    public static void test_FizzBuzz(){
//
//      for(int num1= 1; num1 <=50; num1++){
//        if (num1%3==0 && num1%5==0){
//            System.out.println("FizzBuzz");
//        }
//        else if (num1 % 3 == 0 ) {
//            System.out.println(FIZZ_RESULT);
//        }
//        else if(num1 %5 ==0){
//        System.out.println(BUZZ_RESULT);
//      }
//        else {
//            System.out.println(num1);
//        }}
//    }
//
//    public static void main(String[] args) {
//         test_FizzBuzz();
//    }
    }
