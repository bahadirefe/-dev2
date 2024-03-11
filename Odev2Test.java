package Odev2;

public class Odev2Test {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci("Mümin","FTR","2020",1.9);
        Ogrenci ogr3 = new Ogrenci("Bahadır","Bilgisayar Mühendisliği","2023",3.30);
        Ogrenci ogr4 = new Ogrenci("Furkan","Kamu Yönetimi","2000",2.89);
        System.out.println("OGR-1 " + ogr1.getAd() + " " + ogr1.getBolum() + " " + ogr1.ogrenciNoOlustur() +" " + ogr1.getGano());
        System.out.println("OGR-2 " + ogr2.getAd() + " " + ogr2.getBolum() + " "+ ogr2.ogrenciNoOlustur() + " " + ogr2.getGano());
        System.out.println("OGR-3 " + ogr3.getAd() + " " + ogr3.getBolum() + " "+ ogr3.ogrenciNoOlustur() + " " + ogr3.getGano());
        System.out.println("OGR-4 " + ogr4.getAd() + " " + ogr4.getBolum() + " " + ogr4.ogrenciNoOlustur() + " " + ogr4.getGano());
        System.out.println("-------------------------------------------------");
        System.out.println("OGR-3 Ödenecek HARÇ : " + ogr3.harcHesapla(3));
        System.out.println("OGR-4 Ödenecek HARÇ : " + ogr4.harcHesapla(3,5));











    }
}

