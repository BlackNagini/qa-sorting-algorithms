package murraco;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

public class SortingAlgorithmsTest {

  //Original test methods
  @Test
  public void testBubbleSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }
  
  @Test
  public void testInsertionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testSelectionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }
  @Test
  public void testMergeSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    MergeSort.mergeSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testHeapsort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Heapsort.heapSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testQuicksort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }
//-------------------- OUR TEST METHODS FOR Q2.3 --------------------

  // Ensures BubbleSort correctly handles arrays with duplicate elements.
  @Test
  public void testBubbleSortDuplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  // Verifies BubbleSort's ability to handle null input, ensuring proper exception handling.
  @Test(expected = IllegalArgumentException.class)
  public void testBubbleSortNullArray() {
    BubbleSort.bubbleSort(null);
  }

  // Tests BubbleSort with a single-element array to confirm correct handling of minimal input.
  @Test
  public void testBubbleSortSingleItem() {
    final Integer[] data = {4};
    BubbleSort.bubbleSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

  // Evaluates InsertionSort's performance on a large array for scalability and efficiency.
  @Test
  public void testInsertionSortLargeArray() {
    int largeSize = 100000;
    Integer[] largeArray = new Integer[largeSize];
    Integer[] expectedArray = new Integer[largeSize];

    for (int i = 0; i < largeSize; i++) {
      largeArray[i] = largeSize - i;
      expectedArray[i] = i + 1;
    }

    InsertionSort.insertionSort(largeArray);

    assertArrayEquals(expectedArray, largeArray);
  }

  // Confirms InsertionSort's behavior with an empty array to ensure no errors are thrown.
  @Test
  public void testInsertionSortEmptyArray() {
    final Integer[] data = {};
    InsertionSort.insertionSort(data);
    assertEquals("[]", Arrays.toString(data));
  }
  
  // Tests SelectionSort with an array of identical elements to check for stability.
  @Test
  public void tesSelectionSortIdenticalElements() {
    final Integer[] data = {5, 5, 5, 5, 5};
    SelectionSort.selectionSort(data);
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(data));
  }

  // Verifies SelectionSort's ability to handle arrays with negative numbers, testing equivalence partitioning.
  @Test
  public void testSelectionSortNegativeNumbers() {
    final Integer[] data = {-3, -1, -7, -4, 0, -2};
    SelectionSort.selectionSort(data);
    assertEquals("[-7, -4, -3, -2, -1, 0]", Arrays.toString(data));
  }

  // Tests Heapsort with floating point numbers to ensure correct sorting behavior.
  @Test
  public void testHeapSortFloatingPointNumbers() {
    final Double[] data = {3.1, 2.4, 5.5, 1.1, 3.0};
    Heapsort.heapSort(data);
    assertEquals("[1.1, 2.4, 3.0, 3.1, 5.5]", Arrays.toString(data));
  }

  // Tests Quicksort on an usorted array to ensure proper sorting.
  @Test
  public void testQuicksortUnSortedArray() {
    final Integer[] data = {100, 4, 9, 20, 42, 21, 53, 38};
    Quicksort.quickSort(data);
    assertEquals("[4, 9, 20, 21, 38, 42, 53, 100]", Arrays.toString(data));
  }

  // Ensures MergeSort mutation "Changed increment from 1 to -1" doesn't survive
  @Test
  public void testMergeSortDecrementIndex() {
      Integer[] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
      Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      MergeSort.mergeSort(data);
      assertEquals(Arrays.toString(expected), Arrays.toString(data));
  }

}
