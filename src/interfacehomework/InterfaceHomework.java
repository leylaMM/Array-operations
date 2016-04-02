package interfacehomework;
public class InterfaceHomework {
    public static void main(String[] args) {
        
        Insan i1= new Insan("Arif","Memmedov");
        i1.qac();
        i1.yeri();
        i1.uz();
        
        Insan i2=new Insan("Afet","Qasimova");
        i2.qac();
        i2.uz();
        i2.yeri();
        
        Ordek o1=new Ordek("Dodo");
        o1.uz();
        o1.yeri();
        o1.uc();
        
        Balina b1=new Balina("Meks",12);
        b1.uz();
        
        Meymun m1=new Meymun("Conni",6);
        m1.yeri();
        m1.qac();
        
        Goyercin g1=new Goyercin("Zerif");
        g1.uc();
        g1.yeri();
    }
    
}
