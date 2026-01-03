/**
 * Urun sınıfı bir ürünü temsil eder
 */
public class Urun {
    private int id;
    private String urunAdi;
    private String kategori;
    private String beden;
    private String renk;
    private double fiyat;
    private String aciklama;

    /**
     * urun sınıfın yapıcı metodu (constructor)
     */
    public Urun(int id, String urunAdi, String kategori, String beden, String renk, double fiyat, String aciklama){
        this.id = id;
        this.urunAdi = urunAdi;
        this.kategori = kategori;
        this.renk = renk;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
    }

    public int getId(){
        return id;
    }

    public String getUrunAdi(){
        return urunAdi;
    }

    public String getKategori(){
        return kategori;
    }

    public double getFiyat(){
        return fiyat;
    }

    /**
     * Ürün bilgilerini ekrana yazdırır
     */
    public void urunDetaylariniGoster(){
        System.out.println("Ürün ID:" + id);
        System.out.println("Ürün Adı:" + urunAdi);
        System.out.println("Kategori:" + kategori);
        System.out.println("Beden:" + beden);
        System.out.println("Renk:" + renk);
        System.out.println("Fiyat:" + fiyat);
        System.out.println("Açıklama:" + aciklama);
    }
}
