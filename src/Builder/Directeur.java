public class Directeur {
    MonteurPizza MonteurPizza;
    Pizza pizza;
    public Directeur(MonteurPizza MonteurPizza){
        this.MonteurPizza = MonteurPizza;
    }

    public void construire(){
    
        MonteurPizza.creerPizza();
        MonteurPizza.monterSauce();
        MonteurPizza.monterPate();
        MonteurPizza.monterGarniture();
        pizza = MonteurPizza.getPizza();
        pizza.print();
    }


}
