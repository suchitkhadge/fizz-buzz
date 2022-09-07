package com.tlglearning;

public class FizzBuzz {

    public static final String FIZZ_RESULT = "Fizz";
    public static final String BUZZ_RESULT = "Buzz";
//    public static final String FIZZBUZZ_RESULT = "FizzBuzz";

    public static String valueOf(int num) {
      String result = "";
      if (num % 3 == 0) {
        result += FIZZ_RESULT;
      }
      if (num % 5 == 0) {
        result += BUZZ_RESULT;
      }
      if (result.isEmpty()) {
        result = String.valueOf(num);
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
