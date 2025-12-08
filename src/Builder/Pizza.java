public class Pizza{
    private String pate;
    private String sauce;
    private String garniture;

    public Pizza(){}

    public Pizza (String pate,String sauce,String garniture){
        this.pate = pate;
        this.sauce = sauce;
        this.garniture = garniture;
    }
    public void  setPate (String pate) {
        this.pate = pate;
    }

    public void setSauce(String sauce){
        this.sauce = sauce;
    }

    public void setGarniture(String garniture){
        this.garniture = garniture;
    }

    public void print(){
        System.out.println("je suis la pizza constituee de " +this.pate + "et de" + this.sauce + "et de " +this.garniture);
    }



}


