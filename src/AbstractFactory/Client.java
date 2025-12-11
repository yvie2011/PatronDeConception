public class Client {
    public static void main(String[] args) {
        
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA  produitA1 = null;
        ProduitA  produitA2 = null;
        ProduitB  produitB1 = null;
        ProduitB  produitB2 = null;

        System.out.println("Deux instances de produits  de la fabrique 1");
        produitA1 = produitFactory1.getProduitA();
        produitA1.methodeA();

        produitB1 = produitFactory1.getProduitB();
        produitB1.methodeB();

        System.out.println("Deux instances de produits de la fabrique 2");
        
        produitA2 = produitFactory2.getProduitA();
        produitA2.methodeA();

        produitB2 = produitFactory2.getProduitB();
        produitB2.methodeB();
    }
}
