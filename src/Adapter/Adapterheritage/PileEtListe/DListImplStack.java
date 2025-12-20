package Adapter.Adapterheritage.PileEtListe;

public class DListImplStack extends DList implements Stack {

    @Override
    public void push(Object o) {
        insert(o);
    }

    @Override
    public Object pop() {
        return removeLast();
    }

    @Override
    public Object top() {
        return getLast();
    }
    
    
}
