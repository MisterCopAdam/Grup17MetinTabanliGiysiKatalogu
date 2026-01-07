/**
 * Urun sınıfı bir ürünü temsil eder
 */
public class Urun {
    private int id;
    private String urunAdi;
    private String beden;
    private String renk;
    private double fiyat;

    /**
     * urun sınıfın yapıcı metodu (constructor)
     */
    public Urun(int id, String urunAdi, String beden, String renk, double fiyat){
        this.id = id;
        this.urunAdi = urunAdi;
        this.beden = beden;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    public int getId(){
        return id;
    }
    public void setUrunAdi(String urunAdi){
        this.urunAdi = urunAdi;
    }
    public void setBeden(String beden){
        this.beden = beden;
    }
    public void setRenk(String renk){
        this.renk = renk;
    }
    public void setFiyat(double fiyat){
        this.fiyat = fiyat;
    }

    /**
     * Ürün bilgilerini ekrana yazdırır
     */
    public void urunDetaylariniGoster(){
        System.out.println("Ürün ID:" + id);
        System.out.println("Ürün Adı:" + urunAdi);
        System.out.println("Beden:" + beden);
        System.out.println("Renk:" + renk);
        System.out.println("Fiyat:" + fiyat);
    }
}
