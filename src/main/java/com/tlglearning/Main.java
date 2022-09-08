package com.tlglearning;

import java.util.Set;
public class Main {

  public static void main(String[] args) {
    int i=1;
    do{
      Set<FizzBuzz> value = FizzBuzz.valueOf(i);
      System.out.printf("%d: %s%n", i,value);
      i++;
    }
   while( i<100);

//    int t=7;
//    int y=9;
//    int z= t|y;
//    System.out.println(z);
  }

}


