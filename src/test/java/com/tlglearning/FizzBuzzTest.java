package com.tlglearning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void valueOf_fizz() {
//    assert Set.of(FizzBuzz.FIZZ).equals(FizzBuzz.valueOf(6)); // OR can be changed to below code
    assertEquals(Set.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(6));
  }

  @Test
  void valueOf_buzz() {
      assertEquals(Set.of(FizzBuzz.BUZZ) , FizzBuzz.valueOf(10));
    }

  @Test
  void valueOf_fizzBuzz(){    //Equality of SET is not order dependent, equality of LIST is order dependent.
    assertEquals(Set.of(FizzBuzz.FIZZ, FizzBuzz.BUZZ), FizzBuzz.valueOf(15));
  }

  @Test
  void valueOf_none(){    //Equality of SET is not order dependent, equality of LIST is order dependent.
    assertEquals(Set.of(), FizzBuzz.valueOf(16));
  }

  }
