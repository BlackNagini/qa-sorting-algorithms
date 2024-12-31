package murraco;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

public class SortingAlgorithmsTest {

  // Justification: Tests the standard functionality of BubbleSort on a typical unsorted array.
  @Test
  public void testBubbleSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Validates BubbleSort on an already sorted array to ensure stability and no unnecessary operations.
  @Test
  public void testBubbleSortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    BubbleSort.bubbleSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  // Justification: Ensures BubbleSort correctly handles arrays with duplicate elements.
  @Test
  public void testBubbleSortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Verifies BubbleSort's ability to handle null input, ensuring proper exception handling.
  @Test(expected = IllegalArgumentException.class)
  public void testBubbleSortNullArray() {
    BubbleSort.bubbleSort(null);
  }

  // Justification: Tests BubbleSort with a single-element array to confirm correct handling of minimal input.
  @Test
  public void testBubbleSortSingleItem() {
    final Integer[] data = {4};
    BubbleSort.bubbleSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

  // Justification: Evaluates BubbleSort's performance on a large array for scalability and efficiency.
  @Test
  public void testBubbleSortLargeArray() {
    int largeSize = 100000;
    Integer[] largeArray = new Integer[largeSize];
    Integer[] expectedArray = new Integer[largeSize];

    for (int i = 0; i < largeSize; i++) {
      largeArray[i] = largeSize - i;
      expectedArray[i] = i + 1;
    }

    BubbleSort.bubbleSort(largeArray);

    assertArrayEquals(expectedArray, largeArray);
  }

  // Justification: Confirms BubbleSort's behavior with an empty array to ensure no errors are thrown.
  @Test
  public void testBubbleSortEmptyArray() {
    final Integer[] data = {};
    BubbleSort.bubbleSort(data);
    assertEquals("[]", Arrays.toString(data));
  }

  // Justification: Tests BubbleSort with an array of identical elements to check for stability.
  @Test
  public void testBubbleSortIdenticalElements() {
    final Integer[] data = {5, 5, 5, 5, 5};
    BubbleSort.bubbleSort(data);
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(data));
  }

  // Justification: Verifies BubbleSort's ability to handle arrays with negative numbers, testing equivalence partitioning.
  @Test
  public void testBubbleSortNegativeNumbers() {
    final Integer[] data = {-3, -1, -7, -4, 0, -2};
    BubbleSort.bubbleSort(data);
    assertEquals("[-7, -4, -3, -2, -1, 0]", Arrays.toString(data));
  }

  // Justification: Ensures BubbleSort handles a mix of positive and negative numbers appropriately.
  @Test
  public void testBubbleSortMixedNumbers() {
    final Integer[] data = {-3, 4, -1, 7, 0, -5, 2};
    BubbleSort.bubbleSort(data);
    assertEquals("[-5, -3, -1, 0, 2, 4, 7]", Arrays.toString(data));
  }

  // Justification: Tests BubbleSort with floating point numbers to ensure correct sorting behavior.
  @Test
  public void testBubbleSortFloatingPointNumbers() {
    final Double[] data = {3.1, 2.4, 5.5, 1.1, 3.0};
    BubbleSort.bubbleSort(data);
    assertEquals("[1.1, 2.4, 3.0, 3.1, 5.5]", Arrays.toString(data));
  }

  // Justification: Tests BubbleSort with boundary array size to ensure correct sorting behavior.
  @Test
  public void testBubbleSortBoundaryArraySize() {
      final Integer[] data = {Integer.MAX_VALUE, Integer.MIN_VALUE};
      BubbleSort.bubbleSort(data);
      assertEquals("[" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + "]", Arrays.toString(data));
  }

  // Justification: Tests InsertionSort on a typical unsorted array to ensure correct sorting behavior.
  @Test
  public void testInsertionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Validates InsertionSort on an already sorted array to ensure stability and no unnecessary operations.
  @Test
  public void testInsertionSortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    InsertionSort.insertionSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  // Justification: Ensures InsertionSort correctly handles arrays with duplicate elements.
  @Test
  public void testInsertionSortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Verifies InsertionSort's ability to handle null input, ensuring proper exception handling.
  @Test(expected = IllegalArgumentException.class)
  public void testInsertionSortNullArray() {
    InsertionSort.insertionSort(null);
  }

