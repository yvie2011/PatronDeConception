package Adapter.Adapterheritage.VenteVehicule;

public class DocumentHtml  implements Document{

    private String contenu;
    public DocumentHtml(String contenu){
        this.contenu = contenu;
    }

    @Override
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public void dessine() {
        System.out.println("le  contenu  desine est Html");
    }

    @Override
    public void imprimer() {
        System.out.println("le contenu" +this.contenu+ "imprime est Html");
    }
    
    
}
