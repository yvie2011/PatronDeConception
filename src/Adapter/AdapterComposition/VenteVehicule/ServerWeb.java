package Adapter.AdapterComposition.VenteVehicule;

public class ServerWeb {
    public static void main(String[] args) {

        String contenuPdf="hello je suis un document Pdf";

        String contenuHtml="hello je suis un document Html";

        System.out.println("Voici le contenuPdf utilise:"+contenuPdf);
        ComposantPdf  outilPdf = new ComposantPdf(contenuPdf);
        DocumentPdf  DocumentPdf = new DocumentPdf(outilPdf);

        System.out.println("Traitement sur les documents pdf");
        DocumentPdf.setContenu(contenuPdf);
        DocumentPdf.imprimer();
        DocumentPdf.dessine();

        System.out.println("Voici le contenuHtml utilise:"+contenuHtml);

        System.out.println("Traitement sur les documents Html");
        Document DocumentHtml = new DocumentHtml(contenuHtml);
        DocumentHtml.setContenu(contenuHtml);
        DocumentHtml.dessine();
        DocumentHtml.imprimer();


    }
    
}

