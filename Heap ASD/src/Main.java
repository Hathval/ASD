import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        // MaxHeapAsd heap = new MaxHeapAsd(100);
        // for (int i = 0; i<size; i++){
        //     heap.insert(in.nextInt());
        // }
        // System.out.println("Sebelum dihapus");
        // heap.printTree();
        // System.out.println("...");
        // heap.deleteRoot();
        // System.out.println("Sesudah dihapus");
        // heap.printTree();
        // System.out.println("...");

        MinHeapAsd heap = new MinHeapAsd(100);
        for (int i = 0; i < size; i++){
            heap.insert(in.nextInt());
        }
        heap.printLeaf();


    }
}
