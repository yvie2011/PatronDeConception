public class Client {
    public  static void main(string[] args){
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory1();

        ProduitA produitA = null;

        System.out.prinln("Utilisation de la premiere  fabrique ");
        ProduitA  produitA =  produitFactory1.getProduitA();
        ProduitA.methodeA();

        System.out.prinln("Utilisation de la deuxieme  fabrique ");
        ProduitA  produitA =  produitFactory2.getProduitA();
        ProduitA.methodeA();

        System.out.prinln("Utilisation de la dtroisieme  fabrique ");
        ProduitA  produitA =  produitFactory2.getProduitA();
        ProduitA.methodeA();




    }
}