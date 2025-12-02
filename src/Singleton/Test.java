import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int som = Singleton.getInstance().somme(2, 5);
        // System.out.printf("La somme de x=2 et y=5 est : %d\n", som);


        // Singleton s1 = Singleton.getInstance(1, 2);
        // s1.affiche();


        System.out.print("Entrez la valeur de x : ");
        int x = sc.nextInt();

        System.out.print("Entrez la valeur de y : ");
        int y = sc.nextInt();

        Singleton sUser = Singleton.getInstance(x, y);
        sUser.affiche();

        
        int som = sUser.somme(x,y);
        System.out.printf("La somme de x et y est : %d\n", som);

        System.out.print("Entrez la valeur de x1 : ");
        int x1 = sc.nextInt();

        System.out.print("Entrez la valeur de y1 : ");
        int y1 = sc.nextInt();

        Singleton sing = Singleton.getInstance(x1, y1);
        sing.affiche();

        String nom = "nom de l'instance";
        Singleton s4 = Singleton.getInstance1(3, 5, nom);
        s4.affichage();


        sc.close();
    }
}
