package Adapter.AdapterComposition.PileEtListe;

public class DListImplStack  implements Stacks {

        DList DList;
    public DListImplStack( DList DList){
    this.DList = DList;
    }

    @Override
    public void push(Object o) {
        DList.insert(o);
    }

    @Override
    public Object pop() {
        return DList.removeLast();
    }

    @Override
    public Object top() {
        return DList.getLast();
    }
    
    
}
