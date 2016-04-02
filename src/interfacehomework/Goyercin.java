package interfacehomework;
public class Goyercin implements Ucanlar,Yeriyenler {
    String ad;
    public Goyercin(String ad){
    this.ad=ad;}

    @Override
    public void uc() {
        System.out.println("Goyercin "+ ad+" ucdu");    }

    @Override
    public void yeri() {
                System.out.println("Goyercin "+ ad+" yeridi");    }

    }
    

