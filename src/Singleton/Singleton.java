public final class Singleton {
    private static Singleton instance = null;

    private int x;
    private int y;
    private String nom;

    private Singleton() {
        super();
    }

    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private Singleton(int x, int y, String nom){
        this.x = x;
        this.y=y;
        this.nom=nom;

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public static Singleton getInstance(int x, int y) {
        if (instance == null) {
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public static Singleton getInstance1(int x, int y, String nom) {
        if (instance == null) {
            instance = new Singleton(x, y,nom);
        }
        return instance;
    }

    // Méthode somme
    public int somme(int x, int y) {
        return x + y;
    }

    // Méthode moyenne
    public float moyenne(int x, int y) {
        return (float) somme(x, y) / 2;
    }



    // Affiche les valeurs internes x et y
    public void affiche() {
        System.out.println("\nJe suis une instance du premier constructeur , mes valeurs sont : x = " 
            + this.x + " et y = " + this.y);
    }

    public void affichage(){
        System.out.println("\nJe suis une instance du 2eme constructeur, mes valeurs sont : x = " 
            + this.x + " et y = " + this.y + "et nom = " +this.nom);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
