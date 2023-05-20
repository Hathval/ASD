public class MinHeapAsd {
    int[] heap;
    int maxSize = 100;
    int currentSize = 0;
  
    MinHeapAsd(int maxSize) {
      this.maxSize = maxSize;
      heap = new int[maxSize];
    }
  
    int parent(int child) {
      return (child - 1) / 2;
    }
  
    int leftChild(int parent) {
      return (parent * 2) + 1;
    }
  
    int rightChild(int parent) {
      return (parent * 2) + 2;
    }
  
    void swap(int p1, int p2) {
      int temp = heap[p1];
      heap[p1] = heap[p2];
      heap[p2] = temp;
    }
  
  
    public void insert(int value) {
      if (currentSize == 0) {
        heap[currentSize] = value;
        currentSize++;
        return;
      }
  
      heap[currentSize] = value;
      int current = currentSize;
      while (current > 0) {
        if (value < heap[parent(current)]) {
          swap(current, parent(current));
          current = parent(current);
        } else {
          break;
        }
      }
      currentSize++;
    }
  
    boolean isLeaf(int pos) {
      if (heap[leftChild(pos)] == 0 && heap[rightChild(pos)] == 0) {
        return true;
      } else {
        return false;
      }
    }
  
    void print() {
      for (int i = 0; i < currentSize; i++) {
        System.out.print(heap[i] + ", ");
      }
      System.out.println();
    }
  
    public void printTree() {
      for (int i = 0; i < currentSize  / 2; i++) {
  
        // Printing the parent and both childrens
        System.out.print(
            " PARENT : " + heap[i]
                + " LEFT CHILD : " + heap[2 * i + 1]
                + " RIGHT CHILD :" + heap[2 * i + 2]);
  
        // By here new line is required
        System.out.println();
      }
    }

    public void printLeaf(){
        for (int i = 0; i < currentSize; i++) {
            if (isLeaf(i)){
                System.out.print(heap[i] + " ");
            }
          }
    }
  }
  