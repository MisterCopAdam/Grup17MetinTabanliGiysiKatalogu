// Giysi.java
public class Giysi {
    private String ad;
    private String beden;
    private double fiyat;

    public Giysi(String ad, String beden, double fiyat) {
        this.ad = ad;
        this.beden = beden;
        this.fiyat = fiyat;
    }

    // Getter metodları (Verileri okumak için)
    public String getAd() { return ad; }
    public String getBeden() { return beden; }
    public double getFiyat() { return fiyat; }
}