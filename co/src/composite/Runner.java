package src.composite;

public class Runner {
    public static void main(String[] args) {
        Directory directoryA = new Directory("A");
        directoryA.add(new File("f1.doc"));
        directoryA.add(new File("f1.txt"));
        directoryA.add(new File("f2.xls"));

        Directory directoryB = new Directory("B");
        directoryA.add(directoryB);

        directoryA.print();
    }
}
