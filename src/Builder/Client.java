public class Client {
    public static void main(String[] args) {
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        
        Directeur directeur = new Directeur(monteurPizzaPiquante);

        directeur.construire();
    }
    
}
