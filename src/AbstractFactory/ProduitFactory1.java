public class  ProduitFactory1 implements ProduitFactory{

    @Override
    public ProduitA getProduitA(){
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB(){
        return new ProduitB1();
    }

}