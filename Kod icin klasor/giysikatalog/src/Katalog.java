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
        urunler.add(new Urun(id++, "Tişört", "S", "Beyaz", 199.99));
        urunler.add(new Urun(id++, "Tişört", "S", "Mavi", 199.99));
        urunler.add(new Urun(id++, "Tişört", "S", "Yeşil", 199.99));
        urunler.add(new Urun(id++, "Tişört", "S", "Siyah", 199.99));

        urunler.add(new Urun(id++, "Tişört", "M", "Beyaz", 199.99));
        urunler.add(new Urun(id++, "Tişört", "M", "Mavi", 199.99));
        urunler.add(new Urun(id++, "Tişört", "M", "Yeşil", 199.99));
        urunler.add(new Urun(id++, "Tişört", "M", "Siyah", 199.99));

        urunler.add(new Urun(id++, "Tişört", "L", "Beyaz", 199.99));
        urunler.add(new Urun(id++, "Tişört", "L", "Mavi", 199.99));
        urunler.add(new Urun(id++, "Tişört", "L", "Yeşil", 199.99));
        urunler.add(new Urun(id++, "Tişört", "L", "Siyah", 199.99));



        urunler.add(new Urun(id++, "Kot pantolon", "S", "Beyaz", 499.99));
        urunler.add(new Urun(id++, "Kot pantolon", "S", "Mavi", 499.99));
        urunler.add(new Urun(id++, "Kot pantolon", "S", "Yeşil", 499.99));
        urunler.add(new Urun(id++, "Kot pantolon", "S", "Siyah", 499.99));

        urunler.add(new Urun(id++, "Kot pantolon", "M", "Beyaz", 499.99));
        urunler.add(new Urun(id++, "Kot pantolon", "M", "Mavi", 499.99));
        urunler.add(new Urun(id++, "Kot pantolon", "M", "Yeşil", 499.99));
        urunler.add(new Urun(id++, "Kot pantolon", "M", "Siyah", 499.99));

        urunler.add(new Urun(id++, "Kot pantolon", "L", "Beyaz", 499.99));
        urunler.add(new Urun(id++, "Kot pantolon", "L", "Mavi", 499.99));
        urunler.add(new Urun(id++, "Kot pantolon", "L", "Yeşil", 499.99));
        urunler.add(new Urun(id++, "Kot pantolon", "L", "Siyah", 499.99));



        urunler.add(new Urun(id++, "Gömlek", "S", "Beyaz", 399.99));
        urunler.add(new Urun(id++, "Gömlek", "S", "Mavi", 399.99));
        urunler.add(new Urun(id++, "Gömlek", "S", "Yeşil", 399.99));
        urunler.add(new Urun(id++, "Gömlek", "S", "Siyah", 399.99));

        urunler.add(new Urun(id++, "Gömlek", "M", "Beyaz", 399.99));
        urunler.add(new Urun(id++, "Gömlek", "M", "Mavi", 399.99));
        urunler.add(new Urun(id++, "Gömlek", "M", "Yeşil", 399.99));
        urunler.add(new Urun(id++, "Gömlek", "M", "Siyah", 399.99));

        urunler.add(new Urun(id++, "Gömlek", "L", "Beyaz", 399.99));
        urunler.add(new Urun(id++, "Gömlek", "L", "Mavi", 399.99));
        urunler.add(new Urun(id++, "Gömlek", "L", "Yeşil", 399.99));
        urunler.add(new Urun(id++, "Gömlek", "L", "Siyah", 399.99));



        urunler.add(new Urun(id++, "Ceket", "S", "Beyaz", 299.99));
        urunler.add(new Urun(id++, "Ceket", "S", "Mavi", 299.99));
        urunler.add(new Urun(id++, "Ceket", "S", "Yeşil", 299.99));
        urunler.add(new Urun(id++, "Ceket", "S", "Siyah", 299.99));

        urunler.add(new Urun(id++, "Ceket", "M", "Beyaz", 299.99));
        urunler.add(new Urun(id++, "Ceket", "M", "Mavi", 299.99));
        urunler.add(new Urun(id++, "Ceket", "M", "Yeşil", 299.99));
        urunler.add(new Urun(id++, "Ceket", "M", "Siyah", 299.99));

        urunler.add(new Urun(id++, "Ceket", "L", "Beyaz", 299.99));
        urunler.add(new Urun(id++, "Ceket","L", "Mavi", 299.99));
        urunler.add(new Urun(id++, "Ceket", "L", "Yeşil", 299.99));
        urunler.add(new Urun(id++, "Ceket", "L", "Siyah", 299.99));



        urunler.add(new Urun(id++, "Eşofman Altı", "S", "Beyaz", 249.99));
        urunler.add(new Urun(id++, "Eşofman Altı", "S", "Mavi", 249.99));
        urunler.add(new Urun(id++, "Eşofman Altı", "S", "Yeşil", 249.99));
        urunler.add(new Urun(id++, "Eşofman Altı", "S", "Siyah", 249.99));

        urunler.add(new Urun(id++, "Eşofman Altı", "M", "Beyaz", 249.99));
        urunler.add(new Urun(id++, "Eşofman Altı", "M", "Mavi", 249.99));
        urunler.add(new Urun(id++, "Eşofman Altı", "M", "Yeşil", 249.99));
        urunler.add(new Urun(id++, "Eşofman Altı", "M", "Siyah", 249.99));

        urunler.add(new Urun(id++, "Eşofman Altı", "L", "Beyaz", 249.99));
        urunler.add(new Urun(id++, "Eşofman Altı","L", "Mavi", 249.99));
        urunler.add(new Urun(id++, "Eşofman Altı", "L", "Yeşil", 249.99));
        urunler.add(new Urun(id++, "Eşofman Altı", "L", "Siyah", 249.99));



        urunler.add(new Urun(id++, "Kazak", "S", "Beyaz", 349.99));
        urunler.add(new Urun(id++, "Kazak", "S", "Mavi", 349.99));
        urunler.add(new Urun(id++, "Kazak", "S", "Yeşil", 349.99));
        urunler.add(new Urun(id++, "Kazak", "S", "Siyah", 349.99));

        urunler.add(new Urun(id++, "Kazak", "M", "Beyaz", 349.99));
        urunler.add(new Urun(id++, "Kazak", "M", "Mavi", 349.99));
        urunler.add(new Urun(id++, "Kazak", "M", "Yeşil", 349.99));
        urunler.add(new Urun(id++, "Kazak", "M", "Siyah", 349.99));

        urunler.add(new Urun(id++, "Kazak", "L", "Beyaz", 349.99));
        urunler.add(new Urun(id++, "Kazak","L", "Mavi", 349.99));
        urunler.add(new Urun(id++, "Kazak", "L", "Yeşil", 349.99));
        urunler.add(new Urun(id++, "Kazak", "L", "Siyah", 349.99));



        urunler.add(new Urun(id++, "Şort", "S", "Beyaz", 149.99));
        urunler.add(new Urun(id++, "Şort", "S", "Mavi", 149.99));
        urunler.add(new Urun(id++, "Şort", "S", "Yeşil", 149.99));
        urunler.add(new Urun(id++, "Şort", "S", "Siyah", 149.99));

        urunler.add(new Urun(id++, "Şort", "M", "Beyaz", 149.99));
        urunler.add(new Urun(id++, "Şort", "M", "Mavi", 149.99));
        urunler.add(new Urun(id++, "Şort", "M", "Yeşil", 149.99));
        urunler.add(new Urun(id++, "Şort", "M", "Siyah", 149.99));

        urunler.add(new Urun(id++, "Şort", "L", "Beyaz", 149.99));
        urunler.add(new Urun(id++, "Şort","L", "Mavi", 149.99));
        urunler.add(new Urun(id++, "Şort", "L", "Yeşil", 149.99));
        urunler.add(new Urun(id++, "Şort", "L", "Siyah", 149.99));



        urunler.add(new Urun(id++, "Mont", "S", "Beyaz", 599.99));
        urunler.add(new Urun(id++, "Mont", "S", "Mavi", 599.99));
        urunler.add(new Urun(id++, "Mont", "S", "Yeşil", 599.99));
        urunler.add(new Urun(id++, "Mont", "S", "Siyah", 599.99));

        urunler.add(new Urun(id++, "Mont", "M", "Beyaz", 599.99));
        urunler.add(new Urun(id++, "Mont", "M", "Mavi", 599.99));
        urunler.add(new Urun(id++, "Mont", "M", "Yeşil", 599.99));
        urunler.add(new Urun(id++, "Mont", "M", "Siyah", 599.99));

        urunler.add(new Urun(id++, "Mont", "L", "Beyaz", 599.99));
        urunler.add(new Urun(id++, "Mont", "L", "Mavi", 599.99));
        urunler.add(new Urun(id++, "Mont", "L", "Yeşil", 599.99));
        urunler.add(new Urun(id++, "Mont", "L", "Siyah", 599.99));



        urunler.add(new Urun(id++, "Hırka", "S", "Beyaz", 299.99));
        urunler.add(new Urun(id++, "Hırka", "S", "Mavi", 299.99));
        urunler.add(new Urun(id++, "Hırka", "S", "Yeşil", 299.99));
        urunler.add(new Urun(id++, "Hırka", "S", "Siyah", 299.99));

        urunler.add(new Urun(id++, "Hırka", "M", "Beyaz", 299.99));
        urunler.add(new Urun(id++, "Hırka", "M", "Mavi", 299.99));
        urunler.add(new Urun(id++, "Hırka", "M", "Yeşil", 299.99));
        urunler.add(new Urun(id++, "Hırka", "M", "Siyah", 299.99));

        urunler.add(new Urun(id++, "Hırka", "L", "Beyaz", 299.99));
        urunler.add(new Urun(id++, "Hırka", "L", "Mavi", 299.99));
        urunler.add(new Urun(id++, "Hırka", "L", "Yeşil", 299.99));
        urunler.add(new Urun(id++, "Hırka", "L", "Siyah", 299.99));



        urunler.add(new Urun(id++, "Yelek", "S", "Beyaz", 249.99));
        urunler.add(new Urun(id++, "Yelek", "S", "Mavi", 249.99));
        urunler.add(new Urun(id++, "Yelek", "S", "Yeşil", 249.99));
        urunler.add(new Urun(id++, "Yelek", "S", "Siyah", 249.99));

        urunler.add(new Urun(id++, "Yelek", "M", "Beyaz", 249.99));
        urunler.add(new Urun(id++, "Yelek", "M", "Mavi", 249.99));
        urunler.add(new Urun(id++, "Yelek", "M", "Yeşil", 249.99));
        urunler.add(new Urun(id++, "Yelek", "M", "Siyah", 249.99));

        urunler.add(new Urun(id++, "Yelek", "L", "Beyaz", 249.99));
        urunler.add(new Urun(id++, "Yelek", "L", "Mavi", 249.99));
        urunler.add(new Urun(id++, "Yelek", "L", "Yeşil", 249.99));
        urunler.add(new Urun(id++, "Yelek", "L", "Siyah", 249.99));
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
