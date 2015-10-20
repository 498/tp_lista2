package karta;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuitTest {

  @Test
  public final void test_hasCorrectNumberOfElements() {
    assertEquals(Suit.values().length, 4);
  }

}
