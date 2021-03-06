public class Main {

    public static void main(String[] args) {

//        int rec (775) {
//            if (n < 10) return n;
//            return rec(n / 10) + n % 10;
//        }
        BinaryTree<Integer> tree = new BinaryTree<>(Integer::compare);

        tree.add(52);

        tree.add(67); // right
        tree.add(64); // left
        tree.add(58); // left

        tree.add(29); // left
        tree.add(1); // left
        tree.add(1); // none

        tree.add(14); // left
        tree.add(37); // right

        tree.print();

    }
}
