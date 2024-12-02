import at.htldornbirn._4cwi.swp.observer.NewsAgency;
import at.htldornbirn._4cwi.swp.observer.NewsChannel;


public class Main {
    public static void main(String[] args) {

        var myAgency = new NewsAgency("APA");  //var -> type inference -> automatic type recognition
        var myChannel = new NewsChannel("Orf.at");


        System.out.println(myAgency);                //System -> class, out -> attribute, println -> attribute method
        System.out.println(myChannel);
    }
}