package interfacehomework;
public class Meymun implements Yeriyenler,Qacanlar{
    String ad;
    int yas;
    public Meymun(String ad,int yas){
    this.ad=ad;
    this.yas=yas;
    }

    @Override
    public void yeri() {
        System.out.println(yas+"-yasli meymun "+ad+" yeridi");    }

    @Override
    public void qac() {
        System.out.println(yas+"-yasli meymun "+ad+" qacdi");    }
    
    
}
