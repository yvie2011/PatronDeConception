public class ProduitFactory{
    public static final  int  TYPE_PRODUITA1 = 1;
    public static final  int  TYPE_PRODUITA1 = 1;

    public ProduitA getProduitA(int typeproduit){
        ProduitA produitA = null;
        switch (typeproduit){
            case TYPE_PRODUITA1:
                produitA = new  ProduitA1;
                break;
            
            case TYPE_PRODUITA2:
                produitA = new  ProduitA1;
                break;

            case TYPE_PRODUITA3:
                produitA = new  ProduitA1;
                break;

            throw new  IllegalArgumentException("Type  de produit  inconnu");
                
        }

        return produitA
    }
}