  // Justification: Tests InsertionSort with a single-element array to confirm correct handling of minimal input.
  @Test
  public void testInsertionSortSingleItem() {
    final Integer[] data = {4};
    InsertionSort.insertionSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

  // Justification: Evaluates InsertionSort's performance on a large array for scalability and efficiency.
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

  // Justification: Confirms InsertionSort's behavior with an empty array to ensure no errors are thrown.
  @Test
  public void testInsertionSortEmptyArray() {
    final Integer[] data = {};
    InsertionSort.insertionSort(data);
    assertEquals("[]", Arrays.toString(data));
  }

  // Justification: Tests InsertionSort with an array of identical elements to check for stability.
  @Test
  public void tesInsertionSortIdenticalElements() {
    final Integer[] data = {5, 5, 5, 5, 5};
    InsertionSort.insertionSort(data);
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(data));
  }

  // Justification: Verifies InsertionSort's ability to handle arrays with negative numbers, testing equivalence partitioning.
  @Test
  public void testInsertionSortNegativeNumbers() {
    final Integer[] data = {-3, -1, -7, -4, 0, -2};
    InsertionSort.insertionSort(data);
    assertEquals("[-7, -4, -3, -2, -1, 0]", Arrays.toString(data));
  }

  // Justification: Ensures InsertionSort handles a mix of positive and negative numbers appropriately.
  @Test
  public void testInsertionSortMixedNumbers() {
    final Integer[] data = {-3, 4, -1, 7, 0, -5, 2};
    InsertionSort.insertionSort(data);
    assertEquals("[-5, -3, -1, 0, 2, 4, 7]", Arrays.toString(data));
  }

  // Justification: Tests InsertionSort with floating point numbers to ensure correct sorting behavior.
  @Test
  public void testInsertionSortFloatingPointNumbers() {
    final Double[] data = {3.1, 2.4, 5.5, 1.1, 3.0};
    InsertionSort.insertionSort(data);
    assertEquals("[1.1, 2.4, 3.0, 3.1, 5.5]", Arrays.toString(data));
  }

  // Justification: Tests SelectionSort on a typical unsorted array to ensure correct sorting behavior.
  @Test
  public void testSelectionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Validates SelectionSort on an already sorted array to ensure stability and no unnecessary operations.
  @Test
  public void testSelectionSortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    SelectionSort.selectionSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  // Justification: Ensures SelectionSort correctly handles arrays with duplicate elements.
  @Test
  public void testSelectionSortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Verifies SelectionSort's ability to handle null input, ensuring proper exception handling.
  @Test(expected = IllegalArgumentException.class)
  public void testSelectionSortNullArray() {
    SelectionSort.selectionSort(null);
  }

  // Justification: Tests SelectionSort with a single-element array to confirm correct handling of minimal input.
  @Test
  public void testSelectionSortSingleItem() {
    final Integer[] data = {4};
    SelectionSort.selectionSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

  // Justification: Evaluates SelectionSort's performance on a large array for scalability and efficiency.
  @Test
  public void testSelectionSortLargeArray() {
    int largeSize = 100000;
    Integer[] largeArray = new Integer[largeSize];
    Integer[] expectedArray = new Integer[largeSize];

    for (int i = 0; i < largeSize; i++) {
      largeArray[i] = largeSize - i;
      expectedArray[i] = i + 1;
    }

    SelectionSort.selectionSort(largeArray);

    assertArrayEquals(expectedArray, largeArray);
  }

  // Justification: Confirms SelectionSort's behavior with an empty array to ensure no errors are thrown.
  @Test
  public void testSelectionSortEmptyArray() {
    final Integer[] data = {};
    SelectionSort.selectionSort(data);
    assertEquals("[]", Arrays.toString(data));
  }
  
  // Justification: Tests SelectionSort with an array of identical elements to check for stability.
  @Test
  public void tesSelectionSortIdenticalElements() {
    final Integer[] data = {5, 5, 5, 5, 5};
    SelectionSort.selectionSort(data);
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(data));
  }

  // Justification: Verifies SelectionSort's ability to handle arrays with negative numbers, testing equivalence partitioning.
  @Test
  public void testSelectionSortNegativeNumbers() {
    final Integer[] data = {-3, -1, -7, -4, 0, -2};
    SelectionSort.selectionSort(data);
    assertEquals("[-7, -4, -3, -2, -1, 0]", Arrays.toString(data));
  }

  // Justification: Ensures SelectionSort handles a mix of positive and negative numbers appropriately.
  @Test
  public void testSelectionSortMixedNumbers() {
    final Integer[] data = {-3, 4, -1, 7, 0, -5, 2};
    SelectionSort.selectionSort(data);
    assertEquals("[-5, -3, -1, 0, 2, 4, 7]", Arrays.toString(data));
  }

