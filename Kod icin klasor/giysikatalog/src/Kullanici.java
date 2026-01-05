// Kullanici sınıfı: Sistem kullanan kullanıcıyı temsıl eder

public class Kullanici {

    public Kullanici(){

    }

    // katalog tüm ürünleri görüntüleme metodu
    public void kataloguGoruntule(Katalog katalog){
        katalog.kataloguGoruntule();
    }

    // ürün adına göre arama yapan metot
    public void urunAra(Katalog katalog , String urunAdi){
        katalog.urunAra(urunAdi);
        }

        // Tek bir ürünün detaylarını görüntüleme metodu
    public void urunDetaylariniGoruntule(Urun urun){
        urun.urunDetaylariniGoster();
    }
}
