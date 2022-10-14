import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {

  // testReverseinPlace
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReverseinPlaceManyItemsEven() {
    int[] input = { 1, 2, 3, 4, 5, 6 };
    int[] expectedOutput = { 6, 5, 4, 3, 2, 1 };
    // Questiong for the office hours, how are we able to
    // use the ArrayExamples class here.
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void testReverseinPlaceManyItemsOdd() {
    int[] input = { 1, 2, 3, 4, 5 };
    int[] expectedOutput = { 5, 4, 3, 2, 1 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expectedOutput, input);
  }

  @Test
  public void testReverseinPlaceNoItems() {
    int[] input = {};
    int[] expectedOutput = {};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expectedOutput, input);
  }

  // testReversed
  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedManyItems() {
    int[] input = { 1, 2, 3, 4, 5, 6 };
    int[] expectedOutput = { 6, 5, 4, 3, 2, 1 };

    assertArrayEquals(expectedOutput, ArrayExamples.reversed(input));
  }

}