  // Justification: Tests SelectionSort with floating point numbers to ensure correct sorting behavior.
  @Test
  public void testSelectionSortFloatingPointNumbers() {
    final Double[] data = {3.1, 2.4, 5.5, 1.1, 3.0};
    SelectionSort.selectionSort(data);
    assertEquals("[1.1, 2.4, 3.0, 3.1, 5.5]", Arrays.toString(data));
  }

  // Justification: Tests MergeSort on a typical unsorted array to ensure correct sorting behavior.
  @Test
  public void testMergeSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    MergeSort.mergeSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Validates MergeSort on an already sorted array to ensure stability and no unnecessary operations.
  @Test
  public void testMergeSortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    MergeSort.mergeSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  // Justification: Ensures MergeSort correctly handles arrays with duplicate elements.
  @Test
  public void testMergeSortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    MergeSort.mergeSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Verifies MergeSort's ability to handle null input, ensuring proper exception handling.
  @Test(expected = IllegalArgumentException.class)
  public void testMergeSortNullArray() {
    MergeSort.mergeSort(null);
  }

  // Justification: Tests MergeSort with a single-element array to confirm correct handling of minimal input.
  @Test
  public void testMergeSortSingleItem() {
    final Integer[] data = {4};
    MergeSort.mergeSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

  // Justification: Evaluates MergeSort's performance on a large array for scalability and efficiency.
  @Test
  public void testMergeSortLargeArray() {
    int largeSize = 100000;
    Integer[] largeArray = new Integer[largeSize];
    Integer[] expectedArray = new Integer[largeSize];

    for (int i = 0; i < largeSize; i++) {
      largeArray[i] = largeSize - i;
      expectedArray[i] = i + 1;
    }

    MergeSort.mergeSort(largeArray);

    assertArrayEquals(expectedArray, largeArray);
  }

  // Justification: Confirms MergeSort's behavior with an empty array to ensure no errors are thrown.
  @Test
  public void testMergeSortEmptyArray() {
    final Integer[] data = {};
    MergeSort.mergeSort(data);
    assertEquals("[]", Arrays.toString(data));
  }
  
  // Justification: Tests MergeSort with an array of identical elements to check for stability.
  @Test
  public void testMergeSortIdenticalElements() {
    final Integer[] data = {5, 5, 5, 5, 5};
    MergeSort.mergeSort(data);
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(data));
  }

  // Justification: Verifies MergeSort's ability to handle arrays with negative numbers, testing equivalence partitioning.
  @Test
  public void testMergeSortNegativeNumbers() {
    final Integer[] data = {-3, -1, -7, -4, 0, -2};
    MergeSort.mergeSort(data);
    assertEquals("[-7, -4, -3, -2, -1, 0]", Arrays.toString(data));
  }

  // Justification: Ensures MergeSort handles a mix of positive and negative numbers appropriately.
  @Test
  public void testMergeSortMixedNumbers() {
    final Integer[] data = {-3, 4, -1, 7, 0, -5, 2};
    MergeSort.mergeSort(data);
    assertEquals("[-5, -3, -1, 0, 2, 4, 7]", Arrays.toString(data));
  }

  // Justification: Tests Heapsort on a typical unsorted array to ensure correct sorting behavior.
  @Test
  public void testHeapsort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Heapsort.heapSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Validates Heapsort on an already sorted array to ensure stability and no unnecessary operations.
  @Test
  public void testHeapsortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    Heapsort.heapSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  // Justification: Ensures Heapsort correctly handles arrays with duplicate elements.
  @Test
  public void testHeapsortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    Heapsort.heapSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Verifies Heapsort's ability to handle null input, ensuring proper exception handling.
  @Test(expected = IllegalArgumentException.class)
  public void testHeapsortNullArray() {
    Heapsort.heapSort(null);
  }

  // Justification: Tests Heapsort with a single-element array to confirm correct handling of minimal input.
  @Test
  public void testHeapsortSingleItem() {
    final Integer[] data = {4};
    Heapsort.heapSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

  // Justification: Evaluates Heapsort's performance on a large array for scalability and efficiency.
  @Test
  public void testHeapsortLargeArray() {
    int largeSize = 100000;
    Integer[] largeArray = new Integer[largeSize];
    Integer[] expectedArray = new Integer[largeSize];

   for (int i = 0; i < largeSize; i++) {
     largeArray[i] = largeSize - i;
     expectedArray[i] = i + 1;
   }

   Heapsort.heapSort(largeArray);

   assertArrayEquals(expectedArray, largeArray);
  }

  // Justification: Confirms Heapsort's behavior with an empty array to ensure no errors are thrown.
  @Test
  public void testHeapSortEmptyArray() {
    final Integer[] data = {};
    Heapsort.heapSort(data);
    assertEquals("[]", Arrays.toString(data));
  }

  // Justification: Tests Heapsort with an array of identical elements to check for stability.
  @Test
  public void testHeapSortIdenticalElements() {
    final Integer[] data = {5, 5, 5, 5, 5};
    Heapsort.heapSort(data);
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(data));
  }

