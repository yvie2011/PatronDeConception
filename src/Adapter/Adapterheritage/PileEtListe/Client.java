package Adapter.Adapterheritage.PileEtListe;

public class Client {

    public static void main(String[] args) {

        Stack stack = new DListImplStack();

        stack.push("X");
        stack.push("Y");
        stack.push("Z");

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
