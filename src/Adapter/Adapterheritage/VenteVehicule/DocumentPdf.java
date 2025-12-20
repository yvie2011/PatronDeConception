package Adapter.Adapterheritage.VenteVehicule;

public class DocumentPdf  extends ComposantPdf implements Document{



    public DocumentPdf(String contenu) {
        super(contenu);
    }

    @Override
    public void setContenu(String contenu) {
        super.pdfFixeContenu(contenu);
    }

    @Override
    public void dessine() {
        System.out.println("pdf dessine");
    }

    @Override
    public void imprimer() {
        super.pdfEnvoieImprimante();
    }
}