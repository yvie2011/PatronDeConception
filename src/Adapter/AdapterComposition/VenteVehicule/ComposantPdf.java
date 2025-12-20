package Adapter.AdapterComposition.VenteVehicule;

public class ComposantPdf {
    private String contenu;
    public ComposantPdf(String contenu){
        this.contenu=contenu;
    }


     public void pdfFixeContenu(String contenu){
        this.contenu = contenu;
     }


     public void pdfPrepareAffichage(){
        System.out.println("pdf affichage: "+ this.contenu);
     }

    public void Rafraichir(){
        System.out.println("Je suis raffraichis");
    }

    public void pdfTermineAffichage(){
        System.out.println("Affichage termine");;
    }


    public void pdfEnvoieImprimante(){
        System.out.println("pdf avec le contenu:  " +this.contenu+" envoye a l impression");
    }
}
