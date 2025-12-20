package Adapter.AdapterComposition.PileEtListe;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DList dList = new DList();
        Stacks stack = new DListImplStack(dList);

        System.out.print("Combien d'elements voulez-vous empiler ? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.print("Entrez la valeur " + i + " : ");
            String value = scanner.nextLine();
            stack.push(value);
        }

        System.out.println("\nSommet de la pile : " + stack.top());

        System.out.println("\nDepilement :");
        while (stack.top() != null) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
