package interfacehomework;

/**
 *
 * @author leyla
 */
public class Ordek implements Yeriyenler,Uzenler,Ucanlar{
    String ad;
    public Ordek(String ad){
    this.ad=ad;}

    @Override
    public void yeri() {
        System.out.println("ordek "+ad+" yeridi");    }

    @Override
    public void uz() {
        
        System.out.println("ordek "+ad+" uzdu");    }

    @Override
    public void uc() {
            System.out.println("ordek "+ad+" ucdu");    }

    }
    

