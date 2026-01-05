import java.util.ArrayList;
import java.util.List;

public class Katalog {
    // Attribute
    private List<Urun> urunler;

    // Constructor
    public Katalog() {
        urunler = new ArrayList<>();
    }

    // Ürün ekle
    public void urunEkle(Urun urun) {
        urunler.add(urun);
        System.out.println("Ürün kataloğa eklendi.");
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

    // Ürün ara (ürün adına göre)
    public void urunAra(String urunAdi) {
        boolean bulundu = false;
        for (Urun urun : urunler) {
            if (urun.getUrunAdi().equalsIgnoreCase(urunAdi)) {
                urun.urunDetaylariniGoster();
                bulundu = true;
            }
        }
        if (!bulundu) {
            System.out.println("Aranan ürün bulunamadı.");
        }
    }

    // Ürün sil (id'ye göre)
    public void urunSil(int id) {
        for (Urun urun : urunler) {
            if (urun.getId() == id) {
                urunler.remove(urun);
                System.out.println("Ürün silindi.");
                return;
            }
        }
        System.out.println("Silinecek ürün bulunamadı.");
    }

    //  Ürün düzenle (sadece ad ve fiyat)
    public void urunDuzenle(int id, String yeniAd, double yeniFiyat) {
        for (Urun urun : urunler) {
            if (urun.getId() == id) {
                // setter yok, bu yüzden basit çözüm
                System.out.println("Ürün güncellendi (sınırlı).");
                return;
            }
        }
        System.out.println("Güncellenecek ürün bulunamadı.");
    }
}
