package interfacehomework;

public class Balina implements Uzenler {
    String ad;
    int yas;
    public Balina(String ad,int yas){
    this.ad=ad;
    this.yas=yas;}

    @Override
    public void uz() {
        System.out.println(yas+"-yasli "+"balina "+ad+" uzdu");    }
    
}
