
package interfacehomework;
public class Insan implements Qacanlar,Uzenler,Yeriyenler{
    String ad;
    String soyad;
    public Insan(String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;
    }

    @Override
    public void qac() {
        System.out.println(ad+" "+soyad+" qacdi");
    }

    @Override
    public void uz() {
        System.out.println(ad+" "+soyad+" uzdu");
         }

    @Override
    public void yeri() {
        System.out.println(ad+" "+soyad+" yeridi");
    }
    
}
