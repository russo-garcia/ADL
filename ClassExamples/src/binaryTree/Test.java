package binaryTree;

public class Test {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(2);
        bt.add(4);
        bt.add(7);
        bt.add(1);
        bt.add(0);
        bt.add(5);
        bt.add(6);
        bt.add(42);
        bt.print();
        System.out.println("min: " + bt.min().getData());
        int k = 6;
        //System.out.println("find("+ k +") = " + bt.find(k));
        System.out.println("succ("+ k +") = " + bt.succ(k).getData());
    }
}