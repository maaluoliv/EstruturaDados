package Tarefa6.AVL;

class Node {
    int element;
    int h;
    Node leftChild;
    Node rightChild;

    public Node() {
        leftChild = null;
        rightChild = null;
        element = 0;
        h = 0;
    }

    public Node(int element) {
        leftChild = null;
        rightChild = null;
        this.element = element;
        h = 0;
    }
}
