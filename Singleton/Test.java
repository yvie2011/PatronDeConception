public class Test (){
    public static void main(args string[]){
        int som= Singleton.getInstance().somme(2,5);
        System.out.println("La somme est  %d ",som);
        Singleton S1=Singleton.getInstance(2,4);
        S1.affiche()

        Singleton S2 = Singleton.getInstance(5,9);
        S2.affiche();


    }
}