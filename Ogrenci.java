package Odev2;

public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisYili;
    private double gano;
    private static final int bolumKodu = 987;
    private static int girisSirasi=0;
    private String ogrenciNo;



    public Ogrenci(){this(null,null,"1999",2.0);
    }
    public Ogrenci(String ad,String bolum,String girisYili,double gano){
        if (gano < 0 || gano > 4){
            throw new IllegalArgumentException("Geçersiz Gano Değeri !! ");
        }
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
    }
    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getGirisSirasi() {
        return girisSirasi;
    }
    public String getAd() {

        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getBolum() {

        return bolum;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public String getGirisYili() {
        return girisYili;
    }
    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }
    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String ogrenciNoOlustur() {
        girisSirasi++;
        if (girisSirasi < 10){
            ogrenciNo = "" + girisYili + bolumKodu + "00" + girisSirasi;

        }else if (girisSirasi < 100){
            ogrenciNo = "" + girisYili + bolumKodu + "0" + girisSirasi;
        }else
            ogrenciNo = "" + girisYili + bolumKodu + girisSirasi;
        return ogrenciNo;

    }
    public double harcHesapla(int dersSayisi){
        double harcParasi = dersSayisi * 120;
        return harcParasi;
    }
    public double harcHesapla(int dersSayisi,double uzatma){
        double harcParasi = dersSayisi * 120 * uzatma;
        return harcParasi;
    }
    



    }