  // Justification: Verifies Heapsort's ability to handle arrays with negative numbers, testing equivalence partitioning.
  @Test
  public void testHeapSortNegativeNumbers() {
    final Integer[] data = {-3, -1, -7, -4, 0, -2};
    Heapsort.heapSort(data);
    assertEquals("[-7, -4, -3, -2, -1, 0]", Arrays.toString(data));
  }

  // Justification: Ensures Heapsort handles a mix of positive and negative numbers appropriately.
  @Test
  public void testHeapSortMixedNumbers() {
    final Integer[] data = {-3, 4, -1, 7, 0, -5, 2};
    Heapsort.heapSort(data);
    assertEquals("[-5, -3, -1, 0, 2, 4, 7]", Arrays.toString(data));
  }

  // Justification: Tests Heapsort with floating point numbers to ensure correct sorting behavior.
  @Test
  public void testHeapSortFloatingPointNumbers() {
    final Double[] data = {3.1, 2.4, 5.5, 1.1, 3.0};
    Heapsort.heapSort(data);
    assertEquals("[1.1, 2.4, 3.0, 3.1, 5.5]", Arrays.toString(data));
  }

  // Justification: Tests Quicksort on a typical unsorted array to ensure correct sorting behavior. 
  @Test
  public void testQuicksort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Validates Quicksort on an already sorted array to ensure stability and no unnecessary operations.
  @Test
  public void testQuicksortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    Quicksort.quickSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  // Justification: Ensures Quicksort correctly handles arrays with duplicate elements.
  @Test
  public void testQuicksortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  // Justification: Verifies Quicksort's ability to handle null input, ensuring proper exception handling.
  @Test(expected = IllegalArgumentException.class)
  public void testQuicksortNullArray() {
    Quicksort.quickSort(null);
  }

  // Justification: Tests Quicksort with a single-element array to confirm correct handling of minimal input.
  @Test
  public void testQuicksortSingleItem() {
    final Integer[] data = {4};
    Quicksort.quickSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

  // Justification: Evaluates Quicksort's performance on a large array for scalability and efficiency.
  @Test
  public void testQuicksortLargeArray() {
    int largeSize = 100000;
    Integer[] largeArray = new Integer[largeSize];
    Integer[] expectedArray = new Integer[largeSize];

    for (int i = 0; i < largeSize; i++) {
      largeArray[i] = largeSize - i;
      expectedArray[i] = i + 1;
    }

    Quicksort.quickSort(largeArray);

    assertArrayEquals(expectedArray, largeArray);
  }

  // Justification: Confirms Quicksort's behavior with an empty array to ensure no errors are thrown.
  @Test
  public void testQuickSortEmptyArray() {
    final Integer[] data = {};
    Quicksort.quickSort(data);
    assertEquals("[]", Arrays.toString(data));
  }

  // Justification: Tests Quicksort with an array of identical elements to check for stability.
  @Test
  public void testQuickSortIdenticalElements() {
    final Integer[] data = {5, 5, 5, 5, 5};
    Quicksort.quickSort(data);
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(data));
  }

  // Justification: Verifies Quicksort's ability to handle arrays with negative numbers, testing equivalence partitioning.
  @Test
  public void testQuickSortNegativeNumbers() {
    final Integer[] data = {-3, -1, -7, -4, 0, -2};
    Quicksort.quickSort(data);
    assertEquals("[-7, -4, -3, -2, -1, 0]", Arrays.toString(data));
  }

  // Justification: Ensures Quicksort handles a mix of positive and negative numbers appropriately.
  @Test
  public void testQuickSortMixedNumbers() {
    final Integer[] data = {-3, 4, -1, 7, 0, -5, 2};
    Quicksort.quickSort(data);
    assertEquals("[-5, -3, -1, 0, 2, 4, 7]", Arrays.toString(data));
  }

  // Justification: Tests Quicksort with floating point numbers to ensure correct sorting behavior.
  @Test
  public void testQuickSortFloatingPointNumbers() {
    final Double[] data = {3.1, 2.4, 5.5, 1.1, 3.0};
    Quicksort.quickSort(data);
    assertEquals("[1.1, 2.4, 3.0, 3.1, 5.5]", Arrays.toString(data));
  }
}
