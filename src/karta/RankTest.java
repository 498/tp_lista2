package karta;

import static org.junit.Assert.*;

import org.junit.Test;

public class RankTest {

  @Test
  public final void test_hasCorrectNumberOfElements() {
    assertEquals(Rank.values().length, 13);
  }

}
