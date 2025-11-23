public class Test {
    public static void main(String[] args) {
        int som = Singleton.getInstance().somme(2, 5);
        System.out.printf("La somme est %d\n", som);

        Singleton s1 = Singleton.getInstance();
        s1.affiche();

        Singleton s2 = Singleton.getInstance();
        s2.affiche();
    }
}
