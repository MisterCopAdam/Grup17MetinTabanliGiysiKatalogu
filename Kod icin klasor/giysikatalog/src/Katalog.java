import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Katalog sınıfı giysilerin listesini ve
 * bu liste üzerinde yapılan işlemleri yönetir
 */

public class Katalog {
    // Attribute
    private List<Urun> urunler = new ArrayList<>();

    // otomatik ID için sayaç
    private int id = 1;

    /**
     * Katalog oluşturulken
     * başlangıçta bazı giysiler eklenir
     */
    public Katalog(){
        urunler.add(new Urun(id++, "Beyaz Tişört", "M", "Beyaz", 199.99));
        urunler.add(new Urun(id++, "Kot pantolon", "L", "Mavi", 499.99));
    }

    // Kataloğu görüntüle
    public void kataloguGoruntule() {
        if (urunler.isEmpty()) {
            System.out.println("Katalog boş.");
        } else {
            for (Urun urun : urunler) {
                urun.urunDetaylariniGoster();
                System.out.println("---------------------");
            }
        }
    }

    /**
     * Giysi bilgilerinin boş olup olmadığını kontrol eder
     */
    private boolean bilgileriGecerliMi(String urunAdi, String beden, String renk, double fiyat){

        if (urunAdi.equals("")){
            System.out.println("Ürün adı boş bırakılamaz.");
            return false;
        }

        if (beden.equals("")){
            System.out.println("Beden boş bırakılamaz.");
            return false;
        }

        if (renk.equals("")){
            System.out.println("Renk boş bırakılamaz.");
            return false;
        }

        if (fiyat <= 0){
            System.out.println("Fiyat 0'dan büyük olmalıdır.");
            return false;
        }

        return true;
    }

    // Ürün ekle
    public void urunEkle(String urunAdi, String beden, String renk, double fiyat) {

        if (!bilgileriGecerliMi(urunAdi, beden, renk, fiyat)){
            System.out.println("Ürün kataloğa eklenemedi.");
            return;
        }
        urunler.add(new Urun(id++, urunAdi, beden, renk, fiyat));
        System.out.println("Ürün kataloğa eklendi.");
    }

    // Ürün sil (id'ye göre)
    public void urunSil(int id) {
        for (int i = 0; i < urunler.size(); i++) {
            if (urunler.get(i).getId() == id){
                urunler.remove(i);
                System.out.println("Ürün silindi.");
                return;
            }
        }
        System.out.println("Silinecek ürün bulunamadı.");
    }

    //  Ürün düzenle (sadece ad ve fiyat)
    public void urunDuzenle(int id, String urunAdi, String beden, String renk, double fiyat) {

        if (!bilgileriGecerliMi(urunAdi, beden, renk, fiyat)){
            System.out.println("Giysi güncellenemedi.");
            return;
        }

        for (Urun urun : urunler) {
            if (urun.getId() == id) {
                urun.setUrunAdi(urunAdi);
                urun.setBeden(beden);
                urun.setRenk(renk);
                urun.setFiyat(fiyat);
                return;
            }
        }
        System.out.println("Güncellenecek ürün bulunamadı.");
    }
}
