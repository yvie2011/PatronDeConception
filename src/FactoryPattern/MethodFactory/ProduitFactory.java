public class ProduitFactory {

    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;
    public static final int TYPE_PRODUITA3 = 3;

    public ProduitA getProduitA(int typeproduit) {
        ProduitA produitA = null;

        switch (typeproduit) {
            case TYPE_PRODUITA1:
                produitA = new ProduitA1();
                break;

            case TYPE_PRODUITA2:
                produitA = new ProduitA2();
                break;

            case TYPE_PRODUITA3:
                produitA = new ProduitA3();
                break;

            default:
                throw new IllegalArgumentException("Type de produit inconnu : " + typeproduit);
        }

        return produitA;
    }

    protected ProduitA createProduitA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProduitA'");
    }
}
