package Adapter.AdapterComposition.VenteVehicule;

public class DocumentPdf  implements Document {
    private ComposantPdf outilPdf;

    public DocumentPdf(ComposantPdf outilPdf){
        this.outilPdf = outilPdf;

    }

    @Override
    public  void setContenu (String contenu){
        outilPdf.pdfFixeContenu(contenu);

    }

    @Override
    public void dessine(){
        System.out.println("DocumentPdf dessine");
    }

    @Override
    public void imprimer(){
        outilPdf.pdfEnvoieImprimante();
    }
}
