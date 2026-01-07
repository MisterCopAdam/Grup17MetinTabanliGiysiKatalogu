import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Katalog katalog = new Katalog();
        boolean devam = true;

        while(devam){
            System.out.println("GIYSI KATALOG MENÜSÜ");
            System.out.println("1 - Giysileri görüntüle");
            System.out.println("2 - Giysi sil");
            System.out.println("3 - Giysi düzenle");
            System.out.println("4 - Giysi ekle");
            System.out.println("0 - çıkış");

            System.out.println("Seçiminiz");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim){
                case 1 :
                    katalog.kataloguGoruntule();
                    break;

                case 2 :
                    System.out.print("Silinecek giysi ID");
                    int silId = scanner.nextInt();
                    scanner.nextLine();
                    katalog.urunSil(silId);
                    break;

                case 3 :
                    System.out.println("Düzenlenecek giysi ID");
                    int duzenleId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Yeni ad: ");
                    String ad = scanner.nextLine();

                    System.out.print("Yeni beden: ");
                    String beden = scanner.nextLine();

                    System.out.print("Yeni renk: ");
                    String renk = scanner.nextLine();

                    System.out.print("Yeni fiyat: ");
                    double fiyat = scanner.nextDouble();
                    scanner.nextLine();

                    katalog.urunDuzenle(duzenleId, ad, beden, renk, fiyat);
                    break;

                case 4 :
                    System.out.print("Ad: ");
                    String yeniAd = scanner.nextLine();

                    System.out.print("beden: ");
                    String yeniBeden = scanner.nextLine();

                    System.out.print("Renk: ");
                    String yeniRenk = scanner.nextLine();

                    System.out.print("Fiyat:");
                    double yeniFiyat = scanner.nextDouble();
                    scanner.nextLine();

                    katalog.urunEkle(yeniAd, yeniBeden, yeniRenk, yeniFiyat);
                    break;

                case 0 :
                    devam = false;
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim.");
            }
        }

        scanner.close();
    }
}