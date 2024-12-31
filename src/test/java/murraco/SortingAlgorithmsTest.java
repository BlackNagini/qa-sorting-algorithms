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

  @Test
  public void testBubbleSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testBubbleSortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    BubbleSort.bubbleSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  @Test
  public void testBubbleSortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBubbleSortNullArray() {
    BubbleSort.bubbleSort(null);
  }

  @Test
  public void testBubbleSortSingleItem() {
    final Integer[] data = {4};
    BubbleSort.bubbleSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

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

  @Test
  public void testInsertionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testInsertionSortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    InsertionSort.insertionSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  @Test
  public void testInsertionSortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInsertionSortNullArray() {
    InsertionSort.insertionSort(null);
  }

  @Test
  public void testInsertionSortSingleItem() {
    final Integer[] data = {4};
    InsertionSort.insertionSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

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

  @Test
  public void testSelectionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testSelectionSortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    SelectionSort.selectionSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  @Test
  public void testSelectionSortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testSelectionSortNullArray() {
    SelectionSort.selectionSort(null);
  }

  @Test
  public void testSelectionSortSingleItem() {
    final Integer[] data = {4};
    SelectionSort.selectionSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

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

  @Test
  public void testMergeSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    MergeSort.mergeSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testMergeSortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    MergeSort.mergeSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  @Test
  public void testMergeSortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    MergeSort.mergeSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testMergeSortNullArray() {
    MergeSort.mergeSort(null);
  }

  @Test
  public void testMergeSortSingleItem() {
    final Integer[] data = {4};
    MergeSort.mergeSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

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

  @Test
  public void testHeapsort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Heapsort.heapSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testHeapsortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    Heapsort.heapSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  @Test
  public void testHeapsortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    Heapsort.heapSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testHeapsortNullArray() {
    Heapsort.heapSort(null);
  }

  @Test
  public void testHeapsortSingleItem() {
    final Integer[] data = {4};
    Heapsort.heapSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

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

  @Test
  public void testQuicksort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testQuicksortAlreadySortedArray() {
    final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
    Quicksort.quickSort(data);
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data));
  }

  @Test
  public void testQuicksortDupplicate() {
    final Integer[] data = {4, 3, 3, 0, 11, 7, 5, 15, 12, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 12, 15, 99]", Arrays.toString(data));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testQuicksortNullArray() {
    Quicksort.quickSort(null);
  }

  @Test
  public void testQuicksortSingleItem() {
    final Integer[] data = {4};
    Quicksort.quickSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

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
}
