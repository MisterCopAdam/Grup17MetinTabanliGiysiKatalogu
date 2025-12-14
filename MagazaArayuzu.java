import java.util.ArrayList;
import java.util.Scanner;

public class MagazaArayuzu {

    // Scanner'ı her yerden erişilebilir yapıyoruz
    private static Scanner scanner = new Scanner(System.in);

    // Arkadaşlarının oluşturacağı liste burada tutulacak
    private static ArrayList<Giysi> giysiListesi = new ArrayList<>();

    public static void main(String[] args) {
        // Test verisi (Arkadaşların veritabanı veya dosya sistemi yapana kadar bunu kullan)
        giysiListesi.add(new Giysi("Kışlık Kaban", "L", 1500.0));
        giysiListesi.add(new Giysi("Kot Pantolon", "M", 450.50));
        giysiListesi.add(new Giysi("Basic T-Shirt", "S", 120.0));

        boolean calisiyor = true;

        baslikYazdir("MODA GİYİM MAĞAZASI - HOŞGELDİNİZ");

        while (calisiyor) {
            menuGoster();
            System.out.print("Seçiminiz: ");
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    urunleriListele();
                    break;
                case "2":
                    yeniUrunEkle();
                    break;
                case "3":
                    urunAra();
                    break;
                case "4":
                    System.out.println("\nÇıkış yapılıyor... İyi günler!");
                    calisiyor = false;
                    break;
                default:
                    hataMesajiVer("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    // --- ARAYÜZ TASARIM METOTLARI (SENİN İMZAN BURASI) ---

    // 1. Menü Seçenekleri Tasarımı
    private static void menuGoster() {
        System.out.println("\n-----------------------------");
        System.out.println("|       ANA MENÜ            |");
        System.out.println("-----------------------------");
        System.out.println("| 1. Ürünleri Listele       |");
        System.out.println("| 2. Yeni Ürün Ekle         |");
        System.out.println("| 3. Ürün Ara               |");
        System.out.println("| 4. Çıkış                  |");
        System.out.println("-----------------------------");
    }

    // 2. Tablo Şeklinde Listeleme Tasarımı (En önemli kısım)
    private static void urunleriListele() {
        baslikYazdir("ÜRÜN KATALOGU");

        if (giysiListesi.isEmpty()) {
            System.out.println("(!) Listede henüz ürün yok.");
            return;
        }

        // Başlık satırı (Sola dayalı, belirli boşluklarla)
        // %-20s: 20 karakterlik alan ayır, sola daya
        System.out.printf("%-5s %-20s %-10s %-10s\n", "NO", "ÜRÜN ADI", "BEDEN", "FİYAT");
        System.out.println("-------------------------------------------------");

        int sayac = 1;
        for (Giysi g : giysiListesi) {
            System.out.printf("%-5d %-20s %-10s %-10.2f TL\n",
                    sayac++,
                    g.getAd(),
                    g.getBeden(),
                    g.getFiyat());
        }
        System.out.println("-------------------------------------------------");
    }

    // 3. Veri Giriş Ekranı Tasarımı
    private static void yeniUrunEkle() {
        baslikYazdir("YENİ ÜRÜN EKLEME");

        System.out.print("> Ürün Adı: ");
        String ad = scanner.nextLine();

        System.out.print("> Beden (S/M/L): ");
        String beden = scanner.nextLine().toUpperCase();

        double fiyat = 0;
        try {
            System.out.print("> Fiyat: ");
            fiyat = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            hataMesajiVer("Hatalı fiyat girdiniz! İşlem iptal edildi.");
            return;
        }

        // Listeye ekleme (Arkadaşlarının yazdığı Class burada devreye giriyor)
        giysiListesi.add(new Giysi(ad, beden, fiyat));
        onayMesajiVer("Ürün başarıyla eklendi!");
    }

    // 4. Arama Ekranı
    private static void urunAra() {
        baslikYazdir("ÜRÜN ARAMA");
        System.out.print("Aranacak kelimeyi girin: ");
        String kelime = scanner.nextLine().toLowerCase();

        boolean bulundu = false;
        System.out.println("\nSonuçlar:");
        for (Giysi g : giysiListesi) {
            if (g.getAd().toLowerCase().contains(kelime)) {
                System.out.println(" * " + g.getAd() + " (" + g.getFiyat() + " TL)");
                bulundu = true;
            }
        }

        if (!bulundu) {
            hataMesajiVer("Eşleşen ürün bulunamadı.");
        }
    }

    // --- YARDIMCI GÖRSEL METOTLAR ---

    // Başlıkları süslemek için
    private static void baslikYazdir(String baslik) {
        System.out.println("\n=========================================");
        System.out.println("  " + baslik);
        System.out.println("=========================================");
    }

    // Hata mesajlarını dikkat çekici yapmak için
    private static void hataMesajiVer(String mesaj) {
        System.out.println("\n[!] HATA: " + mesaj);
    }

    // Başarı mesajları için
    private static void onayMesajiVer(String mesaj) {
        System.out.println("\n[✓] " + mesaj);
    }
}