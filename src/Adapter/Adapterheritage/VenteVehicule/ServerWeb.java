package Adapter.Adapterheritage.VenteVehicule;

public class ServerWeb {
    public static void main(String[] args) {

        String contenuPdf="hello je suis un document Pdf";
        System.out.println("Voici le contenuPdf utilise:"+contenuPdf);
        System.out.println("Traitement sur les documents pdf");

        Document DocumentPdf = new DocumentPdf(contenuPdf);

        DocumentPdf.setContenu(contenuPdf);
        DocumentPdf.dessine();
        DocumentPdf.imprimer();




        String contenuHtml="hello je suis un document Html";
        System.out.println("Voici le contenuHtml utilise:"+contenuHtml);
        System.out.println("Traitement sur les documents Html");
        Document DocumentHtml = new DocumentHtml(contenuHtml);
        DocumentHtml.setContenu(contenuHtml);
        DocumentHtml.dessine();
        DocumentHtml.imprimer();

    }
}
